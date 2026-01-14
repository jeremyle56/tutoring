// Interface to the Queue ADT

#ifndef QUEUE_H
#define QUEUE_H

#include <stdbool.h>
#include <stdio.h>

typedef struct queue *Queue;

/**
 * Creates a new empty queue
 * Time complexity: O(1)
 */
Queue QueueNew(void);

/**
 * Frees all resources associated with the given queue
 * Time complexity: O(n)
 */
void QueueFree(Queue q);

/**
 * Adds an item to the end of the queue
 * Time complexity: O(1)
 */
void QueueEnqueue(Queue q, int it);

/**
 * Removes an item from the front of the queue and returns it
 * Assumes that the queue is not empty
 * Time complexity: O(1)
 */
int QueueDequeue(Queue q);

#endif
