package com.digitazon.onlyrarevideobe.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String collectionName;

    @Column
    private String collectionDescription;

    @ManyToMany
    private List<Movie> movies;

    public Collection(String collectionName, String collectionDescription, List<Movie> movies) {
        this.collectionName = collectionName;
        this.collectionDescription = collectionDescription;
        this.movies = movies;
    }

}
