require cog.inc
require cog-meson.inc
require conf/include/devupstream.inc

DEFAULT_PREFERENCE = "-1"

SRC_URI[sha256sum] = "37c5f14123b8dcf077839f6c60f0d721d2a91bb37829e796f420126e6b0d38b5"

SRC_URI:class-devupstream = "git://github.com/Igalia/cog.git;protocol=https;branch=cog-0.16"
SRCREV:class-devupstream = "134a13b4f39ac8e8d31a8a514a7041bdb4bc17a2"

# Required since https://github.com/Igalia/cog/commit/48dfac2ba637e223eeea1b289526d0f51e39ab88
DEPENDS:append = " libxkbcommon"

RDEPENDS:${PN} += "wpewebkit (>= 2.36)"

