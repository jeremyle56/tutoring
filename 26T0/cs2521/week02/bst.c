#include "bst.h"

#include <stdio.h>
#include <stdlib.h>

// ------------------------------------------------------
// Inserts a value into the BST. Returns the new root.
// ------------------------------------------------------
struct node *bstInsert(struct node *root, int value) {
    if (root == NULL) {
        // Create a new node
        struct node *newNode = malloc(sizeof(struct node));
        newNode->value = value;
        newNode->left = NULL;
        newNode->right = NULL;
        return newNode;
    }

    // Insert into left or right subtree
    if (value < root->value) {
        root->left = bstInsert(root->left, value);
    } else {
        root->right = bstInsert(root->right, value);
    }
    return root;
}

// ------------------------------------------------------
// Frees all nodes in the BST
// ------------------------------------------------------
void bstFree(struct node *root) {
    if (root == NULL) return;
    bstFree(root->left);
    bstFree(root->right);
    free(root);
}

// ------------------------------------------------------
// Count the number of odd-valued nodes in the tree
// ------------------------------------------------------
int bstCountOdds(struct node *t) {
    // TODO
}

// ------------------------------------------------------
// Count the number of internal nodes in the tree
// ------------------------------------------------------
int bstCountInternal(struct node *t) {
    // TODO
}

// ------------------------------------------------------
// Return the level of the node containing 'key'.
// If not found, return -1. Root is level 0.
// ------------------------------------------------------
int bstNodeLevel(struct node *t, int key) {
    // TODO
}

// ------------------------------------------------------
// Count the number of values in the BST that are greater
// than 'val'. Must avoid unnecessary visits.
// ------------------------------------------------------
int bstCountGreater(struct node *t, int val) {
    // TODO
}