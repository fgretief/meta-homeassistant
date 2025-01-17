from git import Repo
import os as os
import json as json
import csv
import shutil
import argparse
from packaging import version


def parseArguments():
    # Create argument parser
    parser = argparse.ArgumentParser()

    parser.add_argument("-v", "--version", help="HA Version", type=str, default="")
    parser.add_argument("-u", "--upgrade", help="Only print packages which need upgrading", type=str, default='n', choices=['y','n'])
    # Parse arguments
    args = parser.parse_args()

    return args


def getRepo(haPath, version):
    # Clone the HomeAssistant repository, or if it is already there initialize it
    try:
        repo = Repo.clone_from("https://github.com/home-assistant/core.git", haPath)
    except:
        repo = Repo(haPath)
    # Get the tags and sort them
    tags = sorted(repo.tags, key=lambda t: t.commit.committed_datetime)
    if version == "":
        latest_tag = tags[-1]
        version = latest_tag.name
        print("Found the following latest tag: " + version)
    else:
        print("Using tag: " + version)
    # Now that we have it, check out this branch
    repo.git.checkout(version)
    return repo, version


def parseManifests(haPath):
    componentsPath = os.path.join(haPath, "homeassistant/components")
    listOfComponents = [f.path for f in os.scandir(componentsPath) if f.is_dir()]
    manifestInfo = {}
    for component in listOfComponents:
        f = open(component + "/manifest.json")
        manifest = json.load(f)
        # Initialize manifest info as an empty dictionary
        manifestInfo[manifest["domain"]] = {}
        # Check if manifest specifies dependencies
        if "dependencies" in manifest:
            manifestInfo[manifest["domain"]]["dependencies"] = manifest["dependencies"]
        # Check if it specifies any requirements
        if "requirements" in manifest:
            manifestInfo[manifest["domain"]]["requirements"] = manifest["requirements"]
        f.close()
    return manifestInfo


def getUniquePythonRequirements(manifestInfo, csvWriter):
    # Parse manifestInfo to create unique list of requirements
    requirements = []
    for component in manifestInfo:
        if "requirements" in manifestInfo[component]:
            csvWriter.writerow([component.lower().replace(" ", "-"), manifestInfo[component]["requirements"]])
            requirements = requirements + (manifestInfo[component]["requirements"])
    requirements = list(set(requirements))
    return requirements


def compareWithLayers(requirements, haPath, layers, csvWriter, upgrade_only):
    listOfRecipes = []
    missingRecipesList = {}
    foundRecipesList = {}
    for layer in layers:
        searchPath = os.path.join(haPath, layer)
        listOfRecipes = [
            f.name.strip(".bb")
            for f in os.scandir(searchPath)
            if (f.is_file() and f.name.endswith(".bb"))
        ]

        for requirement in requirements:
            # Split requirement in name and version of package
            package = requirement.split("==")
            package[0] = "python3-" + package[0].lower().replace("_", "-")
            # Now for each requirement loop over the list of discovered recipes
            for recipe in listOfRecipes:
                recipe = recipe.split("_")
                # Case 1: check if recipe is available and is an exact match
                if package[0] + "_" + package[1] == recipe[0] + "_" + recipe[1]:
                    try:
                        del missingRecipesList[package[0]]
                    except:
                        pass
                    foundRecipesList[package[0]] = package[1]
                    if upgrade_only != 'y':
                        csvWriter.writerow([package[0], package[1], package[1], layer])
                    break
                # Case 2: if not, check if recipe is available but has a lower version
                elif package[0] == recipe[0]:
                    try:
                        del missingRecipesList[package[0]]
                    except:
                        pass
                    # Now if the needed package version is higher than the found one, and no other package has been found in a
                    # layer which is higher in the bblayers order, then add it to the list
                    if (version.parse(package[1]) > version.parse(recipe[1])) and (package[0] not in foundRecipesList):
                        csvWriter.writerow([package[0], package[1], recipe[1], layer])
                    foundRecipesList[package[0]] = package[1]
                    break
                # Case 3: There is no recipe at all
            else:
                # Didn't find it in this layer so save it until we scanned all layers
                if package[0] not in foundRecipesList:
                    missingRecipesList[package[0]] = package[1]
    # Now add all missing items to csv as well
    if upgrade_only != 'y':
        for item in missingRecipesList:
            csvWriter.writerow([item, missingRecipesList[item], "-", "-"])


