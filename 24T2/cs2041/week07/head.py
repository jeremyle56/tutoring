#!/usr/bin/env python3

import sys

n = 10

if len(sys.argv) > 1 and sys.argv[1].startswith("-"):
    n = int(sys.argv.pop(1)[1:])

for file in sys.argv[1:]:
    # print("==> FileName <===")
    # print("==> " + file + " <==")
    print(f"==> {file} <==")
    with open(file) as f:
        lines = f.readlines()

    print("".join(lines[:n]))


# count = 0
# for line in sys.stdin:
#     if count >= n:
#         break
#     print(line, end="")
#     count += 1
