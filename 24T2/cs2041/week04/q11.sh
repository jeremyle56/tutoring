#!/usr/bin/env dash

for file in "$@"; do
    echo "$PATH" | tr ':' '\n' |
    while read dir; do
        f="$dir/$file"
        test -x "$f" && ls -ld "$f"
    done |
    grep '.' || echo "Program not found"
done