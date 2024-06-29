#!/usr/bin/env dash

if [ "$#" -eq  1 ]; then
    FIRST=1
    LAST=$1
    INCREMENT=1
elif [ "$#" -eq 2 ]; then
    FIRST=$1
    LAST=$2
    INCREMENT=1
elif [ "$#" -eq 3 ]; then
    FIRST=$1
    INCREMENT=$2
    LAST=$3
else
    echo "Usage: $0 [FIRST] [INCREMENT] [LAST]" >&2
    exit 1
fi

current="$FIRST"
while [ "$current" -le "$LAST" ]; do
    echo "$current"
    current=$(( current + INCREMENT))
done