/*
 * Helper function that throws an error if the given message contains
 * any character that is neither lowercases nor spaces, i.e. /[^a-z ]/
 */
const throwErrorIfInvalidMessage = (message: string) => {
  throw new Error(
    `Message '${message}' must contain only lower-case characters and spaces.`
  );
};

export const findVowels = (message: string) => {
  if (/[^a-z ]/.test(message)) {
    throwErrorIfInvalidMessage(message);
  }

  const countChar = (c: string) =>
    (message.match(new RegExp(c, 'g')) || []).length;

  return {
    a: countChar('a'),
    e: countChar('e'),
    i: countChar('i'),
    o: countChar('o'),
    u: countChar('u'),
  };
};
