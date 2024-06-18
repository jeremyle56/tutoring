#!/usr/bin/env dash

# acc | grep '_Student' | cut -d':' -f2 | cut -d't' -f1 | tail -2

acc |
sed -n '/User classes/, /Misc classes/p' |
cut -d':' -f2 |
tr ',' '\n' |
sed -nE 's/([A-Z]{4}[0-9]{4})t[1-3]_Student.*/\1/p'