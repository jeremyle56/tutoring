#!/usr/bin/env python3


import sys
import re


# for i in range(1, 4)
# for i in range(5)


def main():
    arg = sys.argv[1]

    try:
        arg = int(arg)
    except ValueError:
        arg = re.compile(arg[1:-1])

    for line_number, line_content in enumerate(sys.stdin, start=1):
        print(line_content, end="")

        if isinstance(arg, int):
            if line_number == arg:
                break
        else:
            if arg.search(line_content):
                break


if __name__ == "__main__":
    main()
