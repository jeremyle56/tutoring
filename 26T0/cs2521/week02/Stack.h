// Interface to the Stack ADT

#ifndef STACK_H
#define STACK_H

#include <stdbool.h>
#include <stdio.h>

typedef struct stack *Stack;

/**
 * Creates a new empty stack
 * Time complexity: O(1)
 */
Stack StackNew(void);

/**
 * Frees all memory allocated to the stack
 * Time complexity: O(n)
 */
void StackFree(Stack s);

/**
 * Adds an item to the top of the stack
 * Time complexity: O(1)
 */
void StackPush(Stack s, int item);

/**
 * Removes the item at the top of the stack and returns it
 * Assumes that the stack is not empty
 * Time complexity: O(1)
 */
int StackPop(Stack s);

/**
 * Returns the number of items in the stack
 * Time complexity: O(1)
 */
int StackSize(Stack s);

#endif
