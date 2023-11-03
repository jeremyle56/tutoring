# Tutorial 8

[TOC]

## A. Zune bug - Using Coverage

Below is a piece of software that you may remember from a previous week's activity:
```ts
const ORIGIN_YEAR = 1970;

const isLeap = (y: number) => new Date(y, 1, 29).getDate() === 29;

export const dayToYear = (days: number) => {
  let year = ORIGIN_YEAR;
  while (days > 365) {
    if (isLeap(year)) {
      if (days > 366) {
        days -= 366;
        year += 1;
      } else {
        continue;
      }
    } else {
      days -= 365;
      year += 1;
    }
  }
  return year;
};
```

1. What is code coverage and how it can be useful?

1. Run the current tests in [a.zunebug/day-to-year.test.ts](a.zunebug/day-to-year.test.ts) with the `--coverage` option from `jest`.
Open the resulting `html` file in your browser. How can we interpret this result?

1. Write a test case to achieve 100% coverage.

1. Make any modifications to the program as appropriate.

## B. Movies

Below is the updated interface from tut03 b.movies, where the layer of abstraction has shifted from "functions" to "HTTP routes":

<table>
  <tr>
    <th>Name & Description</th>
    <th>HTTP Method</th>
    <th>Data Types</th>
    <th>Errors</th>
  </tr>
  <tr>
    <td>
      <code>/movie/add</code>
      <br/><br/>
      Adds a movie to the data store.
    </td>
    <td>
       POST
    </td>
    <td>
      <b>Body Parameters</b>:
      <br/>
      <code>{title, director}</code>
      <br/><br/>
      <b>Return Object</b>:
      <br/>
      <code>{movieId}</code>
    </td>
    <td>
      <code>{error}</code> when any of:
      <ul>
        <li>title is an empty string, ""</li>
        <li>director is an empty string, ""</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>
      <code>/movie/:movieid</code>
      <br/><br/>
      Edits a movie in the data store.
    </td>
    <td>
      PUT
    </td>
    <td>
      <b>Body Parameters</b>:
      <br/>
      <code>{movieId, title, director}</code>
      <br/><br/>
      <b>Return Object</b>:
      <br/>
      <code>{}</code>
    </td>
    <td>
      <code>{error}</code> when any of:
      <ul>
        <li>movieId does not refer to an existing movie</li>
        <li>title is an empty string, ""</li>
        <li>director is an empty string, ""</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>
      <code>/movies/list</code>
      <br/><br/>
      Lists all movies in the data store.
    </td>
    <td>
        GET
    </td>
    <td>
      <b>Query Parameters</b>:
      <br/>
      <code>{}</code>
      <br/><br/>
      <b>Return Object</b>:
      <br/>
      <code>{movies}</code>
    </td>
    <td>
      N/A
    </td>
  </tr>
  <tr>
    <td>
        <code>/clear</code><br /><br />
        Delete all movie data and return an empty object.
    </td>
    <td>
        DELETE
    </td>
    <td>
      <b>Query Parameters</b>:
      <br/>
      <code>{}</code>
      <br/><br/>
      <b>Return Object</b>:
      <br/>
      <code>{}</code>
    </td>
    <td>
        N/A
    </td>
  </tr>
</table>

| Variable | Type |
| --- | --- |
| is exactly **error** | `string`, with the value being a relevant error message of your choice |
| contains suffix **Id** | `number`, specifically integer |
| is exactly **title** | `string` |
| is exactly **director** | `string` |
| is exactly **movies** | Array of objects, where each object has type `{movieId, title, director}` |

### Part 1 - Measuring Coverage Server-side

1. Read through the scripts in [package.json](package.json) and the other starter files in the src directories
1. Use the `start-coverage` script to start the server in one terminal and run the test suite in another
1. Stop the server with Ctrl+C and observe the result

### Part 2 - Refactoring with Exceptions

1. In [b.movies/src/movie.ts](b.movies/src/movie.ts)
  - remove the `ErrorObject` from the union return type of the `moveAdd` and `movieEdit` functions
  - replace `return { error: '...' }` with `throw HTTPError`
1. In [b.movies/src/server.ts](b.movies/src/server.ts), replace the manual error-checking for status 400 with a middleware
1. Ensure all tests are passing and we still have 100% coverage

## C. System Model - State Diagram

Create a state diagram to describe the states and subsequent transitions that would occur for a grocery store checkout system, from the perspective of the user-machine interaction.

![](https://www.canstarblue.com.au/wp-content/uploads/2018/09/shutterstock_793003627-300x189.jpg)

1. What are some limitations of our current model?

1. How can our model be used in the designing stages of software?
