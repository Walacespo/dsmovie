package com.walace.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walace.dsmovie.entities.Score;
import com.walace.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}