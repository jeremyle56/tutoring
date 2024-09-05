#!/usr/bin/env python3


import sys


def chomp(string):
    # if string[-1] == "\n":
    #     return string[:-1]
    # return string

    return string.strip()


def qw(string):
    return string.split()


def die(message):
    print(f"Error {message}")
    sys.exit(1)


# with open(file) as f:
# lines = [l.strip() for l in f.readlines()]
