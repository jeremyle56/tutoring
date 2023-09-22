# Tutorial 2

## A. Code Review

In random groups, you have 10 minutes to review the code in [review.js](review.js):

```js
let x=[
    {
        name: 'Tammy',
        iq: -92,
    },
    {
        name: 'Juliana',
        iq: 160,
    },
    {
        name: 'Runy',
        iq: 128,
    },
];

let a=0;
let s=[];
for (let i = 0; i < x.length; i++) {
    a += x[i].iq;
    if (x[i].iq > 120) {
        s.push(x[i].name);
    }
}

let b = Math.floor(a / x.length);
console.log(b);
console.log(s);
```

Discuss the questions below:

1. What does it do?

1. How can the style be improved here?

1. How can we modify the code to be less like C and more Javascripty?

Share some of your findings with the class and assist your tutor in developing a new solution.
How different is this from the original code?

## B. Teamwork

In random groups,

1. Brainstorm a list of good and poor attributes for team members working on a project.

1. Suppose there is a member in a group who has gone silent and has yet to complete much of their assigned work. The reason is unknown.
    - How should the remaining members approach the situation?

    - What can groups do beforehand such that if this occurs, they can manage or minimise the impact?

## C. Using Javascript & Git

1. Pretend you are Tom. As Tom, create and checkout a new branch called `tom/rainfall`

1. Copy the `rainfall` function below into [rainfall.js](rainfall.js), then add, commit, push and follow the output link to create Tom's first merge request on Gitlab (**don't** click merge yet).
    <details close>
    <summary>Click to view Tom's solution</summary>

    ```js
    // Tom's implementation of rainfall
    function rainfall(integers) {
      let total = 0;
      let positiveCount = 0;
      for (const integer of integers) {
        if (integer > 0) {
          total += integer;
          positiveCount++;
        }
      }
      return positiveCount > 0 ? total / positiveCount : null;
    }
    ```

    </details>

1. Now, pretend you are Jerry. In your terminal, create another branch **from master** (and not the branch Tom created) called `jerry/rainfall`. This can be done by either:
    ```shell
    $ git checkout master
    $ git checkout -b jerry/rainfall
    ```
    or:
    ```shell
    $ git checkout -b jerry/rainfall master
    ```

1. In `jerry/rainfall`, replace the stub `rainfall` function with the solution below. Add, commit, push and create the second merge request. You should now have two open merge requests on Gitlab.
    <details close>
    <summary>Click to view Jerry's solution</summary>

    ```javascript
    /**
     * Jerry's implementation of rainfall
     *
     * Compute the average of only the positive
     * elements in the integer array.
     * Return null if there are no positive integers.
     */
    function rainfall(integers) {
      let total = 0;
      let count = 0;
      for (let i = 0; i < integers.length; i++) {
        if (integers[i] > 0) {
          total += integers[i];
          count++;
        }
      }
      if (count === 0) {
        return null;
      } else {
        return total / count;
      }
    }
    ```

    </details>

1. Merge `tom/rainfall` to your GitLab's master branch.

1. Now, try to merge in `jerry/rainfall`. What do you see?

1. In the terminal, ensure that you are on the `jerry/rainfall` branch. Pull/merge in the latest code from Tom (which is now in master).

1. Resolve all conflicts, push to Gitlab and attempt to merge `jerry/rainfall` on GitLab again.

