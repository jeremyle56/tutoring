#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

bool isPalindrome(char *s);

int main(void) {
    char *s = "racecar";
    if (isPalindrome(s)) {
        printf("PALINDROME!\n");
    } else {
        printf("not :(\n");
    }
    return 0;
}

bool isPalindrome(char *s) {
    int l = 0;                      // O(1)
    int r = strlen(s) - 1;          // O(n)
    while (l != r) {                // O(n / 2)
        if (s[l] == s[r]) {         // O(1)
            l++;                    // O(1)
            r--;                    // O(1)
        } else {
            return false;
        }
    }
    return true;
}