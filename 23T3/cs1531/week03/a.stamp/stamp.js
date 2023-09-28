import validator from "validator";
// Formats: https://date-fns.org/docs/format
import { format } from "date-fns";
import { v4 } from "uuid";

function stamp(email) {
  if (!validator.isEmail(email)) {
    return { error: `invalid email: '${email}'` };
  }
  return {
    identifier: v4(),
    timeString: format(new Date(), "EEEE - hh:mm:ss aaa"),
  };
}

console.log(stamp("invalid@@email"));
console.log(stamp("valid@email.com"));
