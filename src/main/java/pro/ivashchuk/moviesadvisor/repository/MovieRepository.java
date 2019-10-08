package pro.ivashchuk.moviesadvisor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.ivashchuk.moviesadvisor.domain.Movie;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
