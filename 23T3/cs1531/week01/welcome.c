/*
 * [welcome.c]
 *
 * A simple program to print a welcome message
 * and each element in an array labelled as
 * either odd or even.
 */
#include <stdio.h>

#define SIZE 10

int main(void) {
    char message[] = "Welcome to COMP1531!";
    printf("%s\n", message);

    int number_array[SIZE] = { 1, 9, 2, 8, 3, 7, 4, 6, 5, 0 };

    for (int i = 0; i < SIZE; i++) {
        if (number_array[i] % 2 == 0) {
            printf("[%d] EVEN: %d\n", i, number_array[i]);
        } else {
            printf("[%d] ODD:  %d\n", i, number_array[i]);
        }
    }
    return 0;
}