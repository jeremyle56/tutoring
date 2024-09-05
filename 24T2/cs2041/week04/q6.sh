#!/usr/bin/env dash

mlalias cs2041.tue13-brass |
sed -nE '/Address/, /Owners/p' |
head -n -1 |
tail -n +2 |
cut -d@ -f1 |
tr -d ' '