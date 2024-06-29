#!/usr/bin/env dash

for file in *.c; do
    echo "$file includes:"
    grep -E "^#include" "$file" |
    sed -E 's/^#include [<"](.*)[>"]/\t\1/'
done