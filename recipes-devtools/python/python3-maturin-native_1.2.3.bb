SUMMARY = "Build and publish crates with pyo3, rust-cpython and cffi bindings as well as rust binaries as python packages"
HOMEPAGE = "https://github.com/PyO3/maturin"
LICENSE = "Apache-2.0 | MIT"
LIC_FILES_CHKSUM = "\
    file://license-apache;md5=1836efb2eb779966696f473ee8540542 \
    file://license-mit;md5=85fd3b67069cff784d98ebfc7d5c0797 \
"

SRC_URI[sha256sum] = "ef3f42af453d64f233b99543c3001bee645019a9c2022c7972210a9cacb5301f"

SRC_URI:append = " \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/ahash/0.7.6 \
    crate://crates.io/aho-corasick/0.7.20 \
    crate://crates.io/anstream/0.3.2 \
    crate://crates.io/anstyle/1.0.1 \
    crate://crates.io/anstyle-parse/0.2.1 \
    crate://crates.io/anstyle-query/1.0.0 \
    crate://crates.io/anstyle-wincon/1.0.2 \
    crate://crates.io/anyhow/1.0.73 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/base64/0.21.2;name=base64_0.21.2 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/bstr/1.6.0 \
    crate://crates.io/bumpalo/3.13.0 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/1.4.0 \
    crate://crates.io/bytesize/1.2.0 \
    crate://crates.io/bzip2/0.4.4 \
    crate://crates.io/bzip2-sys/0.1.11+1.0.8 \
    crate://crates.io/cab/0.4.1 \
    crate://crates.io/camino/1.1.6 \
    crate://crates.io/cargo-config2/0.1.8 \
    crate://crates.io/cargo-options/0.6.0 \
    crate://crates.io/cargo-platform/0.1.3 \
    crate://crates.io/cargo-xwin/0.14.6 \
    crate://crates.io/cargo-zigbuild/0.17.0 \
    crate://crates.io/cargo_metadata/0.17.0 \
    crate://crates.io/cbindgen/0.24.5 \
    crate://crates.io/cc/1.0.82 \
    crate://crates.io/cfb/0.7.3 \
    crate://crates.io/cfg-expr/0.15.4 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/charset/0.1.3 \
    crate://crates.io/chumsky/0.9.2 \
    crate://crates.io/clap/4.1.14 \
    crate://crates.io/clap_builder/4.1.14 \
    crate://crates.io/clap_complete/4.2.3 \
    crate://crates.io/clap_complete_command/0.5.1 \
    crate://crates.io/clap_complete_fig/4.2.0 \
    crate://crates.io/clap_complete_nushell/0.1.11 \
    crate://crates.io/clap_derive/4.1.14 \
    crate://crates.io/clap_lex/0.4.1 \
    crate://crates.io/cli-table/0.4.7 \
    crate://crates.io/colorchoice/1.0.0 \
    crate://crates.io/configparser/3.0.2 \
    crate://crates.io/console/0.15.7 \
    crate://crates.io/content_inspector/0.2.4 \
    crate://crates.io/core-foundation/0.9.3 \
    crate://crates.io/core-foundation-sys/0.8.4 \
    crate://crates.io/cpufeatures/0.2.9 \
    crate://crates.io/crc32fast/1.3.2 \
    crate://crates.io/crossbeam-channel/0.5.8 \
    crate://crates.io/crossbeam-deque/0.8.3 \
    crate://crates.io/crossbeam-epoch/0.9.15 \
    crate://crates.io/crossbeam-utils/0.8.16 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/data-encoding/2.4.0 \
    crate://crates.io/dialoguer/0.10.4 \
    crate://crates.io/diff/0.1.13 \
    crate://crates.io/digest/0.10.7 \  
    crate://crates.io/dirs/5.0.1 \
    crate://crates.io/dirs-sys/0.4.1 \
    crate://crates.io/dunce/1.0.4 \
    crate://crates.io/either/1.9.0 \
    crate://crates.io/encode_unicode/0.3.6 \
    crate://crates.io/encoding_rs/0.8.32 \
    crate://crates.io/errno/0.3.2 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/fat-macho/0.4.7 \
    crate://crates.io/filetime/0.2.22 \
    crate://crates.io/flate2/1.0.27 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/form_urlencoded/1.2.0 \
    crate://crates.io/fs-err/2.9.0 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getrandom/0.2.10 \
    crate://crates.io/glob/0.3.1 \
    crate://crates.io/globset/0.4.10 \
    crate://crates.io/goblin/0.7.1 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.3.2 \
    crate://crates.io/home/0.5.5 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/humantime-serde/1.1.1 \
    crate://crates.io/idna/0.4.0 \
    crate://crates.io/ignore/0.4.20 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/indicatif/0.17.6 \
    crate://crates.io/indoc/2.0.3 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.11 \
    crate://crates.io/is-terminal/0.4.7 \
    crate://crates.io/itertools/0.11.0 \
    crate://crates.io/itoa/1.0.9 \
    crate://crates.io/js-sys/0.3.64 \
    crate://crates.io/keyring/2.0.5 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lddtree/0.3.3 \
    crate://crates.io/libc/0.2.147 \
    crate://crates.io/linux-keyutils/0.2.3 \
    crate://crates.io/linux-raw-sys/0.3.8 \
    crate://crates.io/lock_api/0.4.10 \
    crate://crates.io/log/0.4.20 \
    crate://crates.io/lzxd/0.1.4 \
    crate://crates.io/mailparse/0.14.0 \
    crate://crates.io/matchers/0.1.0 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.9.0 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/mime_guess/2.0.4 \
    crate://crates.io/minijinja/1.0.6 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.7.1 \
    crate://crates.io/msi/0.5.1 \
    crate://crates.io/multipart/0.18.0 \
    crate://crates.io/native-tls/0.2.11 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/normalize-line-endings/0.3.0 \
    crate://crates.io/normpath/1.1.1 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/number_prefix/0.4.0 \
    crate://crates.io/once_cell/1.18.0 \
    crate://crates.io/openssl/0.10.56 \
    crate://crates.io/openssl-macros/0.1.1 \
    crate://crates.io/openssl-probe/0.1.5 \
    crate://crates.io/openssl-src/111.27.0+1.1.1v \
    crate://crates.io/openssl-sys/0.9.91 \
    crate://crates.io/option-ext/0.2.0 \
    crate://crates.io/os_pipe/1.1.4 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.8 \
    crate://crates.io/paste/1.0.14 \
    crate://crates.io/path-slash/0.2.1 \
    crate://crates.io/pep440_rs/0.3.6 \
    crate://crates.io/pep508_rs/0.2.1 \
    crate://crates.io/percent-encoding/2.3.0 \
    crate://crates.io/pin-project-lite/0.2.12 \
    crate://crates.io/pkg-config/0.3.27 \
    crate://crates.io/plain/0.2.3 \
    crate://crates.io/platform-info/2.0.2 \
    crate://crates.io/portable-atomic/1.4.2 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/pretty_assertions/1.4.0 \
    crate://crates.io/proc-macro2/1.0.66 \
    crate://crates.io/psm/0.1.21 \
    crate://crates.io/pyproject-toml/0.6.1 \
    crate://crates.io/python-pkginfo/0.6.0 \
    crate://crates.io/quote/1.0.32 \
    crate://crates.io/quoted_printable/0.4.8 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rayon/1.7.0 \
    crate://crates.io/rayon-core/1.11.0 \
    crate://crates.io/redox_syscall/0.2.16;name=redox_syscall_0.2.16 \
    crate://crates.io/redox_syscall/0.3.5 \
    crate://crates.io/redox_users/0.4.3 \
    crate://crates.io/regex/1.7.3 \
    crate://crates.io/regex-automata/0.1.10 \
    crate://crates.io/regex-syntax/0.6.29 \
    crate://crates.io/rfc2047-decoder/0.2.2 \
    crate://crates.io/ring/0.16.20 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustix/0.37.23 \
    crate://crates.io/rustls/0.21.2 \
    crate://crates.io/rustls-pemfile/1.0.3 \
    crate://crates.io/rustls-webpki/0.100.1 \
    crate://crates.io/rustversion/1.0.14 \
    crate://crates.io/ryu/1.0.15 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/schannel/0.1.22 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/scroll/0.11.0 \
    crate://crates.io/scroll_derive/0.11.1 \
    crate://crates.io/sct/0.7.0 \
    crate://crates.io/security-framework/2.9.2 \
    crate://crates.io/security-framework-sys/2.9.1 \
    crate://crates.io/semver/1.0.18 \
    crate://crates.io/serde/1.0.183 \
    crate://crates.io/serde_derive/1.0.183 \
    crate://crates.io/serde_json/1.0.104 \
    crate://crates.io/serde_spanned/0.6.3 \
    crate://crates.io/sha2/0.10.7 \
    crate://crates.io/sharded-slab/0.1.4 \
    crate://crates.io/shell-escape/0.1.5 \
    crate://crates.io/shell-words/1.1.0 \
    crate://crates.io/shlex/1.1.0 \
    crate://crates.io/similar/2.2.1 \
    crate://crates.io/smallvec/1.11.0 \
    crate://crates.io/smawk/0.3.1 \
    crate://crates.io/snapbox/0.4.11 \
    crate://crates.io/snapbox-macros/0.3.4 \
    crate://crates.io/socks/0.3.4 \
    crate://crates.io/spin/0.5.2 \
    crate://crates.io/stacker/0.1.15 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.28;name=syn_2.0.28 \
    crate://crates.io/tar/0.4.40 \
    crate://crates.io/target-lexicon/0.12.11 \
    crate://crates.io/tempfile/3.6.0 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/terminal_size/0.2.6 \
    crate://crates.io/textwrap/0.16.0 \
    crate://crates.io/thiserror/1.0.45 \
    crate://crates.io/thiserror-impl/1.0.45 \
    crate://crates.io/thread_local/1.1.7 \
    crate://crates.io/time/0.3.20 \
    crate://crates.io/time-core/0.1.0 \
    crate://crates.io/time-macros/0.2.8 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/toml/0.5.11 \
    crate://crates.io/toml/0.7.4;name=toml_0.7.4 \
    crate://crates.io/toml_datetime/0.6.2 \
    crate://crates.io/toml_edit/0.19.10 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/tracing-attributes/0.1.26 \
    crate://crates.io/tracing-core/0.1.31 \
    crate://crates.io/tracing-log/0.1.3 \
    crate://crates.io/tracing-serde/0.1.3 \
    crate://crates.io/tracing-subscriber/0.3.17 \
    crate://crates.io/trycmd/0.14.16 \
    crate://crates.io/twox-hash/1.6.3 \
    crate://crates.io/typenum/1.16.0 \
    crate://crates.io/unicase/2.6.0 \
    crate://crates.io/unicode-bidi/0.3.13 \
    crate://crates.io/unicode-ident/1.0.11 \
    crate://crates.io/unicode-linebreak/0.1.5 \
    crate://crates.io/unicode-normalization/0.1.22 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/untrusted/0.7.1 \
    crate://crates.io/ureq/2.7.1 \
    crate://crates.io/url/2.4.0 \
    crate://crates.io/utf8parse/0.2.1\
    crate://crates.io/uuid/1.4.1 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/versions/5.0.1 \
    crate://crates.io/wait-timeout/0.2.0 \
    crate://crates.io/walkdir/2.3.3 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen/0.2.87 \
    crate://crates.io/wasm-bindgen-backend/0.2.87 \
    crate://crates.io/wasm-bindgen-macro/0.2.87 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.87 \
    crate://crates.io/wasm-bindgen-shared/0.2.87 \
    crate://crates.io/web-sys/0.3.64 \
    crate://crates.io/webpki-roots/0.23.1 \
    crate://crates.io/which/4.4.0 \
    crate://crates.io/wild/2.1.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/windows-sys/0.45.0;name=windows-sys_0.45.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.42.2 \
    crate://crates.io/windows-targets/0.48.2;name=windows-targets_0.48.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.2;name=windows_aarch64_gnullvm_0.48.2 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.48.2;name=windows_aarch64_msvc_0.48.2 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.48.2;name=windows_i686_gnu_0.48.2 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.48.2;name=windows_i686_msvc_0.48.2 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.48.2;name=windows_x86_64_gnu_0.48.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.2;name=windows_x86_64_gnullvm_0.48.2 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.48.2;name=windows_x86_64_msvc_0.48_2 \
    crate://crates.io/winnow/0.4.7 \
    crate://crates.io/xattr/1.0.1 \
    crate://crates.io/xwin/0.2.14 \
    crate://crates.io/yansi/0.5.1 \
    crate://crates.io/zeroize/1.6.0 \
    crate://crates.io/zip/0.6.6 \
