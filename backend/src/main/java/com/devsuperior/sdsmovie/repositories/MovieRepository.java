package com.devsuperior.sdsmovie.repositories;

import com.devsuperior.sdsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
