#!/usr/bin/env python3

import subprocess, sys, re


def main():
    url = sys.argv[1]
    process = subprocess.run(f"curl {url}", shell=True, capture_output=True, text=True)
    webpage = process.stdout
    for number in re.findall(r"[\d \-]+", webpage):
        number = re.sub(r"\D", "", number)
        if len(number) >= 8 and len(number) <= 15:
            print(number)


if __name__ == "__main__":
    main()
