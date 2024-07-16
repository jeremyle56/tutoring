#!/usr/bin/env python3

import sys


def main():
    if len(sys.argv) != 4:
        print(f"Usage: {sys.argv[0]} <n> <m> <column-width")
        sys.exit(1)

    n = int(sys.argv[1])
    m = int(sys.argv[2])
    width = int(sys.argv[3])

    # for(int i = 0; i < n; i++)
    for row in range(1, n + 1):
        for col in range(1, m + 1):
            print(f"{row * col : >{width}}", end="")
        print()

    # x = 1
    # print(f"{x: <5}")
    # print(f"{x: >5}")


if __name__ == "__main__":
    main()
