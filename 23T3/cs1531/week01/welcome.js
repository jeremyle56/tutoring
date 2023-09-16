/*
 * [welcome.js]
 *
 * A simple program to print a welcome message
 * and print 10 numbers with information about
 * whether they are odd or even.
 */

const SIZE = 10;
// SIZE = 5; // wrong

let num = 10;
num = 5; // valid

const message = "Welcome to COMP1531!";
console.log(message);

const number_array = [1, 9, 2, 8, 3, 7, 4, 6, 5, 0];

for (let i = 0; i < SIZE; i++) {
  if (number_array[i] % 2 == 0) {
    console.log("[" + i + "]" + "EVEN: " + number_array[i]);
  } else {
    console.log(`[${i}] ODD: ${number_array[i]}`);
  }
}
