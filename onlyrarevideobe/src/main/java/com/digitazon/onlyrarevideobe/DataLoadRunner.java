package com.digitazon.onlyrarevideobe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.digitazon.onlyrarevideobe.model.Director;
import com.digitazon.onlyrarevideobe.model.Movie;
import com.digitazon.onlyrarevideobe.service.DirectorService;
import com.digitazon.onlyrarevideobe.service.MovieService;

@Component
public class DataLoadRunner implements CommandLineRunner {

        @Autowired
        DirectorService directorService;

        @Autowired
        MovieService movieService;

        @Override
        public void run(String... args) throws Exception {

                Director director1 = new Director("M. Night Shyamalan", "1970", "US", null);
                Director director2 = new Director("Brian De Palma", "1940", "US", null);

                directorService.createDirector(director1);
                directorService.createDirector(director2);

                // M. Night Movies
                Movie movie1 = new Movie("The Village", "2004", "108",
                                null,
                                "https://pad.mymovies.it/filmclub/2004/07/040/locandina.jpg",
                                director1);
                Movie movie2 = movie1 = new Movie("The Sixth Sense", "1999", "107",
                                null,
                                "https://pad.mymovies.it/filmclub/2002/10/013/locandina.jpg",
                                director1);

                Movie movie3 = new Movie("Signs", "2002", "106",
                                null,
                                "https://static.wikia.nocookie.net/unbreakablemovie/images/d/d6/Large_uyZXsW00i9e4PtRF0z5LFUqk4W8.jpg/revision/latest?cb=20170831180604",
                                director1);

                // De palma Movie

                Movie movie4 = new Movie("Carrie", "1976", "98",
                                null,
                                "https://pad.mymovies.it/filmclub/2002/08/310/locandina.jpg", director2);

                movieService.createMovie(movie1);
                movieService.createMovie(movie2);
                movieService.createMovie(movie3);
                movieService.createMovie(movie4);

        }

}
