package com.example.cloudsql.repository;

import com.example.cloudsql.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
    Optional<Movie> findByName(String movieName);
}
