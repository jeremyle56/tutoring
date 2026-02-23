#include "bst.h"

#include <stdio.h>
#include <stdlib.h>

// ------------------------------------------------------
// Inserts a value into the BST. Returns the new root.
// ------------------------------------------------------
struct node* bstInsert(struct node* root, int value) {
    if (root == NULL) {
        // Create a new node
        struct node* newNode = malloc(sizeof(struct node));
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
void bstFree(struct node* root) {
    if (root == NULL) return;
    bstFree(root->left);
    bstFree(root->right);
    free(root);
}

// ------------------------------------------------------
// Count the number of odd-valued nodes in the tree
// ------------------------------------------------------
int bstCountOdds(struct node* t) {
    if (t == NULL) {
        return 0;
    } else if (t->value % 2 != 0) {
        return 1 + bstCountOdds(t->left) + bstCountOdds(t->right);
    }

    return bstCountOdds(t->left) + bstCountOdds(t->right);
}

// ------------------------------------------------------
// Count the number of internal nodes in the tree
// ------------------------------------------------------
int bstCountInternal(struct node* t) {
    if (t == NULL) {
        return 0;
    } else if (t->left == NULL && t->right == NULL) {
        return 0;
    }

    return bstCountInternal(t->left) + bstCountInternal(t->right) + 1;
}

// ------------------------------------------------------
// Return the level of the node containing 'key'.
// If not found, return -1. Root is level 0.
// ------------------------------------------------------
int bstNodeLevel(struct node* t, int key) {
    if (t == NULL) {
        return -1;
    } else if (t->value == key) {
        return 0;
    } else if (key < t->value) {
        int level = bstNodeLevel(t->left key);
        if (level == -1) {
            return -1;
        }
        return level + 1;
    } else {
        int level = bstNodeLevel(t->right key);
        if (level == -1) {
            return -1;
        }
        return level + 1;
    }
}

// ------------------------------------------------------
// Count the number of values in the BST that are greater
// than 'val'. Must avoid unnecessary visits.
// ------------------------------------------------------
int bstCountGreater(struct node* t, int val) {
    if (t == NULL) {
        return 0;
    } else if (t->value > val) {
        return 1 + bstCountGreater(t->left, val) + bstCountGreater(t->right, val);
    }

    return bstCountGreater(t->right, val);
}