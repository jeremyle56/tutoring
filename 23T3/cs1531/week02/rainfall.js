/**
 * Compute the average of only the positive
 * elements in the integer array.
 * Return null if there are no positive integers.
 */
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
