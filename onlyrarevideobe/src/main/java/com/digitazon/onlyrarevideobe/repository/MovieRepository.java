package com.digitazon.onlyrarevideobe.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.digitazon.onlyrarevideobe.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    // HERE go Custom methods!

    /* 1 */
    public Movie findByTitle(String title);

    // findBy---> Spring is able to find the "FindBy..." using
    // JpaRepository library...

    /* 2 */
    public List<Movie> findBySanitizeTitle(String sanitizeTitle);
}
