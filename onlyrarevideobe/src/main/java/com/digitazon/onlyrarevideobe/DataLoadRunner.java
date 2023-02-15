package com.digitazon.onlyrarevideobe;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.digitazon.onlyrarevideobe.model.Collection;
import com.digitazon.onlyrarevideobe.model.Director;
import com.digitazon.onlyrarevideobe.model.Movie;
import com.digitazon.onlyrarevideobe.service.DirectorService;
import com.digitazon.onlyrarevideobe.service.MovieService;
import com.digitazon.onlyrarevideobe.service.CollectionService;

@Component
public class DataLoadRunner implements CommandLineRunner {

        @Autowired
        DirectorService directorService;

        @Autowired
        MovieService movieService;

        @Autowired
        CollectionService collectionService;

        @Override
        public void run(String... args) throws Exception {

                Director director1 = new Director("M. Night Shyamalan", "mnightshyamalan", "1970", "US", null);
                Director director2 = new Director("Brian De Palma", "briandepalma", "1940", "US", null);
                Director director3 = new Director("Nanni Moretti", "nannimoretti", "1953", "Italian", null);
                Director director4 = new Director("Zhang Yimou", "zhangyimou", "1950", "Chinese", null);
                Director director5 = new Director("Kiyoshi Kurosawa", "kiyoshikurosawa", "1955", "Japan", null);
                Director director6 = new Director("Fernando Di Leo", "fernandodileo", "1932", "italy", null);

                directorService.createDirector(director1);
                directorService.createDirector(director2);
                directorService.createDirector(director3);
                directorService.createDirector(director4);
                directorService.createDirector(director5);
                directorService.createDirector(director6);

                // M. Night Movies
                Movie movie1 = new Movie("The Village", "thevillage", "2004", "Horror", "108",
                                "Members (Bryce Dallas Howard, Joaquin Phoenix, Adrien Brody) of a 19th-century community fear the strange creatures that inhabit the surrounding forest.",
                                "https://m.media-amazon.com/images/M/MV5BMWExMWYxN2MtYmU1YS00Mjk5LWI3OTEtYTg3NDIwZTA2MTE2L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_.jpg",
                                director1, null, false);
                Movie movie2 = new Movie("The Sixth Sense", "thesixthsense", "1999", "Horror", "108",
                                "Young Cole Sear (Haley Joel Osment) is haunted by a dark secret: he is visited by ghosts. Cole is frightened by visitations from those with unresolved problems who appear from the shadows. He is too afraid to tell anyone about his anguish, except child psychologist Dr. Malcolm Crowe (Bruce Willis). As Dr. Crowe tries to uncover the truth about Cole's supernatural abilities, the consequences for client and therapist are a jolt that awakens them both to something unexplainable.",
                                "https://pad.mymovies.it/filmclub/2002/10/013/locandina.jpg",
                                director1, null, false);

                Movie movie3 = new Movie("Signs", "signs", "2002", "Horror", "106",
                                "Everything that farmer Graham Hess (Mel Gibson) assumed about the world is changed when he discovers a message - an intricate pattern of circles and lines - carved into his crops. As he investigates the unfolding mystery, what he finds will forever alter the lives of his brother (Joaquin Phoenix) and children (Rory Culkin), (Abigail Breslin). A unique story that explores the mysterious real-life phenomena of crop signs and the effects they have on one man and his family.",
                                "https://m.media-amazon.com/images/M/MV5BNDUwMDUyMDAyNF5BMl5BanBnXkFtZTYwMDQ3NzM3._V1_.jpg",
                                director1, null, false);

                Movie movie10 = new Movie("Unbreakable", "unbreakable", "2000", "Horror", "106",
                                "David Dunn (Bruce Willis) is the sole survivor of a devastating train wreck. Elijah Price (Samuel L. Jackson) is a mysterious stranger who offers a bizarre explanation as to why David escaped without a single scratch -- an explanation which threatens to change David's family and his life forever.",
                                "https://m.media-amazon.com/images/M/MV5BMDIwMjAxNzktNmEzYS00ZDY5LWEyZjktM2Y0MmUzZDkyYmZkXkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_.jpg",
                                director1, null, false);

                Movie movie11 = new Movie("The Happening", "thehappening", "2008", "Horror", "85",
                                "An apocalyptic threat to humanity arrives out of the clear blue sky with a series of violent, inexplicable deaths spreading across the country. The cause of the terrifying phenomenon remains unknown, prompting science teacher Elliot Moore (Mark Wahlberg), his wife Alma (Zooey Deschanel) and his colleague Julian (John Alberto Leguizamo) to try to elude the invisible killer in Pennsylvania's farmland. Soon it becomes clear that no one is safe.",
                                "https://m.media-amazon.com/images/M/MV5BMTc2MjcwNjI0MF5BMl5BanBnXkFtZTcwMjM4NjM3MQ@@._V1_.jpg",
                                director1, null, false);

                // De palma Movie

                Movie movie4 = new Movie("Carrie", "carrie", "1976", "Horror", "98",
                                "In this chilling adaptation of Stephen King's horror novel, withdrawn and sensitive teen Carrie White (Sissy Spacek) faces taunting from classmates at school and abuse from her fanatically pious mother (Piper Laurie) at home. When strange occurrences start happening around Carrie, she begins to suspect that she has supernatural powers. Invited to the prom by the empathetic Tommy Ross (William Katt), Carrie tries to let her guard down, but things eventually take a dark and violent turn.",
                                "https://m.media-amazon.com/images/M/MV5BMTlhNmVkZGUtNjdjOC00YWY3LTljZWQtMTY1YWFhNGYwNDQwXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_.jpg",
                                director2, null, false);

                Movie movie5 = new Movie("Scarface", "scarface", "1983", "Drama", "170",
                                "After getting a green card in exchange for assassinating a Cuban government official, Tony Montana (Al Pacino) stakes a claim on the drug trade in Miami. Viciously murdering anyone who stands in his way, Tony eventually becomes the biggest drug lord in the state, controlling nearly all the cocaine that comes through Miami. But increased pressure from the police, wars with Colombian drug cartels and his own drug-fueled paranoia serve to fuel the flames of his eventual downfall.",
                                "https://m.media-amazon.com/images/M/MV5BNjdjNGQ4NDEtNTEwYS00MTgxLTliYzQtYzE2ZDRiZjFhZmNlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_.jpg",
                                director2, null, false);

                Movie movie6 = new Movie("Phamtom of the Paradise", "phantomoftheparadise", "1974", "Musical", "92",
                                "After record producer Swan (Paul Williams) steals the music of songwriter Winslow Leach (William Finley) and gives it to one of his bands, Leach sneaks into Swan's offices. Catching Leach, Swan frames him for dealing drugs, which lands him in prison. After Leach breaks out and again attempts to sabotage Swan's empire, an accident crushes his face. Leach then dons a costume and becomes the Phantom, intent on ruining Swan while saving singer Phoenix (Jessica Harper) from a terrible fate.",
                                "https://m.media-amazon.com/images/M/MV5BZWI5NDk1MDgtYzYwZi00ZmZhLThiN2QtN2U5OGExNTBhOTZhXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg",
                                director2, null, false);

                Movie movie7 = new Movie("Dressed to Kill", "dressedtokill", "1980", "Thriller", "105",
                                "When Liz Blake (Nancy Allen), a prostitute, sees a mysterious woman brutally slay homemaker Kate Miller (Angie Dickinson), she finds herself trapped in a dangerous situation. While the police think Liz is the murderer, the real killer wants to silence the crime's only witness. Only Kate's inventor son, Peter (Keith Gordon), believes Liz. Peter and Liz team up to find the real culprit, who has an unexpected means of hiding her identity and an even more surprising motivation to kill.",
                                "https://m.media-amazon.com/images/M/MV5BN2Q2MzczNjItOTAxMS00ZDMzLThiZTktZDFjYzRhYTcyYWU4XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg",
                                director2, null, false);

                Movie movie8 = new Movie("Blow Out", "blowout", "1983", "Thriller", "108",
                                "While recording sound effects for a slasher flick, Jack Terri (John Travolta) stumbles upon a real-life horror: a car careening off a bridge and into a river. Jack jumps into the water and fishes out Sally (Nancy Allen) from the car, but the other passenger is already dead -- a governor intending to run for president. As Jack does some investigating of his tapes, and starts a perilous romance with Sally, he enters a tangled web of conspiracy that might leave him dead.",
                                "https://m.media-amazon.com/images/M/MV5BZmZiMmZmNjQtNGM3OC00MTFkLWIxMzktZmJhMGYzMjYwYzZmXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg",
                                director2, null, false);

                Movie movie9 = new Movie("Casualties of War", "casualtiesofwar", "1989", "Drama", "113",
                                "Pvt. Max Eriksson (Michael J. Fox) is stationed in Vietnam under Sgt. Tony Meserve (Sean Penn). Though Meserve saves Eriksson's life during battle, the two men clash when the callous senior officer orders the abduction of Than Thi Oanh (Thuy Thu Le), a young Vietnamese woman, to be used as a sex slave. When Eriksson refuses to take part in the abuse of Oanh, tensions between him, Meserve and the rest of the unit heat up and finally explode during a firefight with Viet Cong troops.",
                                "https://m.media-amazon.com/images/M/MV5BNTJjNTUxMjYtYjNlNC00NDViLWIwZjktMGNkOTQ5MDNjNTFiXkEyXkFqcGdeQXVyNTI4MjkwNjA@._V1_.jpg",
                                director2, null, false);

                // Nanni Moretti Movies

                Movie movie12 = new Movie("Red Wood Pigeon", "redwoodpigeon", "1989", "Drama", "89",
                                "A reporter, a fundamentalist and militants besiege an Italian politician (Nanni Moretti) during a water polo match.",
                                "https://m.media-amazon.com/images/M/MV5BZmIwMDI5OGMtNTA4My00MTIyLTk3NWQtODM1MTc2NGE5MDhhXkEyXkFqcGdeQXVyMzIzNDU1NTY@._V1_.jpg",
                                director3, null, false);

                Movie movie13 = new Movie("The Caiman", "thecaiman", "2006", "Drama", "112",
                                "A reporter, a fundamentalist and militants besiege an Italian politician (Nanni Moretti) during a water polo match.",
                                "https://m.media-amazon.com/images/M/MV5BNzE5MTRkODQtNmE1Yy00NTI3LWE2ZTMtOGJjOTUyNjY0ZWVmXkEyXkFqcGdeQXVyMzIzNDU1NTY@._V1_.jpg",
                                director3, null, false);

                // Zhang Yimou movies

                Movie movie14 = new Movie("Raise the Red Lantern", "raisetheredlantern",
                                "1991", "Drama", "125",
                                "Teenage Songlian (Gong Li), whose family has been devastated by the recent death of her father, becomes the third concubine of wealthy Master Chen (Ma Jingwu). She soon discovers that behind the palatial luxury of life in the master's house, she and her fellow concubines, Zhuoyan (Cao Cuifeng) and Meishan (He Caifei), are pitted against each other in a struggle for his affections. The situation inevitably leads to deception, jealous rages and the revelation of each other's darkest secrets.",
                                "https://m.media-amazon.com/images/M/MV5BNDMxMTc2N2ItMjI5Ny00MGFiLThkOTYtZTIyYTZhMzA2NjIzXkEyXkFqcGdeQXVyNjc3MjQzNTI@._V1_.jpg",
                                director4, null, false);

                Movie movie15 = new Movie("Hero", "hero",
                                "2002", "Action", "107",
                                "In this visually arresting martial arts epic set in ancient China, an unnamed fighter (Jet Li) is being honored for defeating three of the king's most dangerous enemies. When Nameless recounts his battles with the assassins -- Broken Sword (Tony Leung Chiu Wai), Flying Snow (Maggie Cheung Man-yuk) and Moon (Zhang Ziyi) -- the king begins to question some of the details. As Nameless goes on, the king challenges the tales, interjecting his own take on these perhaps suspect version of events.",
                                "https://m.media-amazon.com/images/M/MV5BMWQ2MjQ0OTctMWE1OC00NjZjLTk3ZDAtNTk3NTZiYWMxYTlmXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg",
                                director4, null, false);

                // Kiyoshi Kurosawa movies

                Movie movie16 = new Movie("Kairo", "kairo", "2001", "Horror", "114",
                                "After college student Taguchi (Kenji Mizuhashi) commits suicide, a number of young adults living in Tokyo witness terrifying visions transferred across the Internet. As more people disappear throughout the city, the Internet becomes a breeding ground for malevolent spirits. Three seemingly disconnected stories follow Michi (Kumiko Aso), Ryosuke (Haruhiko Katô) and Harue (Koyuki) as they attempt to solve the mystery behind the ghostly visions that are seeping beyond their computer monitors.",
                                "https://m.media-amazon.com/images/M/MV5BM2QyYmRlNjAtYTIzMC00Zjk5LWFmNTYtYzIxZDc2OTFiNmZiXkEyXkFqcGdeQXVyMTMxMTY0OTQ@._V1_.jpg",
                                director5, null, false);

                Movie movie17 = new Movie("Cure", "cure", "2001", "Thriller", "112",
                                "Cure is part atmospheric crime film and part philosophical meditation. Detective Takabe (Koji Yakusho) is tracking a series of identical murders, committed under the same bizarre circumstances. Nothing seems to connect the murders and Takabe becomes increasingly frustrated...",
                                "https://m.media-amazon.com/images/M/MV5BY2IzODExNDgtMzViNC00ZDk5LWJlOGYtM2VjZjQ4MzllN2RiXkEyXkFqcGdeQXVyNTY4ODAxODI@._V1_.jpg",
                                director5, null, false);

                // Fernando di Leo movies

                Movie movie18 = new Movie("Caliber 9", "milanocalibro9", "1972", "Noir", "88",
                                "Police and the mob hunt for a just-released prisoner.",
                                "https://m.media-amazon.com/images/M/MV5BNWQzYmJjNWItOTY3NS00Yzc4LTkzYWItNDYzZWI5ZmJiYjYwXkEyXkFqcGdeQXVyNzgzODI1OTE@._V1_.jpg",
                                director6, null, false);

                Movie movie19 = new Movie("The Italian Connection", "theitalianconnection", "1972", "Noir", "97",
                                "A Milanese pimp (Henry Silva) kills hit men (Mario Adorf, Woody Strode) on his trail after a crime boss frames him for stealing heroin.",
                                "https://m.media-amazon.com/images/M/MV5BZWZhMDA1NzgtMmMxOC00ZmNlLWJjMGQtM2YxN2U4NDM1NGNkXkEyXkFqcGdeQXVyNzgzODI1OTE@._V1_.jpg",
                                director6, null, false);

                Movie movie20 = new Movie("Slaughter Hotel", "slaughterhotel", "1971", "Horror", "97",
                                "A masked killer uses medieval weaponry to kill women in an asylum for suicidal and disturbed women.",
                                "https://m.media-amazon.com/images/M/MV5BYThkOGRhNDAtMDYzMC00YmNkLThjYjYtZjY1YTQxOWI1ZTIwXkEyXkFqcGdeQXVyMjA0MzYwMDY@._V1_.jpg",
                                director6, null, false);

                // Out Soon Movies

                Movie CSmovie1 = new Movie("Pink Flamingos", "pinkflamingos", "1972 ", "Black Comedy", "107",
                                "15th March 2023",
                                "https://m.media-amazon.com/images/M/MV5BYjc2NTM3ZTEtYzc0ZC00NjQ4LTk3MzktN2I4OWE1NTU3ZDFmXkEyXkFqcGdeQXVyNjE5MjUyOTM@._V1_.jpg",
                                null, null, true);

                Movie CSmovie2 = new Movie("The Basilisks", "ibasilischi", "1963 ", "Drama", "84",
                                "25th March 2023",
                                "https://m.media-amazon.com/images/M/MV5BZmJkOGY0YzUtOTkwNC00ZWNiLTg2YzktNjdmZmVkYzBhMzk5XkEyXkFqcGdeQXVyMTQ3Njg3MQ@@._V1_.jpg",
                                null, null, true);

                Movie CSmovie3 = new Movie("In the mood for love", "inthemoodforlove", "2000", "Drama",
                                "98",
                                "10th April 2023",
                                "https://m.media-amazon.com/images/M/MV5BYWVjNjMwZTgtMGYyYy00NmVhLWE1NDItMzFhMmJkYTNjYWIwXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_.jpg",
                                null, null, true);

                Movie CSmovie4 = new Movie("Assault on Precinct 13", "assaultonprecient13", "1976", "Thriller",
                                "91",
                                "10th April 2023",
                                "https://m.media-amazon.com/images/M/MV5BYzdkYjZiYjEtN2UwZS00NGQyLTg2Y2MtZWYyMTAxMGEwZjBkXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg",
                                null, null, true);

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
                movieService.createMovie(movie14);
                movieService.createMovie(movie15);
                movieService.createMovie(movie16);
                movieService.createMovie(movie17);
                movieService.createMovie(movie18);
                movieService.createMovie(movie19);
                movieService.createMovie(movie20);

                // ++++++++++++++++++++++++++++++++

                movieService.createMovie(CSmovie1);
                movieService.createMovie(CSmovie2);
                movieService.createMovie(CSmovie3);
                movieService.createMovie(CSmovie4);

                // +++MANAGIN TABLE COLLECTION+++
                // CREATING moviesHalloween (ArrayList) TO BE PUT IN A halloweenCollection
                // (which is an SQL @Entity)

                /* 1 Halloween Deal */

                List<Movie> moviesHalloween = new ArrayList<>();
                moviesHalloween.add(movie7);
                moviesHalloween.add(movie8);
                moviesHalloween.add(movie4);
                moviesHalloween.add(movie2);
                moviesHalloween.add(movie1);
                moviesHalloween.add(movie16);
                moviesHalloween.add(movie17);
                moviesHalloween.add(movie20);

                Collection halloweenCollection = new Collection("Halloween Collection", "halloweencollection",
                                "You really goes out on Halloween night? Movies are better!",
                                "What's Your Favorite Scary Movie? Don't you know? Buy 3 movies within this fine, delicous collection and have the third for free. Have a nice Halloween, fellas. Valid until 1st November. ",
                                "https://m.media-amazon.com/images/M/MV5BNDQ2YzA1YjMtOWEwYS00YmFjLWJjNDktMmQ5ZWZjZTU3YjY4XkEyXkFqcGdeQXVyODQxOTM0ODI@._V1_.jpg",
                                moviesHalloween, false);

                collectionService.createCollection(halloweenCollection);

                /* 2 Rising Sun Deal */

                List<Movie> moviesRisingSun = new ArrayList<>();

                moviesRisingSun.add(movie15);
                moviesRisingSun.add(movie14);
                moviesRisingSun.add(movie16);
                moviesRisingSun.add(movie17);

                Collection risingSunCollection = new Collection("Rising Sun Collection", "risingsuncollection",
                                "The best of the best of the asian production, 33% off!",
                                "Where the sun rises, movies shine! Discover the genuine-oriental taste for blood and gore. You'll never come back as you were! (or maybe alive...)",
                                "https://m.media-amazon.com/images/M/MV5BODZhZWUwOWEtMTExOS00OTM4LWEyZjctZDNmYzE3MGRmM2ZkXkEyXkFqcGdeQXVyOTc5MDI5NjE@._V1_.jpg",
                                moviesRisingSun, false);

                collectionService.createCollection(risingSunCollection);

                /* 3 Italian Deal */

                List<Movie> moviesItalianDeal = new ArrayList<>();

                moviesItalianDeal.add(movie13);
                moviesItalianDeal.add(movie12);
                moviesItalianDeal.add(movie18);
                moviesItalianDeal.add(movie19);
                moviesItalianDeal.add(movie20);

                Collection italianDeal = new Collection("Italian Deal", "italiandeal",
                                "Up to 66% off on the italian catalogue",
                                "Mamma mia! Che bello film! Who said only americans do good action movies? Choose among our collection of discounted italian delicatessen!",
                                "https://m.media-amazon.com/images/M/MV5BYWU5ZDA4MzctMWFhOS00MDQ0LWJjNDUtYTE3NDEzOGIwYjMxXkEyXkFqcGdeQXVyMTE4MDg3NTIz._V1_.jpg",
                                moviesItalianDeal, false);

                collectionService.createCollection(italianDeal);

                /* 4 Coming Soon */

                List<Movie> comingSoon = new ArrayList<>();

                comingSoon.add(CSmovie1);
                comingSoon.add(CSmovie2);
                comingSoon.add(CSmovie3);
                comingSoon.add(CSmovie4);

                Collection comingSoonCollection = new Collection("Coming Soon", "comingsoon",
                                "Fresh Meat available soon...",
                                "Fresh Meat available soon...",
                                "",
                                comingSoon, true);

                collectionService.createCollection(comingSoonCollection);

        };

}
