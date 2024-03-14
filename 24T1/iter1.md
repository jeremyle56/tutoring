# F13A_CRUNCHIE

Hi CRUNCHIE!

This file will contain general feedback for your team.
Let me know via Teams/Emails if you have any questions :)

# Test Quality

## Test Coverage

- Missing `adminQuizRemove()` - incomplete function.
- You should call other functions to test for side effects. For example if you run `adminUserDetailsUpdate` you can then run `adminUserDetails` to check that the details are updated correctly.
  - Similarly for `quiz.test.js`. For example updating a quiz can be checked with details. Or removing/creating a quiz can be checked with list.

## Test Clarity

- Try to keep the testing structure consistent. There are some functions with error cases before the success cases but for some other functions it is swapped.
- The describe blocks are very unrestrictive, you should have more than just the function name.
- Arguably some excessive commenting but is okay.

## Test Design

- There is a lot of repeated code which could be fixed by just introducing an `beforeEach()` block
- Using the `getData()` and accessing the data is not black-box testing.
  - `getData()` is used and called throughout the `auth.test.js`. Accessing data and using this to test assumes the design and implementation of the data structure making it not black box testing. Refer to the lecture slides and section 3.4.2 for more details about black box testing.

# Code Quality

- Your `JSDOC` comment should add some descriptions of the function and the parameters.
  - Move the function descriptions from the function to the JSDOC
- Inconsistent indentions, some are 2 spaces some are 4.
- Would like to see more whitespace (blank lines) between blocks of code. It makes it more readable.
- Some functions in `quiz.js` missing any comments at all.
- Would like to see the use of some helper functions for any repeated code to increase modularity of the codebase.

# Git Practices

- Remember to have descriptive commit names and merge request names
- Don't reuse branches, create new ones.
- Make sure all merge requests are approved before they are merged in. Make sure that the owner of the merge request is clicking the merge button.
- Keep testing and implementation of the functions in the one merge request. You never want to merge failing tests into master.
- Try to limit each branch and merge request to one function if possible.

# Teamwork

- With Gitlab board, make sure that your issues are more descriptive. Make sure you specify either testing, implementation or both. You can add description/subtasks to help with this if needed.
  - Make sure you are actively using them as well throughout the iteration
  - Add due dates to the issues
- Remember that standups are different to meetings. You should try to have at least one of each per week.
  - Stand ups should occur on teams and can just me a thread of progress update messages
- Good work with meeting mins. Try to rotate the person who is writing them.

# F13A_DREAM

Hi DREAM!

This file will contain general feedback for your team.
Let me know via Teams/Emails if you have any questions :)

# Test Quality

## Test Coverage

- You need a success case for `clear()` which also checks the correct return type from the function.
- Don't use `expect.any()` everywhere. If you know the data and the tests are still black-box then it is okay to use them.

## Test Clarity

- More descriptive describe block names. Just the name of the function is not sufficient.

## Test Design

- A bit repetitive on the tests. There are some cases where you are over testing/ repeating what is essentially the same test. This is not needed.
- Consider using more `beforeEach()` blocks. This makes sure you have less repeated code. For example, for almost every test we need to register a user, so why not put this in a `beforeEach` block.
- Some of the invalid ID checking is not black-box testing. Your options are to
  - Not register a user and check. Because no user is registered this will obviously error
  - Register only one user and then feed in that `userId + 1`. This ensures that it will be invalid as there is only one user.

# Code Quality

- Good overall
- Would like to see more helper functions to increase modularity. Keep every function as small as possible and the amount of repeated code also as small as possible.
- Good clarify, only concern was that there are barley any comments within the functions themselves.

# Git Practices

- Remember to have descriptive commit names and merge request names
- Remember that master has to remain stable (with all test passing). This means you have to merge your implementation and tests in one branch
  - For iteration 2 this means the pipeline should always pass

# Teamwork

- Great communication with meetings and wonderful meeting minutes and standups.
- Very good use of issue boards

  - If the tasks get big consider using descriptions/subtasks to add more to an issue

- Also thank you for uploading profile pictures, it makes my marking much easier :)

# F13A_EGGS

Hi EGGS!

This file will contain general feedback for your team.
Let me know via Teams/Emails if you have any questions :)

# Test Quality

## Test Coverage

- `clear()` is lacking any functionality testing. Currently the only test is for the return value.
- Instead of checking side effects by using the data, you should instead call other functions. For example if you run `adminUserDetailsUpdate` you can then run `adminUserDetails` to check that the details are updated correctly.
  - Similarly for `quiz.test.js`. For example updating a quiz can be checked with details. Or removing/creating a quiz can be checked with list.

## Test Clarity

- Some of your indents are indents using tabs. Indents using spaces is generally preferred. If you are unsure how to swap this ask either me or the forum.
- Some variables are not used or not modified. In this case we can either not assign them as variables or use `const` instead of `let`.
- Good variable names, good comments. Arguably excessive but good nonetheless.

## Test Design

- `getData()` is used and called throughout the `auth.test.js`. Accessing data and using this to test assumes the design and implementation of the data structure making it not black box testing. Refer to the lecture slides and section 3.4.2 for more details about black box testing.
  - Also use of `expect(userId).toStrictEqual({ authUserId: 1});` which also violates black-box testing.
- Ensure that your test are laid out in an consistent manner. For example `adminAuthRegister` had error cases and then a success case but `adminAuthLogin` swapped the order around.
- Consider using more `beforeEach` blocks to avoid having to write the `authRegister` code eventide.
- Consider using `test.each` if tests look similar.

# Code Quality

- Your code was clear with good naming of variables.
- `quiz.js` lacked some comments compared to `auth.js`
- Good work with the helper functions, but they should actually be used to have better modularity.
- Again try to keep consistent between tab and space spacing.
- Missing some function documentation.

# Git Practices

- Great with everything merge requests
- Remember to have good commit names
- Continue the good work!

# Teamwork

- Good use of issue boards. Better to actually use the boards instead of the labels.
  - Make sure you are actually closing the issue and dragging them across the boards.
- Week 4 Meeting minutes agenda not present
- Do you have a record of stand-ups?
- You should rotate who writes the meeting minutes.
