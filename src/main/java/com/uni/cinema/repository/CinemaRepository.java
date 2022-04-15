package com.uni.cinema.repository;

import com.uni.cinema.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaRepository extends JpaRepository<Movie, Integer> {

    List<Movie> findAll();

}
