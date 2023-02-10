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

                Director director1 = new Director("M. Night Shyamalan", "mnightshyamalan", "1970", "US", null);
                Director director2 = new Director("Brian De Palma", "briandepalma", "1940", "US", null);
                Director director3 = new Director("Nanni Moretti", "nannimoretti", "1953", "Italian", null);

                directorService.createDirector(director1);
                directorService.createDirector(director2);
                directorService.createDirector(director3);

                // M. Night Movies
                Movie movie1 = new Movie("The Village", "thevillage", "2004", "Horror", "108",
                                "Members (Bryce Dallas Howard, Joaquin Phoenix, Adrien Brody) of a 19th-century community fear the strange creatures that inhabit the surrounding forest.",
                                "https://m.media-amazon.com/images/M/MV5BMWExMWYxN2MtYmU1YS00Mjk5LWI3OTEtYTg3NDIwZTA2MTE2L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_.jpg",
                                director1);
                Movie movie2 = new Movie("The Sixth Sense", "thesixthsense", "1999", "Horror", "108",
                                "Young Cole Sear (Haley Joel Osment) is haunted by a dark secret: he is visited by ghosts. Cole is frightened by visitations from those with unresolved problems who appear from the shadows. He is too afraid to tell anyone about his anguish, except child psychologist Dr. Malcolm Crowe (Bruce Willis). As Dr. Crowe tries to uncover the truth about Cole's supernatural abilities, the consequences for client and therapist are a jolt that awakens them both to something unexplainable.",
                                "https://pad.mymovies.it/filmclub/2002/10/013/locandina.jpg",
                                director1);

                Movie movie3 = new Movie("Signs", "signs", "2002", "Horror", "106",
                                "Everything that farmer Graham Hess (Mel Gibson) assumed about the world is changed when he discovers a message - an intricate pattern of circles and lines - carved into his crops. As he investigates the unfolding mystery, what he finds will forever alter the lives of his brother (Joaquin Phoenix) and children (Rory Culkin), (Abigail Breslin). A unique story that explores the mysterious real-life phenomena of crop signs and the effects they have on one man and his family.",
                                "https://m.media-amazon.com/images/M/MV5BNDUwMDUyMDAyNF5BMl5BanBnXkFtZTYwMDQ3NzM3._V1_.jpg",
                                director1);

                Movie movie10 = new Movie("Unbreakable", "unbreakable", "2000", "Horror", "106",
                                "David Dunn (Bruce Willis) is the sole survivor of a devastating train wreck. Elijah Price (Samuel L. Jackson) is a mysterious stranger who offers a bizarre explanation as to why David escaped without a single scratch -- an explanation which threatens to change David's family and his life forever.",
                                "https://m.media-amazon.com/images/M/MV5BMDIwMjAxNzktNmEzYS00ZDY5LWEyZjktM2Y0MmUzZDkyYmZkXkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_.jpg",
                                director1);

                Movie movie11 = new Movie("The Happening", "thehappening", "2008", "Horror", "85",
                                "An apocalyptic threat to humanity arrives out of the clear blue sky with a series of violent, inexplicable deaths spreading across the country. The cause of the terrifying phenomenon remains unknown, prompting science teacher Elliot Moore (Mark Wahlberg), his wife Alma (Zooey Deschanel) and his colleague Julian (John Alberto Leguizamo) to try to elude the invisible killer in Pennsylvania's farmland. Soon it becomes clear that no one is safe.",
                                "https://m.media-amazon.com/images/M/MV5BMTc2MjcwNjI0MF5BMl5BanBnXkFtZTcwMjM4NjM3MQ@@._V1_.jpg",
                                director1);

                // De palma Movie

                Movie movie4 = new Movie("Carrie", "carrie", "1976", "Horror", "98",
                                "In this chilling adaptation of Stephen King's horror novel, withdrawn and sensitive teen Carrie White (Sissy Spacek) faces taunting from classmates at school and abuse from her fanatically pious mother (Piper Laurie) at home. When strange occurrences start happening around Carrie, she begins to suspect that she has supernatural powers. Invited to the prom by the empathetic Tommy Ross (William Katt), Carrie tries to let her guard down, but things eventually take a dark and violent turn.",
                                "https://m.media-amazon.com/images/M/MV5BMTlhNmVkZGUtNjdjOC00YWY3LTljZWQtMTY1YWFhNGYwNDQwXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_.jpg",
                                director2);

                Movie movie5 = new Movie("Scarface", "scarface", "1983", "Drama", "170",
                                "After getting a green card in exchange for assassinating a Cuban government official, Tony Montana (Al Pacino) stakes a claim on the drug trade in Miami. Viciously murdering anyone who stands in his way, Tony eventually becomes the biggest drug lord in the state, controlling nearly all the cocaine that comes through Miami. But increased pressure from the police, wars with Colombian drug cartels and his own drug-fueled paranoia serve to fuel the flames of his eventual downfall.",
                                "https://m.media-amazon.com/images/M/MV5BNjdjNGQ4NDEtNTEwYS00MTgxLTliYzQtYzE2ZDRiZjFhZmNlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_.jpg",
                                director2);

                Movie movie6 = new Movie("Phamtom of the Paradise", "phantomoftheparadise", "1974", "Musical", "92",
                                "After record producer Swan (Paul Williams) steals the music of songwriter Winslow Leach (William Finley) and gives it to one of his bands, Leach sneaks into Swan's offices. Catching Leach, Swan frames him for dealing drugs, which lands him in prison. After Leach breaks out and again attempts to sabotage Swan's empire, an accident crushes his face. Leach then dons a costume and becomes the Phantom, intent on ruining Swan while saving singer Phoenix (Jessica Harper) from a terrible fate.",
                                "https://m.media-amazon.com/images/M/MV5BZWI5NDk1MDgtYzYwZi00ZmZhLThiN2QtN2U5OGExNTBhOTZhXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg",
                                director2);

                Movie movie7 = new Movie("Dressed to Kill", "dressedtokill", "1980", "Thriller", "105",
                                "When Liz Blake (Nancy Allen), a prostitute, sees a mysterious woman brutally slay homemaker Kate Miller (Angie Dickinson), she finds herself trapped in a dangerous situation. While the police think Liz is the murderer, the real killer wants to silence the crime's only witness. Only Kate's inventor son, Peter (Keith Gordon), believes Liz. Peter and Liz team up to find the real culprit, who has an unexpected means of hiding her identity and an even more surprising motivation to kill.",
                                "https://m.media-amazon.com/images/M/MV5BN2Q2MzczNjItOTAxMS00ZDMzLThiZTktZDFjYzRhYTcyYWU4XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg",
                                director2);

                Movie movie8 = new Movie("Blow Out", "blowout", "1983", "Thriller", "108",
                                "While recording sound effects for a slasher flick, Jack Terri (John Travolta) stumbles upon a real-life horror: a car careening off a bridge and into a river. Jack jumps into the water and fishes out Sally (Nancy Allen) from the car, but the other passenger is already dead -- a governor intending to run for president. As Jack does some investigating of his tapes, and starts a perilous romance with Sally, he enters a tangled web of conspiracy that might leave him dead.",
                                "https://m.media-amazon.com/images/M/MV5BZmZiMmZmNjQtNGM3OC00MTFkLWIxMzktZmJhMGYzMjYwYzZmXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg",
                                director2);

                Movie movie9 = new Movie("Casualties of War", "casualtiesofwar", "1989", "Drama", "113",
                                "Pvt. Max Eriksson (Michael J. Fox) is stationed in Vietnam under Sgt. Tony Meserve (Sean Penn). Though Meserve saves Eriksson's life during battle, the two men clash when the callous senior officer orders the abduction of Than Thi Oanh (Thuy Thu Le), a young Vietnamese woman, to be used as a sex slave. When Eriksson refuses to take part in the abuse of Oanh, tensions between him, Meserve and the rest of the unit heat up and finally explode during a firefight with Viet Cong troops.",
                                "https://m.media-amazon.com/images/M/MV5BNTJjNTUxMjYtYjNlNC00NDViLWIwZjktMGNkOTQ5MDNjNTFiXkEyXkFqcGdeQXVyNTI4MjkwNjA@._V1_.jpg",
                                director2);

                // Nanni Moretti Movies

                Movie movie12 = new Movie("Red Wood Pigeon", "redwoodpigeon", "1989", "Drama", "89",
                                "A reporter, a fundamentalist and militants besiege an Italian politician (Nanni Moretti) during a water polo match.",
                                "https://m.media-amazon.com/images/M/MV5BZmIwMDI5OGMtNTA4My00MTIyLTk3NWQtODM1MTc2NGE5MDhhXkEyXkFqcGdeQXVyMzIzNDU1NTY@._V1_.jpg",
                                director3);

                Movie movie13 = new Movie("The Caiman", "thecaiman", "2006", "Drama", "112",
                                "A reporter, a fundamentalist and militants besiege an Italian politician (Nanni Moretti) during a water polo match.",
                                "https://m.media-amazon.com/images/M/MV5BNzE5MTRkODQtNmE1Yy00NTI3LWE2ZTMtOGJjOTUyNjY0ZWVmXkEyXkFqcGdeQXVyMzIzNDU1NTY@._V1_.jpg",
                                director3);

                movieService.createMovie(movie1);
                movieService.createMovie(movie2);
                movieService.createMovie(movie3);
                movieService.createMovie(movie4);
                movieService.createMovie(movie5);
                movieService.createMovie(movie6);
                movieService.createMovie(movie7);
                movieService.createMovie(movie8);
                movieService.createMovie(movie9);
                movieService.createMovie(movie10);
                movieService.createMovie(movie11);
                movieService.createMovie(movie12);
                movieService.createMovie(movie13);

        }

}
