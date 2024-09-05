#!/usr/bin/env python3

# for file in *.[ch]

from glob import glob


def main():
    total = 0
    for file in glob("*.[ch]"):
        with open(file) as f:
            num_lines = len(f.readlines())
            print(f"{num_lines:7} {file}")
            total += num_lines
    print(f"{total:7} total")


if __name__ == "__main__":
    main()
