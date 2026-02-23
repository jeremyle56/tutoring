#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

struct node {
    int value;
    struct node *next;
};

struct list {
    struct node *head;
};

// HELPER FUNCTIONS SO WE CAN SEE WHAT'S HAPPENING
struct node *createNode(int value);
struct node *listPrepend(struct node *head, int value);
void listPrint(struct node *head);

// int listLength(struct list *l) {
//     // TODO:
// }

// ACTUAL RECURSIVE FUNCTIONS
int listLength(struct node *l);
int listCountOdds(struct node *l);
bool listIsSorted(struct node *l);
struct node *listDelete(struct node *l, int value);


int main(void) {
    struct node *head = NULL;
    head = listPrepend(head, 6);
    head = listPrepend(head, 5);
    head = listPrepend(head, 3);
    head = listPrepend(head, 2);
    head = listPrepend(head, 1);
    head = listPrepend(head, 20);
    head = listPrepend(head, 176);
    // 176 20 1 2 3 5 6

    head = listDelete(head, 20);
    head = listDelete(head, 176);
    head = listDelete(head, 5);
    // 1 2 3 6

    listPrint(head);
    printf("list length: %d\n", listLength(head));
    printf("number of odds: %d\n", listCountOdds(head));
    if (listIsSorted(head)) {
        printf("THIS IS SORTED!!\n");
    } else {
        printf("not sorted :(\n");
    }

    return 0;
}



struct node *createNode(int value) {
    struct node *n = malloc(sizeof(*n));
    if (n == NULL) {
        fprintf(stderr, "error: out of memory\n");
        exit(EXIT_FAILURE);
    }
    n->next = NULL;
    n->value = value;
    return n;
}

struct node *listPrepend(struct node *head, int value) {
    struct node *n = createNode(value);
    n->next = head;
    return n;
}

void listPrint(struct node *head) {

    if (head == NULL) {
        return;
    }

    printf("%d: before\n", head->value);
    listPrint(head->next);
    printf("%d: after\n", head->value);
}

int listLength(struct node *l) {
    // BASE CASE:
    if (l == NULL) {
        return 0;
    }

    // RECURSIVE CASE:
    return 1 + listLength(l->next);
}

// int listLength(struct node *l) {
//     int length = 0;
//     for (struct node *curr = l; curr != NULL; curr = curr->next) {
//         ++length;
//     }
//     return length;
// }


int listCountOdds(struct node *l) {
    // BASE CASE:
    if (l == NULL) {
        return 0;
    }

    // RECURSIVE CASE:
    if (l->value % 2 == 1) {
        return 1 + listCountOdds(l->next);
    } else {
        return 0 + listCountOdds(l->next);
    }
}

bool listIsSorted(struct node *l) {
    // BASE CASE:
    if (l == NULL || l->next == NULL) {
        return true;
    }

    // out of order
    if (l->value > l->next->value) {
        return false;
    // RECURSIVE CASE:
    } else {
        return listIsSorted(l->next);
    }
}

struct node *listDelete(struct node *l, int value) {
    // BASE CASE:
    if (l == NULL) {
        return NULL;
    }
    if (l->value == value) {
        struct node *newHead = l->next;
        free(l);
        return newHead;
    // RECURSIVE CASE:
    } else {
        l->next = listDelete(l->next, value);
        return l;
    }
}