# F13B_CRUNCHIE

Hey CRUNCHIE!

This file will contain any feedback additional feedback I did not mention in the merge request review.

Let me know via Teams if you have any questions :D

# Test Quality

A bit hard to give proper feedback on your test since they were so limited. Please try to do more of the iteration next time as the project is worth 90% of your grade.

## Test Coverage

- Missing tests for `adminQuizRestore`, `adminQuizTrashEmpty`, `adminQuizTransfer` and all question routes.

## Test Clarity

- Don't just leave commented out tests, if you're not using them please remove. Only add if it they are being used.

## Test Design

- The `clear()` tests should not be included in the `auth.test.js` file.
- Should incorporated use of wrapper functions into your tests. Examples can be found from `lab05_forum` auto-marking or week 5 tutorial.
  - It makes the code more concise and easier to read.

# Code Quality

- All your interfaces should be moved to a separate file possibly called `interfaces.ts` or `types.ts`
  - Same concept with helper functions
- Please add some white space (empty lines) between big code blocks for readability.

# Git Practices

- Ensure that you have good merge request and commit names. (You should be on top of this by now)
- Make sure that you are still committing your tests before you commit your implementation

# Teamwork

- For your issue boards:
  - Set due dates to every issue
  - Make sure all issues have a description
  - Make sure all issues are assigned to someone in the group
- Please record standups on teams (everyone should reply to one thread)
- Write meeting mins every week and rotate who writes it

# F13B_DREAM

Hey DREAM!

This file will contain any feedback additional feedback I did not mention in the merge request review.

Let me know via Teams if you have any questions :D

# Test Quality

## Test Coverage

- `adminQuizQuestionUpdate` missing test for "Question Id does not refer to a valid question within this quiz"

## Test Clarity

- Add white space between your tests.
- Repeated test in `adminQuizRestore`
- Some of your lines are very lengthy, try to keep them under 120.

## Test Design

- Consider moving all your test files into a separate `test/` folder.

# Code Quality

- `setData()` is never called in `auth.ts`?
- Consider using more helper functions like for fetching tokens since they are used for every function.

# Git Practices

- Very good, ideally you should making test and committing test before any implementation

# Teamwork

- Make sure every issue is
  1. Assigned to someone of the group
  2. Have descriptions
  3. Have due dates

# F13B_EGGS

Hey EGGS!

This file will contain any feedback additional feedback I did not mention in the merge request review.

Let me know via Teams if you have any questions :D

# Test Quality

## Test Coverage

- Really good coverage, could add more testing for side affects.

## Test Clarity

- Don't include white space when you don't need it
- Don't include two blank lines when one is sufficient.
- For routes with the same name, the test blocks need to be more clear about what functionality it is testing

## Test Design

- All your request helper functions should be moved to one file and just exported all from there.
- Use `toStrictEqual` instead of `toBe`

# Code Quality

- Some white space is needed in some areas

# Git Practices

- Some unclear commit names
- You should try to split merge requests into one per function (this isn't necessary but is good practice, makes the merge requests minimal)

# Teamwork

- Make sure all tickets are assigned and have due dates
