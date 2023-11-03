import { IncomingHttpHeaders } from 'http';
import request, { HttpVerb } from 'sync-request-curl';
import HTTPError from 'http-errors';
import { port, url } from './config.json';
import type { EmptyObject, MovieAddReturn, MovieListReturn } from './types';

// ========================================================================= //

const SERVER_URL = `${url}:${port}`;
const TIMEOUT_MS = 20 * 1000;

interface Payload {
  [key: string]: any;
}

// Helpers
const requestHelper = (
  method: HttpVerb,
  path: string,
  payload: Payload,
  headers: IncomingHttpHeaders = {}
): any => {
  let qs = {};
  let json = {};
  if (['GET', 'DELETE'].includes(method.toUpperCase())) {
    qs = payload;
  } else {
    // PUT/POST
    json = payload;
  }

  const url = SERVER_URL + path;
  const res = request(method, url, { qs, json, headers, timeout: TIMEOUT_MS });

  let responseBody: any;
  try {
    responseBody = JSON.parse(res.body.toString());
  } catch (err: any) {
    if (res.statusCode === 200) {
      throw HTTPError(500,
        `Non-jsonifiable body despite code 200: '${res.body}'.\nCheck that you are not doing res.json(undefined) instead of res.json({}), e.g. in '/clear'`
      );
    }
    responseBody = { error: `Failed to parse JSON: '${err.message}'` };
  }

  const errorMessage = `[${res.statusCode}] ` + responseBody?.error || responseBody || 'No message specified!';

  // NOTE: the error is rethrown in the test below. This is useful becasuse the
  // test suite will halt (stop) if there's an error, rather than carry on and
  // potentially failing on a different expect statement without useful outputs
  switch (res.statusCode) {
    case 400: // BAD_REQUEST
    case 401: // UNAUTHORIZED
      throw HTTPError(res.statusCode, errorMessage);
    case 404: // NOT_FOUND
      throw HTTPError(res.statusCode, `Cannot find '${url}' [${method}]\nReason: ${errorMessage}\n\nHint: Check that your server.ts have the correct path AND method`);
    case 500: // INTERNAL_SERVER_ERROR
      throw HTTPError(res.statusCode, errorMessage + '\n\nHint: Your server crashed. Check the server log!\n');
    default:
      if (res.statusCode !== 200) {
        throw HTTPError(res.statusCode, errorMessage + `\n\nSorry, no idea! Look up the status code ${res.statusCode} online!\n`);
      }
  }
  return responseBody;
};

// ========================================================================= //

const movieAdd = (title: string, director: string): MovieAddReturn => {
  return requestHelper('POST', '/movie/add', { title, director });
};

const movieEdit = (movieId: number, title: string, director: string): EmptyObject => {
  return requestHelper('PUT', `/movie/${movieId}`, { title, director });
};

const moviesList = (): MovieListReturn => {
  return requestHelper('GET', '/movies/list', {});
};

const clear = (): EmptyObject => {
  return requestHelper('DELETE', '/clear', {});
};

// ========================================================================= //

beforeEach(() => {
  clear();
});

describe('movieAdd: error and return value', () => {
  test.each([
    { title: '', director: 'Christopher Nolan' },
    { title: 'The Prestige', director: '' },
    { title: '', director: '' },
  ])("Error adding movie with title '$title' and director '$director'", ({ title, director }) => {
    expect(() => movieAdd(title, director)).toThrow(HTTPError[400]);
  });

  test('movieAdd has correct return type', () => {
    expect(movieAdd('The Prestige', 'Christopher Nolan')).toStrictEqual({ movieId: expect.any(Number) });
  });
});

describe('movieEdit: error and return value', () => {
  test('invalid id given when no movies have been created', () => {
    expect(() => movieEdit(999, 'Django Unchained', 'Quentin Tarantino')).toThrow(HTTPError[400]);
  });

  describe('With one movie created', () => {
    let movie: MovieAddReturn;
    beforeEach(() => {
      movie = movieAdd('Django Unchained', 'Quentin Tarantino');
    });

    test.each([
      { title: '', director: 'Quentin Tarantino' },
      { title: 'Django Unchained', director: '' },
      { title: '', director: '' },
    ])("Error editing movie with title '$title' and director '$director'", ({ title, director }) => {
      expect(() => movieEdit(movie.movieId, title, director)).toThrow(HTTPError[400]);
    });

    test('invalid id given when one movie exists', () => {
      expect(() => movieEdit(movie.movieId + 1, 'Encanto', 'Bryan Howard/Jared Bush')).toThrow(HTTPError[400]);
    });

    test('valid id, correct empty object return type', () => {
      expect(movieEdit(movie.movieId, 'Encanto', 'Bryan Howard/Jared Bush')).toStrictEqual({});
    });
  });
});

describe('moviesList: testing side effects of movieAdd and movieEdit', () => {
  test('empty movies list', () => {
    expect(moviesList()).toStrictEqual({ movies: [] });
  });

  test('one movie', () => {
    const movie = movieAdd('Django Unchained', 'Quentin Tarantino');
    expect(moviesList()).toStrictEqual({
      movies: [{ movieId: movie.movieId, title: 'Django Unchained', director: 'Quentin Tarantino' }]
    });
  });

  test('multiple movies', () => {
    const movie1 = movieAdd('The Prestige', 'Christopher Nolan');
    const movie2 = movieAdd('Django Unchained', 'Quentin Tarantino');
    const movie3 = movieAdd('Encanto', 'Bryan Howard/Jared Bush');
    expect(moviesList()).toStrictEqual({
      movies: [
        { movieId: movie1.movieId, title: 'The Prestige', director: 'Christopher Nolan' },
        { movieId: movie2.movieId, title: 'Django Unchained', director: 'Quentin Tarantino' },
        { movieId: movie3.movieId, title: 'Encanto', director: 'Bryan Howard/Jared Bush' },
      ]
    });
  });

  test('edited movie have correct details', () => {
    const movie = movieAdd('Django Unchained', 'Quentin Tarantino');
    movieEdit(movie.movieId, 'Encanto', 'Bryan Howard/Jared Bush');
    expect(moviesList()).toStrictEqual({
      movies: [{ movieId: movie.movieId, title: 'Encanto', director: 'Bryan Howard/Jared Bush' }]
    });
  });
});
