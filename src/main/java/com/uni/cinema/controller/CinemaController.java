package com.uni.cinema.controller;

import com.uni.cinema.model.Movie;
import com.uni.cinema.service.impl.CinemaImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/movie")
public class CinemaController {
    private final CinemaImpl cinema;

    @GetMapping
    public List<Movie> getMovieList() {
        return cinema.getMovieList();
    }


}
