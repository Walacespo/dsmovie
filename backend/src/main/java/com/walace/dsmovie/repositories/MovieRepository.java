package com.walace.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walace.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}