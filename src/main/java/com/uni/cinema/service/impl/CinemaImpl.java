package com.uni.cinema.service.impl;

import com.uni.cinema.model.Movie;
import com.uni.cinema.repository.CinemaRepository;
import com.uni.cinema.service.CinemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CinemaImpl implements CinemaService {

    private final CinemaRepository cinemaRepository;


    @Override
    public List<Movie> getMovieList() {
        return cinemaRepository.findAll();
    }
}
