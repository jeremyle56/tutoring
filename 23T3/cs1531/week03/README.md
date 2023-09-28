# Tutorial 3

[TOC]

## A. Stamp

In this exercise, we will learn about NPM, which is the initialism for
```
N _ _ _
P _ _ _ _ _ _
M _ _ _ _ _ _
```

In your project groups, consider the interface below:

### Interface: Functions

| Name & Description | Parameters | Return Object | Errors |
|------------------|----------|--------------------|------|
|`stamp` <br/><br/> Given an email, stamp it with a unique `identifier` and a `timeString`. <br/><br/>The `identifier` should be universally unique (e.g. someone from across the world has an improbable chance of generating the same string).<br/><br/>It should not rely on the characters in the email. | (email) | `{identifier, timeString}` | Return `{error}` when the email is invalid |

### Interface: Data Types

| If the variable name | It is of type |
| --- | --- |
| is **error** | `string`, with value being a relevant error message of your choice |
| is **email** | `string` |
| is **identifier** | `string` that is globally unique |
| is **timeString** | `string` in the format `'WEEKDAY - hh:mm:ss [am/pm]"`. e.g. `'Saturday - 06:03:54 pm'` |

For example:
```js
stamp('valid@email.com');
```
may return something like:
```javascript
return {
  identifier: 'some unique string that no one can guess',
  timeString: 'Saturday - 06:03:23 pm'
}
```

1. Before researching, discuss with your group the kinds of tools you'd likely need to solve this problem.

2. Look through the [npm registry](https://www.npmjs.com/) or other sources for any package that meets your needs. Note them down. If you have time, try to complete the function.

3. Each group will share their packages (and potentially code) with the class. Your tutor will demonstrate how these packages can be installed with `npm` and used (by importing) in [a.stamp/stamp.js](a.stamp/stamp.js)

## B. Movies

This activity can be done as a group or as a class.

Below is the MVP interface for a movie data system.

<table>
  <tr>
    <th>Name & Description</th>
    <th>Input Parameters</th>
    <th>Returned Object</th>
    <th>Errors</th>
  </tr>
  <tr>
    <td>
      <code>movieAdd</code>
      <br/><br/>
      Adds a movie to the data store.
    </td>
    <td>
        (title, director)
    </td>
    <td>
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
      <code>movieEdit</code>
      <br/><br/>
      Edits a movie in the data store.
    </td>
    <td>
        (movieId, title, director)
    </td>
    <td>
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
      <code>moviesList</code>
      <br/><br/>
      Lists all movies in the data store.
    </td>
    <td>
        ()
    </td>
    <td>
      <code>{movies}</code>
    </td>
    <td>
      N/A
    </td>
  </tr>
  <tr>
    <td>
        <code>clear</code><br /><br />
        Delete all movie data and return an empty object.
    </td>
    <td>
        ()
    </td>
    <td>
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

### Part 1 - Testing

In [b.movies/src/movie.test.js](b.movies/src/movie.test.js), write tests for each of the functions listed in the interface. Your test suite should include:
- basic error cases (does not need to be exhaustive in the interest of time)
- return value of each function
- behaviour and side effects (e.g. how does calling `movieAdd` and `movieEdit` affect `movieList`)

### Part 2 - Implementation

Complete the implementation for the interface functions. Ensure that they pass your tests.

### Part 3 - Automarking

Your tutor has access to a pre-written automarking file containing a more exhaustive test suite, which can be copied into and run against the class' implementation.

Together, review the test suite and discuss the key points and improvements that you can utilise in your labs and the major group project.

## C. Client - Iteration 1

Your tutor is the client who will interact weekly with your group to check in and learn about the current state of the backend application.

1. In your project groups, identify and discuss what kind of information you should collect or track each week to keep your client informed and satisfied.

1. Your client will now explain the requirements and expectations for iteration 1 in further detail. In particular, the
    - Task
    - Git practices (commits, branches, merge requests, issue board)
    - Data storage/structure
    - Black-box testing & implementation of features
    - Communication (MS Teams!), meeting minutes, frequent standups
    - Marking Criteria

Your client has high expectations for your team :3 - please do your best and reach out to them during meet-up (lab) time if you need further clarification!
