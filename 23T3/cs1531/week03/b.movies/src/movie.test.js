import { clear, movieAdd, movieEdit, moviesList } from "./movie";

beforeEach(() => {
  clear();
});

const ERROR = { error: expect.any(String) };

describe("Test for movieAdd error and return value", () => {
  test("movieAdd empty title", () => {
    expect(movieAdd("", "shaam")).toStrictEqual(ERROR);
  });

  test("movieAdd empty director", () => {
    expect(movieAdd("Riyasat", "")).toStrictEqual(ERROR);
  });

  test("movieAdd both title and director empty", () => {
    expect(movieAdd("", "")).toStrictEqual(ERROR);
  });

  test("movieAdd correct return type", () => {
    expect(movieAdd("Shrek", "adam")).toStrictEqual({
      movieId: expect.any(Number),
    });
  });
});

// Fails as implementation is not done.
describe("movieEdit: errors", () => {
  test("invalid id - there are no movies", () => {
    expect(movieEdit(42, "bob", "fred")).toStrictEqual(ERROR);
  });

  describe("one movie added", () => {
    let movie;
    beforeEach(() => {
      movie = movieAdd("Bananas", "Apples");
    });

    test.each([
      { title: "", director: "oliver" },
      { title: "oliver", director: "" },
      { title: "", director: "" },
    ])(
      "Error editing movie with title $title and director $director",
      ({ title, director }) => {
        expect(movieEdit(movie.movieId, title, director)).toStrictEqual(ERROR);
      }
    );
  });
});

// test.todo("Test for movieAdd error and return value");

// test.todo("Test for movieEdit error and return value");

// test.todo(
//   "Test for moviesList, including behaviour/side-effects for movieAdd and movieEdit"
// );
