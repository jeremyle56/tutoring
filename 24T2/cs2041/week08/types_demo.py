#!/usr/bin/env python3

# int()
print(3)

# float()
print(3.2)

# str()
print("Hello")

# {} - dict() - store data values in key:value pairs.
a = {"key1": "value1", "key2": "value2"}
b = dict()  # == {} empty dict.

print(a, b)

# (,) - tuple() - immutable list
c = (1, 2, 3)
# ("hello", ) # single elements must end with a comma or python will think it's just a grouping operator

# () is NOT an empty tuple
d = tuple()  # == empty tuple

print(c, d)

# {,} - set() - unorded collection of unique elements
e = {1, 2, 3}
# {"hello", } # single elements must end with a comma or python will complain it looks like a dict

# {} is NOT an empty set (is a dict)
f = set()  # == empty set

print(e, f)

# frozenset - like a set, but immutable (like a tuple is to a list)
g = frozenset(("a", "e", "i", "o", "u"))
h = frozenset()  # == empty frozenset

print(g, h)

# collections.Counter works like a dictionary, but with some extra methods, plus has a default value of 0.
from collections import Counter

i = Counter()
i["a"] += 1  # index error with normal dictionary
print(i["a"])

# collections.defaultdict works like a dictionary, but you can set a default value for missing keys.
from collections import defaultdict

j = defaultdict(list)
j["a"].append("hello")
print(j["a"])

# collections.OrderedDict works like a dictionary but keeps the order of keys.
# Is true for normal dictionaries but not guaranteed.
from collections import OrderedDict

k = OrderedDict()
k["z"] = "COMP1511"
k["a"] = "COMP1521"
k["k"] = "COMP1531"
k["b"] = "COMP2041"

print(k.keys())
