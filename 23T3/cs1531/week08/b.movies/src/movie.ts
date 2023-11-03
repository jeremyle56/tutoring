import HTTPError from 'http-errors';
import { getData } from './dataStore';
import type { EmptyObject, MovieAddReturn, MovieListReturn } from './types';

export function clear(): EmptyObject {
  getData().movies = [];
  return {};
}

export function movieAdd(title: string, director: string): MovieAddReturn {
  if (title === '' || director === '') {
    throw HTTPError(400, `Title '${title}' or director ${director} is empty`);
  }
  const data = getData();
  const movieId = data.movies.length;
  data.movies.push({ movieId, title, director });
  return { movieId };
}

export function movieEdit(
  movieId: number,
  title: string,
  director: string
): EmptyObject {
  const movie = getData().movies.find((m) => m.movieId === movieId);
  if (movie === undefined) {
    throw HTTPError(400, `No existing movie with movieId: ${movieId}`);
  }
  if (title === '' || director === '') {
    throw HTTPError(400, `Title '${title}' or director ${director} is empty`);
  }
  movie.title = title;
  movie.director = director;
  return {};
}

export function moviesList(): MovieListReturn {
  return { movies: getData().movies };
}
