# Tutorial 1

[TOC]

## General notes:

## A. Introduction and Problem Solving

1. Your tutor will split you into your project groups with an icebreaker activity and a problem to solve in 15 minutes. When time is up, they'll ask for your brief introduction and answer.

1. Come back together and reflect with your tutor on how you came up with those answers

## B. From C to Javascript: A Quick Overview

### Part 1 - Basic Syntax, Input/Output, Conditionals & Control Flow

Consider the following C program in the file [welcome.c](welcome.c):

```c
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
```

In this repository, there is another file called [welcome.js](welcome.js). In this file, convert the C program above into a JavaScript program.

As you write the program, discuss the following questions:

- Why don't we need to specify the type of a variable when we declare it?

- What are `const` and `let`?

- How is JavaScript's `console.log` function different to `printf` in C?

### Part 2 - Looping through Arrays of Objects

Create a new file called [shopping.js](shopping.js).

In this file, write a program that stores an array of objects containing items in a shopping list of the form `{ name: string, cost: number }`. For example:

```js
const shoppingList = [
  { name: "Milk", cost: 3.99 },
  { name: "Butter", cost: 4.49 },
  { name: "Tuna", cost: 1.99 },
  { name: "Tomato", cost: 5.95 },
  { name: "TooHak", cost: 1530.99 },
];
```

- Use a regular `for` loop to print each element in the array using their indices.
- Next, change your program to use a `for-of` loop and print each element out instead.

### Part 3 - Functions

Consider the following C program in [cube.c](cube.c):

```c
/**
 * [cube.c]
 */

#include <stdio.h>

int cube(int x);

int main(void) {

    int number = 5;
    int result = cube(number);
    printf("%d^3 = %d\n", number, result);

    return 0;
}

int cube(int x) {
    return x * x * x;
}
```

Convert this into a JavaScript program.

As you write the program, answer the following questions:

- Why don't JavaScript programs need a `main` function?

- Which operator can we use instead of needing to write `x * x * x`?

## C. Git Fundamentals

1. In the terminal, use the command

   ```shell
   $ git status
   ```

   What does it say about the files we have added or modified (e.g. [cube.js](cube.js))?

2. Add [cube.js](cube.js) to the git's staging area (index) using the command

   ```shell
   $ git add cube.js
   ```

   then type `git status` again. What changed?

3. To make a commit with a relevant message for our changes, use the command

   ```shell
   $ git commit -m 'finished cube.js'
   ```

   then type `git status` again. What's different?

4. Push the committed changes to Gitlab with the command

   ```shell
   $ git push
   ```

   and refresh the Gitlab repository page. Are the recent changes present?

5. On Gitlab, add a comment at the bottom of [cube.js](cube.js) and commit the change. Back in your local terminal, type

   ```shell
   $ git pull
   ```

   Confirm that the changes made on Gitlab are present locally.

6. Add, commit and push any remaining files (from `git status`) to Gitlab.

### Further Discussions

- When should we make a commit?
- How should our commit messages be written?
- Why are commits and commit messages important?

## Further Resources

- In addition to labs, there are smaller-scale "Practice Activities" that can be accessed on Webcms3 and Gitlab. These are not worth any marks as the solutions have already been provided, although they can serve as a nice warmup for the labs.
- If you find yourself struggling to keep up with the course content, there are also NodeJS online courses available to help you build up your fundamentals, such as:
  - https://liveclasses.nodejsacademy.com/store/NodeJS-Introductory-Course-5boa5ezar0v9
  - https://www.codecademy.com/courses/learn-node-js/articles/welcome-to-learn-node-js