def main() -> None:
    args = parseArguments()

    haPath = os.path.join(os.path.dirname(__file__), "HA")
    # First get the repository for scanning, read the manifest and distill the requirements
    repo, name = getRepo(haPath, args.version)
    with open(name + ".csv", "w") as outputFile:
        csvWriter = csv.writer(outputFile)
        csvWriter.writerow(
            [
                "Package Name",
                "Required Package Version",
                "Found Package Version",
                "Layer Located",
            ]
        )

        manifestInfo = parseManifests(haPath)
        with open(name + "-components.csv", "w") as componentFile:
            csvWriter2 = csv.writer(componentFile)
            csvWriter2.writerow(
                [
                    "Component Name",
                    "Required Package",
                ]
            )
            requirements = getUniquePythonRequirements(manifestInfo, csvWriter2)

        # Now there are multiple places where the python recipes can be found, we need to combine them
        # 1: the meta-homeassistant layer
        # 2: poky
        # 3: the openembedded layer
        layers = [
            "../../recipes-devtools/python",
            "../../recipes-homeassistant/homeassistant",
            "../../recipes-homeassistant/homeassistant-core-deps",
            "../../recipes-homeassistant/homeassistant-component-deps",
            "../../../../sources/meta-openembedded/meta-python/recipes-connectivity/python-gsocketpool",
            "../../../../sources/meta-openembedded/meta-python/recipes-connectivity/python-h2",
            "../../../../sources/meta-openembedded/meta-python/recipes-connectivity/python-hpack",
            "../../../../sources/meta-openembedded/meta-python/recipes-connectivity/python-hyperframe",
            "../../../../sources/meta-openembedded/meta-python/recipes-connectivity/python-priority",
            "../../../../sources/meta-openembedded/meta-python/recipes-connectivity/python-pyconnman",
            "../../../../sources/meta-openembedded/meta-python/recipes-connectivity/python-pyro4",
            "../../../../sources/meta-openembedded/meta-python/recipes-connectivity/python-thrift",
            "../../../../sources/meta-openembedded/meta-python/recipes-connectivity/python-txws",
            "../../../../sources/meta-openembedded/meta-python/recipes-connectivity/python3-pytun",
            "../../../../sources/meta-openembedded/meta-python/recipes-devtools/python",
            "../../../../sources/meta-openembedded/meta-python/recipes-devtools/python-jsonref",
            "../../../../sources/meta-openembedded/meta-python/recipes-devtools/python3-attrdict3",
            "../../../../sources/meta-openembedded/meta-python/recipes-devtools/python3-reedsolo",
            "../../../../sources/meta-openembedded/meta-python/recipes-devtools/python3-wxgtk4",
            "../../../../sources/meta-openembedded/meta-python/recipes-extended/python-blivet",
            "../../../../sources/meta-openembedded/meta-python/recipes-extended/python-cson",
            "../../../../sources/meta-openembedded/meta-python/recipes-extended/python-meh",
            "../../../../sources/meta-openembedded/meta-python/recipes-extended/python-pyephem",
            "../../../../sources/meta-openembedded/meta-python/recipes-extended/python-pykickstart",
            "../../../../sources/meta-openembedded/meta-python/recipes-extended/python-pyparted",
            "../../../../sources/meta-openembedded/meta-python/recipes-extended/python-rich",
            "../../../../sources/meta-openembedded/meta-python/recipes-extended/python3-portalocker",
            "../../../../sources/meta-openembedded/meta-python/recipes-extended/python3-pydot",
            "../../../../sources/meta-openembedded/meta-python/recipes-extended/pywbem",
            "../../../../sources/meta-openembedded/meta-python/recipes-extended/pywbemtools",
            "../../../../sources/meta-openembedded/meta-python/recipes-extended/send2trash",
            "../../../../sources/meta-openembedded/meta-networking/recipes-devtools/python",
            "../../../../sources/poky/meta/recipes-devtools/python",
        ]
        compareWithLayers(requirements, haPath, layers, csvWriter, args.upgrade)

        # Clean everything
        shutil.rmtree(haPath)
        print("Finished")


if __name__ == "__main__":
    main()
