package com.digitazon.onlyrarevideobe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    private String year;

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

    public Movie(String title, String year, String running_time, String plot, String image, Director director) {
        this.title = title;
        this.year = year;
        this.running_time = running_time;
        this.plot = plot;
        this.image = image;
        this.director = director;
    }

}