"

SRC_URI[adler-1.0.2.sha256sum] = "f26201604c87b1e01bd3d98f8d5d9a8fcbb815e8cedb41ffccbeb4bf593a35fe"
SRC_URI[ahash-0.7.6.sha256sum] = "fcb51a0695d8f838b1ee009b3fbf66bda078cd64590202a864a8f3e8c4315c47"
SRC_URI[aho-corasick-0.7.20.sha256sum] = "cc936419f96fa211c1b9166887b38e5e40b19958e5b895be7c1f93adec7071ac"
SRC_URI[anstream-0.3.2.sha256sum] = "0ca84f3628370c59db74ee214b3263d58f9aadd9b4fe7e711fd87dc452b7f163"
SRC_URI[anstyle-1.0.1.sha256sum] = "3a30da5c5f2d5e72842e00bcb57657162cdabef0931f40e2deb9b4140440cecd"
SRC_URI[anstyle-parse-0.2.1.sha256sum] = "938874ff5980b03a87c5524b3ae5b59cf99b1d6bc836848df7bc5ada9643c333"
SRC_URI[anstyle-query-1.0.0.sha256sum] = "5ca11d4be1bab0c8bc8734a9aa7bf4ee8316d462a08c6ac5052f888fef5b494b"
SRC_URI[anstyle-wincon-1.0.2.sha256sum] = "c677ab05e09154296dd37acecd46420c17b9713e8366facafa8fc0885167cf4c"
SRC_URI[anyhow-1.0.73.sha256sum] = "f768393e7fabd388fe8409b13faa4d93ab0fef35db1508438dfdb066918bcf38"
SRC_URI[autocfg-1.1.0.sha256sum] = "d468802bab17cbc0cc575e9b053f41e72aa36bfa6b7f55e3529ffa43161b97fa"
SRC_URI[base64-0.13.1.sha256sum] = "9e1b586273c5702936fe7b7d6896644d8be71e6314cfe09d3167c95f712589e8"
SRC_URI[base64_0.21.2.sha256sum] = "604178f6c5c21f02dc555784810edfb88d34ac2c73b2eae109655649ee73ce3d"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[block-buffer-0.10.4.sha256sum] = "3078c7629b62d3f0439517fa394996acacc5cbc91c5a20d8c658e77abd503a71"
SRC_URI[bstr-1.6.0.sha256sum] = "6798148dccfbff0fae41c7574d2fa8f1ef3492fba0face179de5d8d447d67b05"
SRC_URI[bumpalo-3.13.0.sha256sum] = "a3e2c3daef883ecc1b5d58c15adae93470a91d425f3532ba1695849656af3fc1"
SRC_URI[byteorder-1.4.3.sha256sum] = "14c189c53d098945499cdfa7ecc63567cf3886b3332b312a5b4585d8d3a6a610"
SRC_URI[bytes-1.4.0.sha256sum] = "89b2fd2a0dcf38d7971e2194b6b6eebab45ae01067456a7fd93d5547a61b70be"
SRC_URI[bytesize-1.2.0.sha256sum] = "38fcc2979eff34a4b84e1cf9a1e3da42a7d44b3b690a40cdcb23e3d556cfb2e5"
SRC_URI[bzip2-0.4.4.sha256sum] = "bdb116a6ef3f6c3698828873ad02c3014b3c85cadb88496095628e3ef1e347f8"
SRC_URI[bzip2-sys-0.1.11+1.0.8.sha256sum] = "736a955f3fa7875102d57c82b8cac37ec45224a07fd32d58f9f7a186b6cd4cdc"
SRC_URI[cab-0.4.1.sha256sum] = "ae6b4de23c7d39c0631fd3cc952d87951c86c75a13812d7247cb7a896e7b3551"
SRC_URI[camino-1.1.6.sha256sum] = "c59e92b5a388f549b863a7bea62612c09f24c8393560709a54558a9abdfb3b9c"
SRC_URI[cargo-config2-0.1.8.sha256sum] = "41d622c3fcbf7cbd550bd4df0cd519724857608af8c1d16599e5d42f9af4abef"
SRC_URI[cargo-options-0.6.0.sha256sum] = "9b8e8daa6b2b84aa7cccd57317d9a9b36d969d75bb95923471f4eabbd36f2955"
SRC_URI[cargo-platform-0.1.3.sha256sum] = "2cfa25e60aea747ec7e1124f238816749faa93759c6ff5b31f1ccdda137f4479"
SRC_URI[cargo-xwin-0.14.6.sha256sum] = "8a3496410423935e28df3dec1ada46ad1220de36100a2f56da688062de267c38"
SRC_URI[cargo-zigbuild-0.17.0.sha256sum] = "6179a09a49d0bacac42e82c3f4bd2ba698576aebc5d708f546f7fa78f582abb2"
SRC_URI[cargo_metadata-0.17.0.sha256sum] = "e7daec1a2a2129eeba1644b220b4647ec537b0b5d4bfd6876fcc5a540056b592"
SRC_URI[cbindgen-0.24.5.sha256sum] = "4b922faaf31122819ec80c4047cc684c6979a087366c069611e33649bf98e18d"
SRC_URI[cc-1.0.82.sha256sum] = "305fe645edc1442a0fa8b6726ba61d422798d37a52e12eaecf4b022ebbb88f01"
SRC_URI[cfb-0.7.3.sha256sum] = "d38f2da7a0a2c4ccf0065be06397cc26a81f4e528be095826eee9d4adbb8c60f"
SRC_URI[cfg-expr-0.15.4.sha256sum] = "b40ccee03b5175c18cde8f37e7d2a33bcef6f8ec8f7cc0d81090d1bb380949c9"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[charset-0.1.3.sha256sum] = "18e9079d1a12a2cc2bffb5db039c43661836ead4082120d5844f02555aca2d46"
SRC_URI[chumsky-0.9.2.sha256sum] = "23170228b96236b5a7299057ac284a321457700bc8c41a4476052f0f4ba5349d"
SRC_URI[clap-4.1.14.sha256sum] = "906f7fe1da4185b7a282b2bc90172a496f9def1aca4545fe7526810741591e14"
SRC_URI[clap_builder-4.1.14.sha256sum] = "351f9ad9688141ed83dfd8f5fb998a06225ef444b48ff4dc43de6d409b7fd10b"
SRC_URI[clap_complete-4.2.3.sha256sum] = "1594fe2312ec4abf402076e407628f5c313e54c32ade058521df4ee34ecac8a8"
SRC_URI[clap_complete_command-0.5.1.sha256sum] = "183495371ea78d4c9ff638bfc6497d46fed2396e4f9c50aebc1278a4a9919a3d"
SRC_URI[clap_complete_fig-4.2.0.sha256sum] = "f3af28956330989baa428ed4d3471b853715d445c62de21b67292e22cf8a41fa"
SRC_URI[clap_complete_nushell-0.1.11.sha256sum] = "5d02bc8b1a18ee47c4d2eec3fb5ac034dc68ebea6125b1509e9ccdffcddce66e"
SRC_URI[clap_derive-4.1.14.sha256sum] = "81d7dc0031c3a59a04fc2ba395c8e2dd463cba1859275f065d225f6122221b45"
SRC_URI[clap_lex-0.4.1.sha256sum] = "8a2dd5a6fe8c6e3502f568a6353e5273bbb15193ad9a89e457b9970798efbea1"
SRC_URI[cli-table-0.4.7.sha256sum] = "adfbb116d9e2c4be7011360d0c0bee565712c11e969c9609b25b619366dc379d"
SRC_URI[colorchoice-1.0.0.sha256sum] = "acbf1af155f9b9ef647e42cdc158db4b64a1b61f743629225fde6f3e0be2a7c7"
SRC_URI[configparser-3.0.2.sha256sum] = "5458d9d1a587efaf5091602c59d299696a3877a439c8f6d461a2d3cce11df87a"
SRC_URI[console-0.15.7.sha256sum] = "c926e00cc70edefdc64d3a5ff31cc65bb97a3460097762bd23afb4d8145fccf8"
SRC_URI[content_inspector-0.2.4.sha256sum] = "b7bda66e858c683005a53a9a60c69a4aca7eeaa45d124526e389f7aec8e62f38"
SRC_URI[core-foundation-0.9.3.sha256sum] = "194a7a9e6de53fa55116934067c844d9d749312f75c6f6d0980e8c252f8c2146"
SRC_URI[core-foundation-sys-0.8.4.sha256sum] = "e496a50fda8aacccc86d7529e2c1e0892dbd0f898a6b5645b5561b89c3210efa"
SRC_URI[cpufeatures-0.2.9.sha256sum] = "a17b76ff3a4162b0b27f354a0c87015ddad39d35f9c0c36607a3bdd175dde1f1"
SRC_URI[crc32fast-1.3.2.sha256sum] = "b540bd8bc810d3885c6ea91e2018302f68baba2129ab3e88f32389ee9370880d"
SRC_URI[crossbeam-channel-0.5.8.sha256sum] = "a33c2bf77f2df06183c3aa30d1e96c0695a313d4f9c453cc3762a6db39f99200"
SRC_URI[crossbeam-deque-0.8.3.sha256sum] = "ce6fd6f855243022dcecf8702fef0c297d4338e226845fe067f6341ad9fa0cef"
SRC_URI[crossbeam-epoch-0.9.15.sha256sum] = "ae211234986c545741a7dc064309f67ee1e5ad243d0e48335adc0484d960bcc7"
SRC_URI[crossbeam-utils-0.8.16.sha256sum] = "5a22b2d63d4d1dc0b7f1b6b2747dd0088008a9be28b6ddf0b1e7d335e3037294"
SRC_URI[crypto-common-0.1.6.sha256sum] = "1bfb12502f3fc46cca1bb51ac28df9d618d813cdc3d2f25b9fe775a34af26bb3"
SRC_URI[data-encoding-2.4.0.sha256sum] = "c2e66c9d817f1720209181c316d28635c050fa304f9c79e47a520882661b7308"
SRC_URI[dialoguer-0.10.4.sha256sum] = "59c6f2989294b9a498d3ad5491a79c6deb604617378e1cdc4bfc1c1361fe2f87"
SRC_URI[diff-0.1.13.sha256sum] = "56254986775e3233ffa9c4d7d3faaf6d36a2c09d30b20687e9f88bc8bafc16c8"
SRC_URI[digest-0.10.7.sha256sum] = "9ed9a281f7bc9b7576e61468ba615a66a5c8cfdff42420a70aa82701a3b1e292"
SRC_URI[dirs-5.0.1.sha256sum] = "44c45a9d03d6676652bcb5e724c7e988de1acad23a711b5217ab9cbecbec2225"
SRC_URI[dirs-sys-0.4.1.sha256sum] = "520f05a5cbd335fae5a99ff7a6ab8627577660ee5cfd6a94a6a929b52ff0321c"
SRC_URI[dunce-1.0.4.sha256sum] = "56ce8c6da7551ec6c462cbaf3bfbc75131ebbfa1c944aeaa9dab51ca1c5f0c3b"
SRC_URI[either-1.9.0.sha256sum] = "a26ae43d7bcc3b814de94796a5e736d4029efb0ee900c12e2d54c993ad1a1e07"
SRC_URI[encode_unicode-0.3.6.sha256sum] = "a357d28ed41a50f9c765dbfe56cbc04a64e53e5fc58ba79fbc34c10ef3df831f"
SRC_URI[encoding_rs-0.8.32.sha256sum] = "071a31f4ee85403370b58aca746f01041ede6f0da2730960ad001edc2b71b394"
SRC_URI[errno-0.3.2.sha256sum] = "6b30f669a7961ef1631673d2766cc92f52d64f7ef354d4fe0ddfd30ed52f0f4f"
SRC_URI[errno-dragonfly-0.1.2.sha256sum] = "aa68f1b12764fab894d2755d2518754e71b4fd80ecfb822714a1206c2aab39bf"
SRC_URI[fastrand-1.9.0.sha256sum] = "e51093e27b0797c359783294ca4f0a911c270184cb10f85783b118614a1501be"
SRC_URI[fat-macho-0.4.7.sha256sum] = "63fa117c7dcabeb8c83d5c229764cfa46518545d2dba5a9a08912014711f997b"
SRC_URI[filetime-0.2.22.sha256sum] = "d4029edd3e734da6fe05b6cd7bd2960760a616bd2ddd0d59a0124746d6272af0"
SRC_URI[flate2-1.0.27.sha256sum] = "c6c98ee8095e9d1dcbf2fcc6d95acccb90d1c81db1e44725c6a984b1dbdfb010"
SRC_URI[fnv-1.0.7.sha256sum] = "3f9eec918d3f24069decb9af1554cad7c880e2da24a9afd88aca000531ab82c1"
SRC_URI[foreign-types-0.3.2.sha256sum] = "f6f339eb8adc052cd2ca78910fda869aefa38d22d5cb648e6485e4d3fc06f3b1"
SRC_URI[foreign-types-shared-0.1.1.sha256sum] = "00b0228411908ca8685dba7fc2cdd70ec9990a6e753e89b6ac91a84c40fbaf4b"
SRC_URI[form_urlencoded-1.2.0.sha256sum] = "a62bc1cf6f830c2ec14a513a9fb124d0a213a629668a4186f329db21fe045652"
SRC_URI[fs-err-2.9.0.sha256sum] = "0845fa252299212f0389d64ba26f34fa32cfe41588355f21ed507c59a0f64541"
SRC_URI[generic-array-0.14.7.sha256sum] = "85649ca51fd72272d7821adaf274ad91c288277713d9c18820d8499a7ff69e9a"
SRC_URI[getrandom-0.2.10.sha256sum] = "be4136b2a15dd319360be1c07d9933517ccf0be8f16bf62a3bee4f0d618df427"
SRC_URI[glob-0.3.1.sha256sum] = "d2fabcfbdc87f4758337ca535fb41a6d701b65693ce38287d856d1674551ec9b"
SRC_URI[globset-0.4.10.sha256sum] = "029d74589adefde59de1a0c4f4732695c32805624aec7b68d91503d4dba79afc"
SRC_URI[goblin-0.7.1.sha256sum] = "f27c1b4369c2cd341b5de549380158b105a04c331be5db9110eef7b6d2742134"
SRC_URI[hashbrown-0.12.3.sha256sum] = "8a9ee70c43aaf417c914396645a0fa852624801b24ebb7ae78fe8272889ac888"
SRC_URI[heck-0.4.1.sha256sum] = "95505c38b4572b2d910cecb0281560f54b440a19336cbbcb27bf6ce6adc6f5a8"
SRC_URI[hermit-abi-0.3.2.sha256sum] = "443144c8cdadd93ebf52ddb4056d257f5b52c04d3c804e657d19eb73fc33668b"
SRC_URI[home-0.5.5.sha256sum] = "5444c27eef6923071f7ebcc33e3444508466a76f7a2b93da00ed6e19f30c1ddb"
SRC_URI[humantime-2.1.0.sha256sum] = "9a3a5bfb195931eeb336b2a7b4d761daec841b97f947d34394601737a7bba5e4"
SRC_URI[humantime-serde-1.1.1.sha256sum] = "57a3db5ea5923d99402c94e9feb261dc5ee9b4efa158b0315f788cf549cc200c"
SRC_URI[idna-0.4.0.sha256sum] = "7d20d6b07bfbc108882d88ed8e37d39636dcc260e15e30c45e6ba089610b917c"
SRC_URI[ignore-0.4.20.sha256sum] = "dbe7873dab538a9a44ad79ede1faf5f30d49f9a5c883ddbab48bce81b64b7492"
SRC_URI[indexmap-1.9.3.sha256sum] = "bd070e393353796e801d209ad339e89596eb4c8d430d18ede6a1cced8fafbd99"
SRC_URI[indicatif-0.17.6.sha256sum] = "0b297dc40733f23a0e52728a58fa9489a5b7638a324932de16b41adc3ef80730"
SRC_URI[indoc-2.0.3.sha256sum] = "2c785eefb63ebd0e33416dfcb8d6da0bf27ce752843a45632a67bf10d4d4b5c4"
SRC_URI[instant-0.1.12.sha256sum] = "7a5bbe824c507c5da5956355e86a746d82e0e1464f65d862cc5e71da70e94b2c"
SRC_URI[io-lifetimes-1.0.11.sha256sum] = "eae7b9aee968036d54dce06cebaefd919e4472e753296daccd6d344e3e2df0c2"
SRC_URI[is-terminal-0.4.7.sha256sum] = "adcf93614601c8129ddf72e2d5633df827ba6551541c6d8c59520a371475be1f"
SRC_URI[itertools-0.11.0.sha256sum] = "b1c173a5686ce8bfa551b3563d0c2170bf24ca44da99c7ca4bfdab5418c3fe57"
SRC_URI[itoa-1.0.9.sha256sum] = "af150ab688ff2122fcef229be89cb50dd66af9e01a4ff320cc137eecc9bacc38"
SRC_URI[js-sys-0.3.64.sha256sum] = "c5f195fe497f702db0f318b07fdd68edb16955aed830df8363d837542f8f935a"
SRC_URI[keyring-2.0.5.sha256sum] = "9549a129bd08149e0a71b2d1ce2729780d47127991bfd0a78cc1df697ec72492"
SRC_URI[lazy_static-1.4.0.sha256sum] = "e2abad23fbc42b3700f2f279844dc832adb2b2eb069b2df918f455c4e18cc646"
SRC_URI[lddtree-0.3.3.sha256sum] = "2f5bfec46830ad3a95199ae6804dfe9f51fdad43d7a95fbb6c185efa9824c295"
SRC_URI[libc-0.2.147.sha256sum] = "b4668fb0ea861c1df094127ac5f1da3409a82116a4ba74fca2e58ef927159bb3"
SRC_URI[linux-keyutils-0.2.3.sha256sum] = "3f27bb67f6dd1d0bb5ab582868e4f65052e58da6401188a08f0da09cf512b84b"
SRC_URI[linux-raw-sys-0.3.8.sha256sum] = "ef53942eb7bf7ff43a617b3e2c1c4a5ecf5944a7c1bc12d7ee39bbb15e5c1519"
SRC_URI[lock_api-0.4.10.sha256sum] = "c1cc9717a20b1bb222f333e6a92fd32f7d8a18ddc5a3191a11af45dcbf4dcd16"
SRC_URI[log-0.4.20.sha256sum] = "b5e6163cb8c49088c2c36f57875e58ccd8c87c7427f7fbd50ea6710b2f3f2e8f"
SRC_URI[lzxd-0.1.4.sha256sum] = "784462f20dddd9dfdb45de963fa4ad4a288cb10a7889ac5d2c34fb6481c6b213"
SRC_URI[mailparse-0.14.0.sha256sum] = "6b56570f5f8c0047260d1c8b5b331f62eb9c660b9dd4071a8c46f8c7d3f280aa"
SRC_URI[matchers-0.1.0.sha256sum] = "8263075bb86c5a1b1427b5ae862e8889656f126e9f77c484496e8b47cf5c5558"
SRC_URI[memchr-2.5.0.sha256sum] = "2dffe52ecf27772e601905b7522cb4ef790d2cc203488bbd0e2fe85fcb74566d"
SRC_URI[memoffset-0.9.0.sha256sum] = "5a634b1c61a95585bd15607c6ab0c4e5b226e695ff2800ba0cdccddf208c406c"
SRC_URI[mime-0.3.17.sha256sum] = "6877bb514081ee2a7ff5ef9de3281f14a4dd4bceac4c09388074a6b5df8a139a"
SRC_URI[mime_guess-2.0.4.sha256sum] = "4192263c238a5f0d0c6bfd21f336a313a4ce1c450542449ca191bb657b4642ef"
SRC_URI[minijinja-1.0.6.sha256sum] = "e436cdb19900a08197c6b874280d24f9289d127275eadc23623276e0f5ec97e9"
SRC_URI[minimal-lexical-0.2.1.sha256sum] = "68354c5c6bd36d73ff3feceb05efa59b6acb7626617f4962be322a825e61f79a"
SRC_URI[miniz_oxide-0.7.1.sha256sum] = "e7810e0be55b428ada41041c41f32c9f1a42817901b4ccf45fa3d4b6561e74c7"
SRC_URI[msi-0.5.1.sha256sum] = "eaa7bfcd0ffc3b4dc4a555e5ada4d302b4b6b5ce8d6bc07a6ea703ea63aff149"
SRC_URI[multipart-0.18.0.sha256sum] = "00dec633863867f29cb39df64a397cdf4a6354708ddd7759f70c7fb51c5f9182"
SRC_URI[native-tls-0.2.11.sha256sum] = "07226173c32f2926027b63cce4bcd8076c3552846cbe7925f3aaffeac0a3b92e"
SRC_URI[nom-7.1.3.sha256sum] = "d273983c5a657a70a3e8f2a01329822f3b8c8172b73826411a55751e404a0a4a"
SRC_URI[normalize-line-endings-0.3.0.sha256sum] = "61807f77802ff30975e01f4f071c8ba10c022052f98b3294119f3e615d13e5be"
SRC_URI[normpath-1.1.1.sha256sum] = "ec60c60a693226186f5d6edf073232bfb6464ed97eb22cf3b01c1e8198fd97f5"
SRC_URI[nu-ansi-term-0.46.0.sha256sum] = "77a8165726e8236064dbb45459242600304b42a5ea24ee2948e18e023bf7ba84"
SRC_URI[num_cpus-1.16.0.sha256sum] = "4161fcb6d602d4d2081af7c3a45852d875a03dd337a6bfdd6e06407b61342a43"
SRC_URI[number_prefix-0.4.0.sha256sum] = "830b246a0e5f20af87141b25c173cd1b609bd7779a4617d6ec582abaf90870f3"
SRC_URI[once_cell-1.18.0.sha256sum] = "dd8b5dd2ae5ed71462c540258bedcb51965123ad7e7ccf4b9a8cafaa4a63576d"
SRC_URI[openssl-0.10.56.sha256sum] = "729b745ad4a5575dd06a3e1af1414bd330ee561c01b3899eb584baeaa8def17e"
SRC_URI[openssl-macros-0.1.1.sha256sum] = "a948666b637a0f465e8564c73e89d4dde00d72d4d473cc972f390fc3dcee7d9c"
SRC_URI[openssl-probe-0.1.5.sha256sum] = "ff011a302c396a5197692431fc1948019154afc178baf7d8e37367442a4601cf"
SRC_URI[openssl-src-111.27.0+1.1.1v.sha256sum] = "06e8f197c82d7511c5b014030c9b1efeda40d7d5f99d23b4ceed3524a5e63f02"
SRC_URI[openssl-sys-0.9.91.sha256sum] = "866b5f16f90776b9bb8dc1e1802ac6f0513de3a7a7465867bfbc563dc737faac"
SRC_URI[option-ext-0.2.0.sha256sum] = "04744f49eae99ab78e0d5c0b603ab218f515ea8cfe5a456d7629ad883a3b6e7d"
SRC_URI[os_pipe-1.1.4.sha256sum] = "0ae859aa07428ca9a929b936690f8b12dc5f11dd8c6992a18ca93919f28bc177"
SRC_URI[overload-0.1.1.sha256sum] = "b15813163c1d831bf4a13c3610c05c0d03b39feb07f7e09fa234dac9b15aaf39"
SRC_URI[parking_lot-0.12.1.sha256sum] = "3742b2c103b9f06bc9fff0a37ff4912935851bee6d36f3c02bcc755bcfec228f"
SRC_URI[parking_lot_core-0.9.8.sha256sum] = "93f00c865fe7cabf650081affecd3871070f26767e7b2070a3ffae14c654b447"
SRC_URI[paste-1.0.14.sha256sum] = "de3145af08024dea9fa9914f381a17b8fc6034dfb00f3a84013f7ff43f29ed4c"
SRC_URI[path-slash-0.2.1.sha256sum] = "1e91099d4268b0e11973f036e885d652fb0b21fedcf69738c627f94db6a44f42"
SRC_URI[pep440_rs-0.3.6.sha256sum] = "3d6f6ead185985925c7e2b5ddb57ed5ef9d95835bf3994a5ce74403653898ab6"
SRC_URI[pep508_rs-0.2.1.sha256sum] = "c0713d7bb861ca2b7d4c50a38e1f31a4b63a2e2df35ef1e5855cc29e108453e2"
SRC_URI[percent-encoding-2.3.0.sha256sum] = "9b2a4787296e9989611394c33f193f676704af1686e70b8f8033ab5ba9a35a94"
SRC_URI[pin-project-lite-0.2.12.sha256sum] = "12cc1b0bf1727a77a54b6654e7b5f1af8604923edc8b81885f8ec92f9e3f0a05"
SRC_URI[pkg-config-0.3.27.sha256sum] = "26072860ba924cbfa98ea39c8c19b4dd6a4a25423dbdf219c1eca91aa0cf6964"
SRC_URI[plain-0.2.3.sha256sum] = "b4596b6d070b27117e987119b4dac604f3c58cfb0b191112e24771b2faeac1a6"
SRC_URI[platform-info-2.0.2.sha256sum] = "d6259c4860e53bf665016f1b2f46a8859cadfa717581dc9d597ae4069de6300f"
SRC_URI[portable-atomic-1.4.2.sha256sum] = "f32154ba0af3a075eefa1eda8bb414ee928f62303a54ea85b8d6638ff1a6ee9e"
SRC_URI[ppv-lite86-0.2.17.sha256sum] = "5b40af805b3121feab8a3c29f04d8ad262fa8e0561883e7653e024ae4479e6de"
SRC_URI[pretty_assertions-1.4.0.sha256sum] = "af7cee1a6c8a5b9208b3cb1061f10c0cb689087b3d8ce85fb9d2dd7a29b6ba66"
SRC_URI[proc-macro2-1.0.66.sha256sum] = "18fb31db3f9bddb2ea821cde30a9f70117e3f119938b5ee630b7403aa6e2ead9"
SRC_URI[psm-0.1.21.sha256sum] = "5787f7cda34e3033a72192c018bc5883100330f362ef279a8cbccfce8bb4e874"
SRC_URI[pyproject-toml-0.6.1.sha256sum] = "ee79feaa9d31e1c417e34219e610b67db4e786ce9b49d77dda549640abb9dc5f"
SRC_URI[python-pkginfo-0.6.0.sha256sum] = "037469c164f08c891bf6d69ca02f1d56210011451e229618669777df82124cfa"
SRC_URI[quote-1.0.32.sha256sum] = "50f3b39ccfb720540debaa0164757101c08ecb8d326b15358ce76a62c7e85965"
SRC_URI[quoted_printable-0.4.8.sha256sum] = "5a3866219251662ec3b26fc217e3e05bf9c4f84325234dfb96bf0bf840889e49"
SRC_URI[rand-0.8.5.sha256sum] = "34af8d1a0e25924bc5b7c43c079c942339d8f0a8b57c39049bef581b46327404"
SRC_URI[rand_chacha-0.3.1.sha256sum] = "e6c10a63a0fa32252be49d21e7709d4d4baf8d231c2dbce1eaa8141b9b127d88"
SRC_URI[rand_core-0.6.4.sha256sum] = "ec0be4795e2f6a28069bec0b5ff3e2ac9bafc99e6a9a7dc3547996c5c816922c"
SRC_URI[rayon-1.7.0.sha256sum] = "1d2df5196e37bcc87abebc0053e20787d73847bb33134a69841207dd0a47f03b"
SRC_URI[rayon-core-1.11.0.sha256sum] = "4b8f95bd6966f5c87776639160a66bd8ab9895d9d4ab01ddba9fc60661aebe8d"
SRC_URI[redox_syscall_0.2.16.sha256sum] = "fb5a58c1855b4b6819d59012155603f0b22ad30cad752600aadfcb695265519a"
SRC_URI[redox_syscall-0.3.5.sha256sum] = "567664f262709473930a4bf9e51bf2ebf3348f2e748ccc50dea20646858f8f29"
SRC_URI[redox_users-0.4.3.sha256sum] = "b033d837a7cf162d7993aded9304e30a83213c648b6e389db233191f891e5c2b"
SRC_URI[regex-1.7.3.sha256sum] = "8b1f693b24f6ac912f4893ef08244d70b6067480d2f1a46e950c9691e6749d1d"
SRC_URI[regex-automata-0.1.10.sha256sum] = "6c230d73fb8d8c1b9c0b3135c5142a8acee3a0558fb8db5cf1cb65f8d7862132"
SRC_URI[regex-syntax-0.6.29.sha256sum] = "f162c6dd7b008981e4d40210aca20b4bd0f9b60ca9271061b07f78537722f2e1"
SRC_URI[rfc2047-decoder-0.2.2.sha256sum] = "61fc4b4e52897c3e30b12b7e9b04461215b647fbe66f6def60dd8edbce14ec2e"
SRC_URI[ring-0.16.20.sha256sum] = "3053cf52e236a3ed746dfc745aa9cacf1b791d846bdaf412f60a8d7d6e17c8fc"
SRC_URI[rustc_version-0.4.0.sha256sum] = "bfa0f585226d2e68097d4f95d113b15b83a82e819ab25717ec0590d9584ef366"
SRC_URI[rustix-0.37.23.sha256sum] = "4d69718bf81c6127a49dc64e44a742e8bb9213c0ff8869a22c308f84c1d4ab06"
SRC_URI[rustls-0.21.2.sha256sum] = "e32ca28af694bc1bbf399c33a516dbdf1c90090b8ab23c2bc24f834aa2247f5f"
SRC_URI[rustls-pemfile-1.0.3.sha256sum] = "2d3987094b1d07b653b7dfdc3f70ce9a1da9c51ac18c1b06b662e4f9a0e9f4b2"
SRC_URI[rustls-webpki-0.100.1.sha256sum] = "d6207cd5ed3d8dca7816f8f3725513a34609c0c765bf652b8c3cb4cfd87db46b"
SRC_URI[rustversion-1.0.14.sha256sum] = "7ffc183a10b4478d04cbbbfc96d0873219d962dd5accaff2ffbd4ceb7df837f4"
SRC_URI[ryu-1.0.15.sha256sum] = "1ad4cc8da4ef723ed60bced201181d83791ad433213d8c24efffda1eec85d741"
SRC_URI[same-file-1.0.6.sha256sum] = "93fc1dc3aaa9bfed95e02e6eadabb4baf7e3078b0bd1b4d7b6b0b68378900502"
SRC_URI[schannel-0.1.22.sha256sum] = "0c3733bf4cf7ea0880754e19cb5a462007c4a8c1914bff372ccc95b464f1df88"
SRC_URI[scopeguard-1.2.0.sha256sum] = "94143f37725109f92c262ed2cf5e59bce7498c01bcc1502d7b9afe439a4e9f49"
SRC_URI[scroll-0.11.0.sha256sum] = "04c565b551bafbef4157586fa379538366e4385d42082f255bfd96e4fe8519da"
SRC_URI[scroll_derive-0.11.1.sha256sum] = "1db149f81d46d2deba7cd3c50772474707729550221e69588478ebf9ada425ae"
SRC_URI[sct-0.7.0.sha256sum] = "d53dcdb7c9f8158937a7981b48accfd39a43af418591a5d008c7b22b5e1b7ca4"
SRC_URI[security-framework-2.9.2.sha256sum] = "05b64fb303737d99b81884b2c63433e9ae28abebe5eb5045dcdd175dc2ecf4de"
SRC_URI[security-framework-sys-2.9.1.sha256sum] = "e932934257d3b408ed8f30db49d85ea163bfe74961f017f405b025af298f0c7a"
SRC_URI[semver-1.0.18.sha256sum] = "b0293b4b29daaf487284529cc2f5675b8e57c61f70167ba415a463651fd6a918"
SRC_URI[serde-1.0.183.sha256sum] = "32ac8da02677876d532745a130fc9d8e6edfa81a269b107c5b00829b91d8eb3c"
SRC_URI[serde_derive-1.0.183.sha256sum] = "aafe972d60b0b9bee71a91b92fee2d4fb3c9d7e8f6b179aa99f27203d99a4816"
SRC_URI[serde_json-1.0.104.sha256sum] = "076066c5f1078eac5b722a31827a8832fe108bed65dfa75e233c89f8206e976c"
SRC_URI[serde_spanned-0.6.3.sha256sum] = "96426c9936fd7a0124915f9185ea1d20aa9445cc9821142f0a73bc9207a2e186"
SRC_URI[sha2-0.10.7.sha256sum] = "479fb9d862239e610720565ca91403019f2f00410f1864c5aa7479b950a76ed8"
SRC_URI[sharded-slab-0.1.4.sha256sum] = "900fba806f70c630b0a382d0d825e17a0f19fcd059a2ade1ff237bcddf446b31"
SRC_URI[shell-escape-0.1.5.sha256sum] = "45bb67a18fa91266cc7807181f62f9178a6873bfad7dc788c42e6430db40184f"
SRC_URI[shell-words-1.1.0.sha256sum] = "24188a676b6ae68c3b2cb3a01be17fbf7240ce009799bb56d5b1409051e78fde"
SRC_URI[shlex-1.1.0.sha256sum] = "43b2853a4d09f215c24cc5489c992ce46052d359b5109343cbafbf26bc62f8a3"
SRC_URI[similar-2.2.1.sha256sum] = "420acb44afdae038210c99e69aae24109f32f15500aa708e81d46c9f29d55fcf"
SRC_URI[smallvec-1.11.0.sha256sum] = "62bb4feee49fdd9f707ef802e22365a35de4b7b299de4763d44bfea899442ff9"
SRC_URI[smawk-0.3.1.sha256sum] = "f67ad224767faa3c7d8b6d91985b78e70a1324408abcb1cfcc2be4c06bc06043"
SRC_URI[snapbox-0.4.11.sha256sum] = "f6bccd62078347f89a914e3004d94582e13824d4e3d8a816317862884c423835"
SRC_URI[snapbox-macros-0.3.4.sha256sum] = "eaaf09df9f0eeae82be96290918520214530e738a7fe5a351b0f24cf77c0ca31"
SRC_URI[socks-0.3.4.sha256sum] = "f0c3dbbd9ae980613c6dd8e28a9407b50509d3803b57624d5dfe8315218cd58b"
SRC_URI[spin-0.5.2.sha256sum] = "6e63cff320ae2c57904679ba7cb63280a3dc4613885beafb148ee7bf9aa9042d"
SRC_URI[stacker-0.1.15.sha256sum] = "c886bd4480155fd3ef527d45e9ac8dd7118a898a46530b7b94c3e21866259fce"
SRC_URI[static_assertions-1.1.0.sha256sum] = "a2eb9349b6444b326872e140eb1cf5e7c522154d69e7a0ffb0fb81c06b37543f"
SRC_URI[strsim-0.10.0.sha256sum] = "73473c0e59e6d5812c5dfe2a064a6444949f089e20eec9a2e5506596494e4623"
SRC_URI[syn-1.0.109.sha256sum] = "72b64191b275b66ffe2469e8af2c1cfe3bafa67b529ead792a6d0160888b4237"
SRC_URI[syn_2.0.28.sha256sum] = "04361975b3f5e348b2189d8dc55bc942f278b2d482a6a0365de5bdd62d351567"
SRC_URI[tar-0.4.40.sha256sum] = "b16afcea1f22891c49a00c751c7b63b2233284064f11a200fc624137c51e2ddb"
SRC_URI[target-lexicon-0.12.11.sha256sum] = "9d0e916b1148c8e263850e1ebcbd046f333e0683c724876bb0da63ea4373dc8a"
SRC_URI[tempfile-3.6.0.sha256sum] = "31c0432476357e58790aaa47a8efb0c5138f137343f3b5f23bd36a27e3b0a6d6"
SRC_URI[termcolor-1.2.0.sha256sum] = "be55cf8942feac5c765c2c993422806843c9a9a45d4d5c407ad6dd2ea95eb9b6"
SRC_URI[terminal_size-0.2.6.sha256sum] = "8e6bf6f19e9f8ed8d4048dc22981458ebcf406d67e94cd422e5ecd73d63b3237"
SRC_URI[textwrap-0.16.0.sha256sum] = "222a222a5bfe1bba4a77b45ec488a741b3cb8872e5e499451fd7d0129c9c7c3d"
SRC_URI[thiserror-1.0.45.sha256sum] = "dedd246497092a89beedfe2c9f176d44c1b672ea6090edc20544ade01fbb7ea0"
SRC_URI[thiserror-impl-1.0.45.sha256sum] = "7d7b1fadccbbc7e19ea64708629f9d8dccd007c260d66485f20a6d41bc1cf4b3"
SRC_URI[thread_local-1.1.7.sha256sum] = "3fdd6f064ccff2d6567adcb3873ca630700f00b5ad3f060c25b5dcfd9a4ce152"
SRC_URI[time-0.3.20.sha256sum] = "cd0cbfecb4d19b5ea75bb31ad904eb5b9fa13f21079c3b92017ebdf4999a5890"
SRC_URI[time-core-0.1.0.sha256sum] = "2e153e1f1acaef8acc537e68b44906d2db6436e2b35ac2c6b42640fff91f00fd"
SRC_URI[time-macros-0.2.8.sha256sum] = "fd80a657e71da814b8e5d60d3374fc6d35045062245d80224748ae522dd76f36"
SRC_URI[tinyvec-1.6.0.sha256sum] = "87cc5ceb3875bb20c2890005a4e226a4651264a5c75edb2421b52861a0a0cb50"
SRC_URI[tinyvec_macros-0.1.1.sha256sum] = "1f3ccbac311fea05f86f61904b462b55fb3df8837a366dfc601a0161d0532f20"
SRC_URI[toml-0.5.11.sha256sum] = "f4f7f0dd8d50a853a531c426359045b1998f04219d88799810762cd4ad314234"
SRC_URI[toml_0.7.4.sha256sum] = "d6135d499e69981f9ff0ef2167955a5333c35e36f6937d382974566b3d5b94ec"
SRC_URI[toml_datetime-0.6.2.sha256sum] = "5a76a9312f5ba4c2dec6b9161fdf25d87ad8a09256ccea5a556fef03c706a10f"
SRC_URI[toml_edit-0.19.10.sha256sum] = "2380d56e8670370eee6566b0bfd4265f65b3f432e8c6d85623f728d4fa31f739"
SRC_URI[tracing-0.1.37.sha256sum] = "8ce8c33a8d48bd45d624a6e523445fd21ec13d3653cd51f681abf67418f54eb8"
SRC_URI[tracing-attributes-0.1.26.sha256sum] = "5f4f31f56159e98206da9efd823404b79b6ef3143b4a7ab76e67b1751b25a4ab"
SRC_URI[tracing-core-0.1.31.sha256sum] = "0955b8137a1df6f1a2e9a37d8a6656291ff0297c1a97c24e0d8425fe2312f79a"
SRC_URI[tracing-log-0.1.3.sha256sum] = "78ddad33d2d10b1ed7eb9d1f518a5674713876e97e5bb9b7345a7984fbb4f922"
SRC_URI[tracing-serde-0.1.3.sha256sum] = "bc6b213177105856957181934e4920de57730fc69bf42c37ee5bb664d406d9e1"
SRC_URI[tracing-subscriber-0.3.17.sha256sum] = "30a651bc37f915e81f087d86e62a18eec5f79550c7faff886f7090b4ea757c77"
SRC_URI[trycmd-0.14.16.sha256sum] = "2925e71868a12b173c1eb166018c2d2f9dfaedfcaec747bdb6ea2246785d258e"
SRC_URI[twox-hash-1.6.3.sha256sum] = "97fee6b57c6a41524a810daee9286c02d7752c4253064d0b05472833a438f675"
SRC_URI[typenum-1.16.0.sha256sum] = "497961ef93d974e23eb6f433eb5fe1b7930b659f06d12dec6fc44a8f554c0bba"
SRC_URI[unicase-2.6.0.sha256sum] = "50f37be617794602aabbeee0be4f259dc1778fabe05e2d67ee8f79326d5cb4f6"
SRC_URI[unicode-bidi-0.3.13.sha256sum] = "92888ba5573ff080736b3648696b70cafad7d250551175acbaa4e0385b3e1460"
SRC_URI[unicode-ident-1.0.11.sha256sum] = "301abaae475aa91687eb82514b328ab47a211a533026cb25fc3e519b86adfc3c"
SRC_URI[unicode-linebreak-0.1.5.sha256sum] = "3b09c83c3c29d37506a3e260c08c03743a6bb66a9cd432c6934ab501a190571f"
SRC_URI[unicode-normalization-0.1.22.sha256sum] = "5c5713f0fc4b5db668a2ac63cdb7bb4469d8c9fed047b1d0292cc7b0ce2ba921"
SRC_URI[unicode-width-0.1.10.sha256sum] = "c0edd1e5b14653f783770bce4a4dabb4a5108a5370a5f5d8cfe8710c361f6c8b"
SRC_URI[untrusted-0.7.1.sha256sum] = "a156c684c91ea7d62626509bce3cb4e1d9ed5c4d978f7b4352658f96a4c26b4a"
SRC_URI[ureq-2.7.1.sha256sum] = "0b11c96ac7ee530603dcdf68ed1557050f374ce55a5a07193ebf8cbc9f8927e9"
SRC_URI[url-2.4.0.sha256sum] = "50bff7831e19200a85b17131d085c25d7811bc4e186efdaf54bbd132994a88cb"
SRC_URI[utf8parse-0.2.1.sha256sum] = "711b9620af191e0cdc7468a8d14e709c3dcdb115b36f838e601583af800a370a"
SRC_URI[uuid-1.4.1.sha256sum] = "79daa5ed5740825c40b389c5e50312b9c86df53fccd33f281df655642b43869d"
SRC_URI[valuable-0.1.0.sha256sum] = "830b7e5d4d90034032940e4ace0d9a9a057e7a45cd94e6c007832e39edb82f6d"
SRC_URI[vcpkg-0.2.15.sha256sum] = "accd4ea62f7bb7a82fe23066fb0957d48ef677f6eeb8215f372f52e48bb32426"
SRC_URI[version_check-0.9.4.sha256sum] = "49874b5167b65d7193b8aba1567f5c7d93d001cafc34600cee003eda787e483f"
SRC_URI[versions-5.0.1.sha256sum] = "c73a36bc44e3039f51fbee93e39f41225f6b17b380eb70cc2aab942df06b34dd"
SRC_URI[wait-timeout-0.2.0.sha256sum] = "9f200f5b12eb75f8c1ed65abd4b2db8a6e1b138a20de009dacee265a2498f3f6"
SRC_URI[walkdir-2.3.3.sha256sum] = "36df944cda56c7d8d8b7496af378e6b16de9284591917d307c9b4d313c44e698"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasm-bindgen-0.2.87.sha256sum] = "7706a72ab36d8cb1f80ffbf0e071533974a60d0a308d01a5d0375bf60499a342"
SRC_URI[wasm-bindgen-backend-0.2.87.sha256sum] = "5ef2b6d3c510e9625e5fe6f509ab07d66a760f0885d858736483c32ed7809abd"
SRC_URI[wasm-bindgen-macro-0.2.87.sha256sum] = "dee495e55982a3bd48105a7b947fd2a9b4a8ae3010041b9e0faab3f9cd028f1d"
SRC_URI[wasm-bindgen-macro-support-0.2.87.sha256sum] = "54681b18a46765f095758388f2d0cf16eb8d4169b639ab575a8f5693af210c7b"
SRC_URI[wasm-bindgen-shared-0.2.87.sha256sum] = "ca6ad05a4870b2bf5fe995117d3728437bd27d7cd5f06f13c17443ef369775a1"
SRC_URI[web-sys-0.3.64.sha256sum] = "9b85cbef8c220a6abc02aefd892dfc0fc23afb1c6a426316ec33253a3877249b"
SRC_URI[webpki-roots-0.23.1.sha256sum] = "b03058f88386e5ff5310d9111d53f48b17d732b401aeb83a8d5190f2ac459338"
SRC_URI[which-4.4.0.sha256sum] = "2441c784c52b289a054b7201fc93253e288f094e2f4be9058343127c4226a269"
SRC_URI[wild-2.1.0.sha256sum] = "05b116685a6be0c52f5a103334cbff26db643826c7b3735fc0a3ba9871310a74"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-util-0.1.5.sha256sum] = "70ec6ce85bb158151cae5e5c87f95a8e97d2c0c4b001223f33a334e3ce5de178"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[windows-sys_0.45.0.sha256sum] = "75283be5efb2831d37ea142365f009c02ec203cd29a3ebecbc093d52315b66d0"
SRC_URI[windows-sys-0.48.0.sha256sum] = "677d2418bec65e3338edb076e806bc1ec15693c5d0104683f2efe857f61056a9"
SRC_URI[windows-targets-0.42.2.sha256sum] = "8e5180c00cd44c9b1c88adb3693291f1cd93605ded80c250a75d472756b4d071"
SRC_URI[windows-targets_0.48.2.sha256sum] = "d1eeca1c172a285ee6c2c84c341ccea837e7c01b12fbb2d0fe3c9e550ce49ec8"
SRC_URI[windows_aarch64_gnullvm-0.42.2.sha256sum] = "597a5118570b68bc08d8d59125332c54f1ba9d9adeedeef5b99b02ba2b0698f8"
SRC_URI[windows_aarch64_gnullvm_0.48.2.sha256sum] = "b10d0c968ba7f6166195e13d593af609ec2e3d24f916f081690695cf5eaffb2f"
SRC_URI[windows_aarch64_msvc-0.42.2.sha256sum] = "e08e8864a60f06ef0d0ff4ba04124db8b0fb3be5776a5cd47641e942e58c4d43"
SRC_URI[windows_aarch64_msvc_0.48.2.sha256sum] = "571d8d4e62f26d4932099a9efe89660e8bd5087775a2ab5cdd8b747b811f1058"
SRC_URI[windows_i686_gnu-0.42.2.sha256sum] = "c61d927d8da41da96a81f029489353e68739737d3beca43145c8afec9a31a84f"
SRC_URI[windows_i686_gnu_0.48.2.sha256sum] = "2229ad223e178db5fbbc8bd8d3835e51e566b8474bfca58d2e6150c48bb723cd"
SRC_URI[windows_i686_msvc-0.42.2.sha256sum] = "44d840b6ec649f480a41c8d80f9c65108b92d89345dd94027bfe06ac444d1060"
SRC_URI[windows_i686_msvc_0.48.2.sha256sum] = "600956e2d840c194eedfc5d18f8242bc2e17c7775b6684488af3a9fff6fe3287"
SRC_URI[windows_x86_64_gnu-0.42.2.sha256sum] = "8de912b8b8feb55c064867cf047dda097f92d51efad5b491dfb98f6bbb70cb36"
SRC_URI[windows_x86_64_gnu_0.48.2.sha256sum] = "ea99ff3f8b49fb7a8e0d305e5aec485bd068c2ba691b6e277d29eaeac945868a"
SRC_URI[windows_x86_64_gnullvm-0.42.2.sha256sum] = "26d41b46a36d453748aedef1486d5c7a85db22e56aff34643984ea85514e94a3"
SRC_URI[windows_x86_64_gnullvm_0.48.2.sha256sum] = "8f1a05a1ece9a7a0d5a7ccf30ba2c33e3a61a30e042ffd247567d1de1d94120d"
SRC_URI[windows_x86_64_msvc-0.42.2.sha256sum] = "9aec5da331524158c6d1a4ac0ab1541149c0b9505fde06423b02f5ef0106b9f0"
SRC_URI[windows_x86_64_msvc_0.48_2.sha256sum] = "d419259aba16b663966e29e6d7c6ecfa0bb8425818bb96f6f1f3c3eb71a6e7b9"
SRC_URI[winnow-0.4.7.sha256sum] = "ca0ace3845f0d96209f0375e6d367e3eb87eb65d27d445bdc9f1843a26f39448"
SRC_URI[xattr-1.0.1.sha256sum] = "f4686009f71ff3e5c4dbcf1a282d0a44db3f021ba69350cd42086b3e5f1c6985"
SRC_URI[xwin-0.2.14.sha256sum] = "9c16d94a0ca213c840bc7482ca9388957b0ee2eafceab13846d4189504155e62"
SRC_URI[yansi-0.5.1.sha256sum] = "09041cd90cf85f7f8b2df60c646f853b7f535ce68f85244eb6731cf89fa498ec"
SRC_URI[zeroize-1.6.0.sha256sum] = "2a0956f1ba7c7909bfb66c2e9e4124ab6f6482560f6628b5aaeba39207c9aad9"
SRC_URI[zip-0.6.6.sha256sum] = "760394e246e4c28189f19d488c058bf16f564016aefac5d32bb1f3b51d5e9261"

inherit cargo pypi python_setuptools3_rust native
