package com.uni.cinema.model;


import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "movie", catalog = "cinema")
public class Movie {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column
    private Integer idMovie;
    @Column
    private String movieName;
    @Column
    private String movieDirector;
    @Column
    private String movieCasting;
    @Column
    private Integer movieDuration;
    @Column
    private String movieCategory;
    @Column
    private String movieLanguage;
    @Column
    private String movieSynopsis;
}
