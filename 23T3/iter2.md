# H11A_AERO

Hey AERO!

This file will contain general feedback for your team.
Let me know via Teams if you have any questions :D

# Test Quality

## Test Coverage

- Create/Edit quiz question was very extensively tested, well done!
- Missing the testing of the side effect of delete quiz question. You can call the `quizInfo` to check the list of questions for the current quiz. Similarly with the other quiz question routes.
- Missing testing the side effects of updating details. You can all the `userInfo` function to check that the data has been updated correctly in the database.

## Test Clarity

- Please consider moving your wrapper functions (including the wrapper helper) out to a helper function. They create a lot of clutter in your test files. They also create extremely long lines which you can separate. Try to avoid overly long lines.
- A few of the tests in `adminSetUserDetails` are just `Wrong NameFirst` and `Wrong NameLast`, what is wrong about them? Could you be more descriptive?
- For most of the quiz tests a description mentioning that you are testing that route, rather than just the name would be helpful. This could be just `Testing /v1/admin/quiz/trash - View the quizzes in trash`.

## Test Design

- Consider removing `beforeEach` for blocks of code which only require this once. For example `adminAuthLogout` only has one test which requires a user to be registered.
- You could consider moving the tests out to different files if you think that a 2000 line test file is too much.

# Code Quality

- Consider moving your helper functions to a separate file rather than add even more code and logic to the `auth` and `quiz` files.
  - Could also consider creating a types file to contain all the interface definitions
- The code feels a bit cramped, consider adding some whitespace (blank lines) to separate logic. More so in `auth.ts`.
- Interesting use of `delete` in `adminAuthLogout`. Nothing against it (for now) I just haven't seen it before.
  - `Token` in this function is also capital
- Don't commit your persistence file, you can add this to the `.gitignore`
- Missing header comments for `LoadData` function
- Inconsistent exports in `dataStore.ts` file
- Auth helper functions missing documentation/header comments.

# Git Practices

- There were some questionable commit names. "cleaned up code", "Fixed error". Remember to be specific!
- Separate functionality to more branches. Don't have 80% of the code for the iteration be from one branch/merge request.
- Also remember to always write your tests before implementation!

# Teamwork

- Make sure you are all communicating (and there is evidence) of this!
- In terms of your gitlab board, it would be helpful to mention that the tasks are to complete test + implementation (maybe in the description or title) rather than just the route/function names.
  - Also missing due dates

# H11A_BOOST

Hey BOOST!

This file will contain general feedback for your team.
Let me know via Teams if you have any questions :D

Token is a string!!! :facepalm:

# Test Quality

## Test Coverage

- `authUserPasswordUpdate` missing token invalid test and side effects, using `userDetails` to check that data has been correctly updated.
- `adminQuizCreateQuestion` has no tests for successful creation of questions.
- `adminQuizMoveQuestion` should use other functions like `quizInfo` to check if the question has been correctly moved.

## Test Clarity

- The last error case in the `authUserDetailsUpdate` tests has the name `Last name more than 20 characters` despite it being a test case for invalid token.
- Try to have consistent structure between the test files. Some have only one describe block whilst others have two different describe blocks for success/error cases. Then within them also try to keep it consistent which one comes first, success or error cases.

## Test Design

- Consider making a `requestHelper` function to avoid repetition and make the request functions more elegant.
- Consider moving your interfaces to a new file to contain all of them for the whole project. Maybe called `types.ts` or `interfaces.ts`?
  - Similarly with the error codes/objects and constants.
  - To avoid repeated code. DRY (Don't repeat yourself)

# Code Quality

- Try to keep helper functions either in a separate file (or above/below all of the "main" functions). `invalidCharExists`, `generateRandomColourOrder`
- Inconsistent whitespace lines between JSDoc and the function definition. Some have whitespace some don't.
- Possibly consider using even more helper functions to abstract your code and any repeated code.
- Removed commented code in `server.ts` (and in general) if not needed

# Git Practices

- Don't commit your persistence file, if populated then everyone viewing your codebase now has information on all your users. Shocker, this is bad! :scream:
- @Leo Merge Requests
  - "Added type checking too pipeline", spelling...
  - "Leo/fixing merge error" very vague
- @Joyce
  - Are you committing every second??? Why do you have so many? Commit framer
- Remember to try to make your commit names as descriptive as possible!

# Teamwork

- I miss the group photos :pleading:
- For issues, rather than `do X` - you should specify what you are "doing" either in the title or description. This could be simply just write tests and implementation for x function/route.
  - Missing due dates for tasks
  - Love the color coding and tags for everyone!

# H11A_CRUNCHIE

Hey CRUNCHIE!

This file will contain general feedback for your team.
Let me know via Teams if you have any questions :D

# Test Quality

## Test Coverage

## Test Clarity

## Test Design

# Code Quality

# Git Practices

# Teamwork

# H11A_DREAM

Hey DREAM!

This file will contain general feedback for your team.
Let me know via Teams if you have any questions :D

# Test Quality

## Test Coverage

## Test Clarity

## Test Design

# Code Quality

# Git Practices

# Teamwork

# H11A_EGGS

Hey EGGS!

This file will contain general feedback for your team.
Let me know via Teams if you have any questions :D

# Test Quality

## Test Coverage

## Test Clarity

## Test Design

# Code Quality

# Git Practices

# Teamwork
