package com.digitazon.onlyrarevideobe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String fullName;

    @Column
    private String birthYear;

    @Column
    private String nationality;

    // "Pseudo"-Foreign_Key

    @OneToMany //(mappedBy = "id")
    private List<Movie> movies;

    public Director(String fullName, String birthYear, String nationality, List<Movie> movies) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.nationality = nationality;
        this.movies = movies;
    }

    
}
