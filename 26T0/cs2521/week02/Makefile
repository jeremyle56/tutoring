# COMP2521 - Week 2 Tutorial

CC = clang
CFLAGS = -Wall -Wvla -Werror -gdwarf-4

########################################################################

.PHONY: asan msan nosan

asan: CFLAGS += -fsanitize=address,leak,undefined
asan: all

msan: CFLAGS += -fsanitize=memory,undefined -fsanitize-memory-track-origins
msan: all

nosan: all

########################################################################

.PHONY: all
all: testQueue testBst

testQueue: testQueue.o Queue.o Stack.o
	$(CC) $(CFLAGS) -o testQueue testQueue.o Queue.o Stack.o

testQueue.o: testQueue.c Queue.h
Queue.o: Queue.c Queue.h Stack.h
Stack.o: Stack.c Stack.h

testBst: testBst.o bst.o
	$(CC) $(CFLAGS) -o testBst testBst.o bst.o

testBst.o: testBst.c bst.h
bst.o: bst.c bst.h

.PHONY: clean
clean:
	rm -f *.o testQueue testBst

