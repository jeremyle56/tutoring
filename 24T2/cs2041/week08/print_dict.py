#!/usr/bin/env python3


def main():
    example = {"Andrew": "green", "Anne": "red", "John": "blue"}
    print_dict(example)


def print_dict(x):
    for key, val in x.items():
        print(f"[{key}] => {val}")


if __name__ == "__main__":
    main()
