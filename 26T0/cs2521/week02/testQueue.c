#include <stdbool.h>
#include <stdio.h>

#include "Queue.h"

static void print_test_suite_header(const char *suite_name) {
    printf("\nTest Suite: %s\n", suite_name);
    printf("-----------------------\n");
}

// Expected Output: 10 20 30
static void test_basicEnqueueDequeue(void) {
    print_test_suite_header("test_basicEnqueueDequeue");

    Queue q = QueueNew();

    QueueEnqueue(q, 10);
    QueueEnqueue(q, 20);
    QueueEnqueue(q, 30);

    for (int i = 0; i < 3; ++i) printf("%d ", QueueDequeue(q));
    printf("\n");

    QueueFree(q);
}

// Expected Output: 1 2 \n 3 4 5
static void test_interleavedOperations(void) {
    print_test_suite_header("test_interleavedOperations");

    Queue q = QueueNew();

    QueueEnqueue(q, 1);
    QueueEnqueue(q, 2);
    QueueEnqueue(q, 3);

    for (int i = 0; i < 2; ++i) printf("%d ", QueueDequeue(q));
    printf("\n");

    QueueEnqueue(q, 4);
    QueueEnqueue(q, 5);

    for (int i = 0; i < 3; ++i) printf("%d ", QueueDequeue(q));
    printf("\n");

    QueueFree(q);
}

int main(void) {
    test_basicEnqueueDequeue();
    test_interleavedOperations();

    return 0;
}