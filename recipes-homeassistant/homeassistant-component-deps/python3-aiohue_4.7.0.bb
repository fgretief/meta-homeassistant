DESCRIPTION = "Python3 asyncio package to talk to Philips Hue"
HOMEPAGE = "https://github.com/home-assistant-libs/aiohue"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dab31a1d28183826937f4b152143a33f"

SRC_URI[sha256sum] = "3ca727b463e55bbe7c69b67f5503ffcd7d213c9644c4e458e3556ee6ea33855b"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-core (>=3.10) \
    ${PYTHON_PN}-aiohttp \
    ${PYTHON_PN}-asyncio-throttle \
    ${PYTHON_PN}-awesomeversion \
"