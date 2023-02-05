package com.digitazon.onlyrarevideobe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitazon.onlyrarevideobe.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    // HERE go Custom methods!
}
