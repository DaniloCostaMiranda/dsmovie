package com.devsuperior.sdsmovie.repositories;


import com.devsuperior.sdsmovie.entities.Score;
import com.devsuperior.sdsmovie.entities.ScorePK;
import com.devsuperior.sdsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {


}
