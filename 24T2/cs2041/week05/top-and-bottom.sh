#!/usr/bin/env dash

top_and_bottom() {
    echo "============"
    echo "$1"
    echo "------------"
    sed -n '1p;$p' "$1"
    # head -1 < "$1"
    # tail -1 < "$1"
    echo "============"
}

for file in "$@"; do
    top_and_bottom "$file"
done
