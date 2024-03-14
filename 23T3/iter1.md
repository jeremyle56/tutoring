# H11A_AERO

Hi AERO!

This file will contain general feedback for your team.
Let me know via Teams/Emails if you have any questions :)

# Test Quality

## Test Coverage

- Use `.toStrictEqual` instead of `typeOf -> toBe`
- Your last `adminQuizCreate` test is not blackbox as what happens if an implementation decides to not reuse ids and instead just count upwards.
- Not testing many side effects, including but not limited to:
  - When testing `adminQuizRemove`, in addition to checking the return type you could also call `adminQuizList` to test that the quiz was indeed removed
  - Checking the details of a quiz have been changed with `adminQuizInfo` once the name or description have been changed
  - You missed the case of testing the actual values of `timeCreated` and `timeLastEdited`. All your test just assume for them to be `expect.any(Number)`. You should check that when you edit the quiz `timeLastEdited` is greater than before. Similarly with creating a quiz after another one.

## Test Clarity

- Unused import, `getData` in `quiz.test.js`. This should not be imported anyway as your test should be blackbox and not use this.
- Use better describe names than just the function name

## Test Design

- Hard-coding the `authUserId/quizId` in your tests (mainly in `auth.test.js`)
  - Not blackboxed - you should use the return value of `adminAuthRegister` or `adminQuizCreate` instead!
  - Or if it for an invalid `authUserId/ quizId`, then you can either not register a user, or use the registered user's id + 1 since this is guaranteed not to work as there is only one user.

# Code Quality

- Helper functions are lacking documentation - they should have description of what they do
- Inconsistent whitespace e.g. `authAdminLogin`
- Could consider using javascript array/object methods instead of using for loops and indexes.

# Git Practices

- Remember to have clear commit names
- Remember to commit your tests then commit your implementation. Then once all the tests are passing you can create a merge request

# Teamwork

- Are you guys chatting elsewhere?
  - Would like to see more talk in the teams channel (especially from Leo)
  - Would like to see better meeting attendance
  - Would like to see standups!
- For Gitlab taskboards
  - Would like to see more activity (it seems some people are not dragging to the doing board?)
  - Tasks do not contain any descriptions of subtasks (or just have better names)

# H11A_BOOST

Hi BOOST!

This file will contain general feedback for your team.
Let me know via Teams/Emails if you have any questions :)

# Test Quality

## Test Coverage

- Using `expect.any(Number)` when you don't need to.
  - For example `adminQuizInfo` since you know the info of the quiz you created
- Not testing many side effects, including but not limited to:
  - When testing `adminQuizRemove`, in addition to checking the return type you could also call `adminQuizList` to test that the quiz was indeed removed
  - Checking the details of a quiz have been changed with `adminQuizInfo` once the name or description have been changed
  - You missed the case of testing the actual values of `timeCreated` and `timeLastEdited`. All your test just assume for them to be `expect.any(Number)`. You should check that when you edit the quiz `timeLastEdited` is greater than before. Similarly with creating a quiz after another one.
- All error and success cases have been tested.

## Test Clarity

- `adminAuthLogin` has an inconsistent indent with the `beforeEach` block
- Inconsistent indents in `adminQuizCreate.test.js`
  - Any many other files!
- It is preferable to have white space between your object brackets (i.e. `{ error: expect.any(String) }` as opposed to `{error: expect.any(String)}`)
- Nice how you consistently had the error cases tested before the success cases
- A suggestion could be to separate the error and success cases by describe blocks (have one describe block for success and one for errors)
  - This will also help you with better describe block names

## Test Design

- The first error case for `adminUserDetails` could be considered invalid. This is because you are testing `authUserId` with a string when it is a number. You have introduced a type error which is not consistent with the spec. (Typescript will fix this anyway)
  - Similarly for other functions and cases of this.
- Jeremy does indeed like boost!

# Code Quality

- `adminAuthRegister` is the largest function in terms of code but is the only function that has no comments other than the JSDoc.
- Recommended to place helper functions separate from the functions you are required the implement. This can either be above or below the required functions - with a clear distinction between the two. Or in another file all together
- Some inconsistent use of camelCase. Each other in a variable name should be distinguished by a capital letter.
  - `targetuser` in `adminAuthLogin`
  - `existingnames` in `adminQuizCreate`
- Inconsistent whitespace especially with for loops in `adminQuizCreate`
- Extra white space in `adminQuizUpdateName`, `adminQuizInfo`
- You had relatively long functions, consider using helper functions to fix this
  - Alternatively, replace some of the for loops with the array/object methods such as `.find()`, `.filter()`, `.map()` etc...

# Git Practices

- Could use better merge request names. Instead of `name/function` it could be `completed tests and implementation for x function`
- Could do with better commit names, also why are there repeated commits?
- Remember to do your tests before implementation and commit them

# Teamwork

- Nice looking issue boards! Continue to use them and use the in progress board (it also might help to add descriptions/subtasks to your issues)
- Missing week 4 meeting minutes?

# H11A_CRUNCHIE

Hi CRUNCHIE!

This file will contain general feedback for your team.
Let me know via Teams/Emails if you have any questions :)

# Test Quality

## Test Coverage

- You missed the case of testing the actual values of `timeCreated` and `timeLastEdited`. All your test just assume for them to be `expect.any(Number)`. You should check that when you edit the quiz `timeLastEdited` is greater than before. Similarly with creating a quiz after another one.
- Using `expect.any(Number)` when you don't need to.
  - For example, when testing `adminUserDetails`, you know the value the number of failed/successful logins.
  - Also for `adminQuizInfo` since you know the info of the quiz you created
- Otherwise your test were very extensive covering all of the error, success cases and other side effects.

## Test Clarity

