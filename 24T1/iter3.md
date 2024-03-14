# H11A_AERO

## Test Quality

- You should probably try to add some whitespace to the `testHelper.ts` as it is quiet the eyesore.
- It is somewhat difficult to navigate and find different routes if you want to add a test.

## Code Quality

- Could use constants for repeated magic numbers, one-offs are okay because the spec demands them.

## Feature Demonstration

- Frontend for the most part worked.
- Errors with trash, errors with results, errors with thumbnail image
- Deployment doesn't work with API clients

## Requirements and Design

- Perfect

# H11A_BOOST

## Test Quality

- You need to keep your test structures consistent. Some are just one describe block with errors first whilst others are two describe blocks with success cases first.
- Need to update naming, if the function is now v2 you should change the name of the wrapper or make another one.

## Code Quality

- Should remove the unnecessary comments. If they are from old code that is no longer used there is no need to keep them.
- Could use constants for repeated magic numbers, one-offs are okay because the spec demands them.

## Feature Demonstration

- Frontend breaks when trying to view results, unable to test the results CSV.

## Requirements and Design

- The last interview question focused on trying to get SOLUTIONS from them rather than just eliciting PROBLEMS

# H11A_CRUNCHIE

## Test Quality

- Not all wrapper functions where in the helper, like `adminAuthLogoutV2` for example.
- `adminUpdateSessionState` had a lot of test with the same name despite doing slightly different things.
- Maybe a little too many tests (which are testing kinda similar things)
- Not really any comments.

## Code Quality

- You had constants for your status code but only used them sometimes.

## Feature Demonstration

- Unable to view the sessions, so number to test anything related to playing the quiz.
- Unable to test + local any results CSV.

# H11A_DREAM

## Test Quality

- Left some TODO comments
- Hard to find tests for one specific route since they are all clumped into one file

## Code Quality

- Could use constants for repeated magic numbers, one-offs are okay because the spec demands them.

## Feature Demonstration

- Result doesn't work on frontend
- Couldn't test Results CSV, code looks correct
- Couldn't find deployment URL

## Requirements and Design

- Some request (especially GET requests) should have some sort of output rather than just status code.

# H11A_EGGS

## Test Quality

- Missing test cases such has imgUrl does not begin with 'http://' or 'https://' for adminQuizUpdateThumbnail
- Inconsistent test file format. Some are describe blocks separated by status code whilst some just say error cases and success cases

## Code Quality

- Could use constants for repeated magic numbers, one-offs are okay because the spec demands them.

## Feature Demonstration

- Frontend was a bit buggy
- State wouldn't change after Question countdown which meant I was unable to test all quiz related things
- Successful deployment url but didn't work with HTTP clients

## Requirements and Design

- Perfect
