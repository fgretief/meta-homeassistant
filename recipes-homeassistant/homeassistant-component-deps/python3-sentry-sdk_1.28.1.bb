SUMMARY = "The new Python SDK for Sentry.io"
DESCRIPTION = "This is the next line of the Python SDK \
for Sentry, intended to replace the raven package on PyPI."
HOMEPAGE = "https://github.com/getsentry/sentry-python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7fcb29c83dd48cb7b112d0dd81111a89"

RDEPENDS:${PN} += "\
	${PYTHON_PN}-urllib3 \
	${PYTHON_PN}-core \
	${PYTHON_PN}-json \
	${PYTHON_PN}-logging \
	${PYTHON_PN}-threading \
	${PYTHON_PN}-compression \
	${PYTHON_PN}-datetime \
"

SRC_URI[sha256sum] = "dcd88c68aa64dae715311b5ede6502fd684f70d00a7cd4858118f0ba3153a3ae"

PYPI_PACKAGE = "sentry-sdk"

inherit pypi setuptools3
