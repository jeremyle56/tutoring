#!/usr/bin/env dash

print_message() {
    # return
    case "$#" in
        1) echo "$1" ;;
        2)
            echo "$2"
            exit "$1"
            ;;
    esac
}

print_message "Hi this is a message"
print_message 1 "This an error"

echo "Hello World"