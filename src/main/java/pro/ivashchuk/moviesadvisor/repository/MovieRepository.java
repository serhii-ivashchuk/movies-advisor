package pro.ivashchuk.moviesadvisor.repository;

import pro.ivashchuk.moviesadvisor.domain.Movie;

public interface MovieRepository {
    Iterable<Movie> findAll();
    Movie findById(String id);
    Movie save(Movie movie);
}
