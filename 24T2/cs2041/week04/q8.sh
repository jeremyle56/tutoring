#!/usr/bin/env dash

mlalias cs2041.tue13-brass |
sed -nE '/Address/, /Owners/p' |
head -n -1 |
tail -n +2 |
cut -d@ -f1 |
tr -d ' ' |
while read zid; do
    acc "$zid" |
    sed -n '/User classes/, /Misc classes/p' |
    cut -d':' -f2 |
    tr ',' '\n' |
    sed -nE 's/.*([A-Z]{4}[0-9]{4})t[1-3]_Student.*/\1/p'
done |
sort |
uniq -c |
sort -rn