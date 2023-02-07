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
                Movie movie2 = new Movie("The Sixth Sense", "1999", "107",
                                null,
                                "https://pad.mymovies.it/filmclub/2002/10/013/locandina.jpg",
                                director1);

                Movie movie3 = new Movie("Signs", "2002", "106",
                                null,
                                "https://m.media-amazon.com/images/M/MV5BNDUwMDUyMDAyNF5BMl5BanBnXkFtZTYwMDQ3NzM3._V1_FMjpg_UX1000_.jpg",
                                director1);

                // De palma Movie

                Movie movie4 = new Movie("Carrie", "1976", "98",
                                null,
                                "https://pad.mymovies.it/filmclub/2002/08/310/locandina.jpg", director2);

                Movie movie5 = new Movie("Scarface", "1983", "170",
                                null,
                                "https: // m.media-amazon.com/images/I/71hzm7Yh01L._SL1500_.jpg", director2);

                Movie movie6 = new Movie("Phamtom of the Paradise", "1974", "92",
                                null,
                                "https://m.media-amazon.com/images/M/MV5BYTUzOTliNjEtN2ExNy00NDE3LTllZWEtYTA0MjIwODc0ZmNjXkEyXkFqcGdeQXVyMzA0NzAyOTc@._V1_FMjpg_UX1000_.jpg",
                                director2);

                Movie movie7 = new Movie("Dressed to Kill", "1980", "105",
                                null,
                                "https://m.media-amazon.com/images/I/91-vo+tKChL._SL1500_.jpg", director2);

                Movie movie8 = new Movie("Blow Out", "1983", "108",
                                null,
                                "https://pad.mymovies.it/filmclub/2006/05/146/locandina.jpg", director2);

                Movie movie9 = new Movie("Casualties of War", "1989", "113",
                                null,
                                "https://m.media-amazon.com/images/M/MV5BODEzNzljNTgtNWQ3Yi00YzhlLTg1NzItMjZmOWFlNWYzMDk4XkEyXkFqcGdeQXVyMTAyOTE2ODg0._V1_.jpg",
                                director2);

                movieService.createMovie(movie1);
                movieService.createMovie(movie2);
                movieService.createMovie(movie3);
                movieService.createMovie(movie4);
                movieService.createMovie(movie5);
                movieService.createMovie(movie6);
                movieService.createMovie(movie7);
                movieService.createMovie(movie8);
                movieService.createMovie(movie9);

        }

}
