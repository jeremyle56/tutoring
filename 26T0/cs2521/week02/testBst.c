#include <stdbool.h>
#include <stdio.h>

#include "bst.h"

static void print_test_suite_header(const char *suite_name) {
    printf("\nTest Suite: %s\n", suite_name);
    printf("-----------------------\n");
}

// Expected Output: 4
static void test_bstCountOdds(void) {
    print_test_suite_header("test_bstCountOdds");

    struct node *root = NULL;
    int values[] = {4, 6, 5, 2, 1, 3, 7};
    int n = sizeof(values) / sizeof(values[0]);

    for (int i = 0; i < n; ++i) root = bstInsert(root, values[i]);

    printf("%d\n", bstCountOdds(root));

    bstFree(root);
}

// Expected Output: 3
static void test_bstCountInternal(void) {
    print_test_suite_header("test_bstCountInternal");

    struct node *root = NULL;
    int values[] = {4, 6, 5, 2, 1, 3, 7};
    int n = sizeof(values) / sizeof(values[0]);

    for (int i = 0; i < n; ++i) root = bstInsert(root, values[i]);

    printf("%d\n", bstCountInternal(root));

    bstFree(root);
}

// Expected Output: 0 2  -1
static void test_bstNodeLevel(void) {
    print_test_suite_header("test_bstNodeLevel");

    struct node *root = NULL;
    int values[] = {4, 6, 5, 2, 1, 3, 7};
    int n = sizeof(values) / sizeof(values[0]);

    for (int i = 0; i < n; ++i) root = bstInsert(root, values[i]);

    printf("%d %d %d\n", bstNodeLevel(root, 4), bstNodeLevel(root, 3), bstNodeLevel(root, 10));

    bstFree(root);
}

// Expected Output: 4
static void test_bstCountGreater(void) {
    print_test_suite_header("test_bstCountGreater");

    struct node *root = NULL;
    int values[] = {4, 6, 5, 2, 1, 3, 7};
    int n = sizeof(values) / sizeof(values[0]);

    for (int i = 0; i < n; ++i) root = bstInsert(root, values[i]);

    printf("%d\n", bstCountGreater(root, 3));

    bstFree(root);
}

int main(void) {
    test_bstCountOdds();
    test_bstCountInternal();
    test_bstNodeLevel();
    test_bstCountGreater();

    return 0;
}