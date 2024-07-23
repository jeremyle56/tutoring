#!/usr/bin/env python3

import sys, re, subprocess
from collections import Counter

from argparse import ArgumentParser


def main():
    parser = ArgumentParser()
    parser.add_argument(
        "-f", "--frequency", action="store_true", help="print tags by frequency"
    )
    parser.add_argument("url", help="url to fetch")
    args = parser.parse_args()

    process = subprocess.run(["curl", args.url], capture_output=True, text=True)
    webpage = process.stdout.lower()

    webpage = re.sub(r"<!--.*?-->", "", webpage, flags=re.DOTALL)

    tags = re.findall(r"<\s*(\w+)", webpage)

    tags_counter = Counter()
    for tag in tags:
        tags_counter[tag] += 1

    if args.frequency:
        for tag, counter in reversed(tags_counter.most_common()):
            print(f"{tag} {counter}")
    else:
        for tag, counter in sorted(tags_counter.items()):
            print(f"{tag} {counter}")


if __name__ == "__main__":
    main()