- One of your tests for `adminAuthRegister` had the name `NameLast contains valid characters` despite it testing invalid characters
- A better describe name then `adminAuthLogin`, `adminQuizInfo`, etc.. should be used
- There is consistent format of the test files. Some have two describe blocks for error and correct cases (sometimes in different orders) whilst others have a different structure. Try to stick to someone consistent. Helps others easily navigate through the code base.
- `adminQuizNameUpdate` and `adminQuizDescriptionUpdate` have the `created` variable but it is unused

## Test Design

- Some of the `adminAuthRegister` tests seem repetitive.
- Do you need a `beforeEach()` for a describe block with only one test? - `adminQuizCreate`
- `adminQuizRemove` you can use one `beforeEach()` instead of two.
- Some of your `adminQuizRemove()` tests, test feeding in an incorrect parameter type. You can always assume that the correct parameter type is entered and should not introduce this error. (This is fixed by TypeScript anyway)
  - You also do not need to number your test, but if this helps with organising, feel free to continue
  - You could have also used `adminQuizList` to check if the quiz was properly removed

# Code Quality

- I think it is more organised to keep your helper function completely separate from the functions you are required to implement. This could be either above or below the required functions or in another file entirely.
- Everything else looks good!

# Git Practices

- Remember to have descriptive commit names and merge request names

# Teamwork

- Your 26/09/2023 meeting minutes are missing a list of attendees
- Use your gitlab issueboards
  - I can see only some of you are using them and moving tasks
  - Assign people tasks and make sure to move them when you are working/have worked on them.
  - Also add descriptions/subtasks to them to help people know what you are doing

# H11A_DREAM

Hi DREAM!

This file will contain general feedback for your team.
Let me know via Teams/Emails if you have any questions :)

# Test Quality

## Test Coverage

- All error cases and success cases
- Missed some side effects
  - For example when testing `adminQuizRemove`, in addition to checking the return type you could also call `adminQuizList` to test that the quiz was indeed removed
  - You missed the case of testing the actual values of `timeCreated` and `timeLastEdited`. All your test just assume for them to be `expect.any(Number)`. You should check that when you edit the quiz `timeLastEdited` is greater than before. Similarly with creating a quiz after another one.

## Test Clarity

- The describe block for `adminQuizRemove` is incorrectly named `adminQuizNameUpdate Testing`
- Your `auth.test.js` had correct cases before error cases but then `quiz.test.js` swapped this. Better to keep this consistent.
- Otherwise your test was clearly laid out and easy to follow

## Test Design

- For `adminAuthLogin` was it necessary to have the data array be assigned before each test?
- The use of `.toBeUndefined()` and `.toBeDefined()` is interesting and not necessary. It would be better to just check if the return object is `.toStrictEqual(expected)`.
- Consider using `beforeEach` to register users since almost all test cases require a user to be registered.

# Code Quality

- `adminQuizList` has an uncessary white space
- No use of any helper functions but you kept your functions relatively small. Still should consider using helper functions for any repeated code.
  - The use of JS features helped keep this small!

# Git Practices

- Remember to have descriptive commit names and merge request names
- Remember that master has to remain stable (with all test passing). This means you have to merge your implementation and tests in one branch
  - For iteration 2 this means the pipeline should always pass

# Teamwork

- Great communication with meetings and wonderful meeting minutes and standups.
- Very good use of issue boards

  - If the tasks get big consider using descriptions/subtasks to add more to an issue

- Also thank you for uploading profile pictures, it makes my marking much easier :)

# H11A_EGGS

Hi EGGS!

This file will contain general feedback for your team.
Let me know via Teams/Emails if you have any questions :)

# Test Quality

## Test Coverage

- It looks like you covered most of the cases but there are a few that you are missing.

  - `adminQuizNameUpdate` - case where name is either less than 3 characters long or more than 30 characters long

- You missed the case of testing the actual values of `timeCreated` and `timeLastEdited`. All your test just assume for them to be `expect.any(Number)`. You should check that when you edit Tea quiz `timeLastEdited` is greater than before. Similarly with creating a quiz after another one.

## Test Clarity

- Spelling mistakes :skull:

```javascript
    test('Successfully created mutiple quizzes into the datastore', () => {
    test('Succesfully updates the quiz name', () => {
```

- It is much preferred to use 2 space indents in this course rather than tab character indents (a few of you test files have this)
- You have some uncessary imports, i.e. if the file does not call that function you don't need to import it.
  - With imports, if they come from the same file you can group them together
- Easy to follow and understand, good naming and separation of errors and success

## Test Design

- When testing a specific function it makes sense to always check the return value of that function. For example in the `adminAuthLogin` test sometimes you just call `adminAuthLogin` and don't check that it returns what you expect. Calling `authRegister` without checking is fine here because we assume that `adminAuthRegister` will check those.
- For the cases where `AuthUserId` is not a valid user - do you have to necessarily register one?
- Sometimes it is not necessary to assign function values to a variable, simply calling the function is sufficient.
- Consider using `beforeEach` to register users since almost all test cases require a user to be registered.

# Code Quality

- Your code was clear with good naming of variables.
- Some helper functions were missing documentation - it is also easier to keep track of helper functions if you move them towards the bottom/top of the file or out to a new file (e.g. `helpers.js`) entirely.
- Some functions were missing comments entirely, it can be hard to understand/remember the logic without comments.
- Sometimes you used for loops when they could be substituted with an array/object method such as `.find()`, `.filter()` etc..

# Git Practices

- Great with everything merge requests
- Remember to have good commit names
- Continue the good work!

# Teamwork

- Amazing use of trello taskboard :starstuck:
- Meeting minutes should also include the time and location (online: on teams/discord/etc.. in person: the actual physical location)
