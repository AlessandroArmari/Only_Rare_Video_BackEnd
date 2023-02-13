package com.digitazon.onlyrarevideobe.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    private String sanitizeCollectionName;

    @Column
    private String collectionDescription;

    @Column(length = 20000)
    private String collectionImage;

    @ManyToMany
    @JoinColumn
    private List<Movie> movies;

    public Collection(String collectionName, String sanitizeCollectionName, String collectionDescription,
            String collectionImage, List<Movie> movies) {
        this.collectionName = collectionName;
        this.sanitizeCollectionName = sanitizeCollectionName;
        this.collectionDescription = collectionDescription;
        this.collectionImage = collectionImage;
        this.movies = movies;
    }

}
