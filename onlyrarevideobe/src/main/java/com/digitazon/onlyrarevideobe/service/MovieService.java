package com.digitazon.onlyrarevideobe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.onlyrarevideobe.model.Movie;
import com.digitazon.onlyrarevideobe.repository.MovieRepository;


@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    DirectorService directorService;

    // GET ALL
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    // GET BY ID
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).get();
    }

    // POST A MOVIE TO BE CHECKED
    /*
     * public Movie createMovie(Movie movie) { // TO BE TESTED
     * 
     * directorService.getAllDirectors().forEach((n) -> {
     * if (n == movie.getDirector()) {
     * return;
     * }
     * });
     * 
     * directorService.createDirector(movie.getDirector());
     * return movieRepository.save(movie);
     * 
     * }
     */

    // POST A MOVIE STANDARD
    public Movie createMovie(Movie movie) {
        if (movie.getDirector() != null) {
            directorService.createDirector(movie.getDirector());
        }

        return movieRepository.save(movie);
    }

    // DELETE BY ID
    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);
    }

    // UPDATE
    public Movie updateMovieById(Long id, Movie newMovie) {
        Optional<Movie> oldMovieOpt = movieRepository.findById(id);

        if (oldMovieOpt.isPresent()) {
            Movie oldMovie = oldMovieOpt.get();

            oldMovie.setTitle(newMovie.getTitle());
            oldMovie.setYear(newMovie.getYear());
            oldMovie.setRunning_time(newMovie.getRunning_time());
            oldMovie.setPlot(newMovie.getPlot());
            oldMovie.setImage(newMovie.getImage());
            oldMovie.setDirector(newMovie.getDirector());

            return movieRepository.save(oldMovie);
        }

        return null;

    }

}
