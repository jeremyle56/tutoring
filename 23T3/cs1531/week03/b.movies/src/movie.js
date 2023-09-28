import { getData } from "./dataStore";

export function clear() {
  getData().movies = [];
  return {};
}

export function movieAdd(title, director) {
  if (title === "" || director === "") {
    return { error: "Empty string given for title or director" };
  }

  const data = getData();
  const movieId = data.movies.length;
  data.movies.push({ movieId, title, director });
  return { movieId: movieId };
}

export function movieEdit(movieId, title, director) {
  // TODO implement
  return {};
}

export function moviesList() {
  // TODO implement
  return { movies: [] };
}
