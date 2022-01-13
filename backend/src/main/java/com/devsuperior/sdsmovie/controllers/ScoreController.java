package com.devsuperior.sdsmovie.controllers;

import com.devsuperior.sdsmovie.dto.MovieDTO;
import com.devsuperior.sdsmovie.dto.ScoreDTO;

import com.devsuperior.sdsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping(value = "/scores")
    public class ScoreController {

        @Autowired
        private ScoreService service;

        @PutMapping
        public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
            MovieDTO moviedto = service.saveScore(dto);
            return moviedto;
        }
    }
