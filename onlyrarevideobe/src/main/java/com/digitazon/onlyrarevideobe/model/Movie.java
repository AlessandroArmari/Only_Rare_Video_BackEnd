package com.digitazon.onlyrarevideobe.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String title;

    @Column
    private String sanitizeTitle;

    @Column
    private String year;

    @Column
    private String genre;

    @Column
    private String running_time;

    @Column(length = 20000)
    private String plot;

    @Column(length = 20000)
    // I'm saying to Spring That I want a column which allows many letters
    // Spring will create a column "image" type--->TEXT, not VARCHAR
    private String image;

 

    // Foreign Key
    @ManyToOne
    @JoinColumn(name = "director_id")
    // the foreign key in the table director
    private Director director;

    @ManyToMany
    private List<Collection> collections;

    @Column
    private boolean isComingSoon;

    public Movie(String title, String sanitizeTitle, String year, String genre, String running_time, String plot,
            String image, Director director, List<Collection> collections, boolean isComingSoon) {
        this.title = title;
        this.sanitizeTitle = sanitizeTitle;
        this.year = year;
        this.genre = genre;
        this.running_time = running_time;
        this.plot = plot;
        this.image = image;
        this.director = director;
        this.collections = collections;
        this.isComingSoon = isComingSoon;
    }

    

    

}
