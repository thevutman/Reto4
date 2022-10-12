package com.example.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reto3.entities.Score;
import com.example.reto3.repository.ScoreRepository;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAll(){
        return scoreRepository.getAll();
    }

    public Optional<Score> getScore(int id){
        return scoreRepository.geScore(id);
    }

    public Score save(Score p){
        if(p.getId()==null){
            return scoreRepository.save(p);
        }
        else{
            Optional<Score> e = scoreRepository.geScore(p.getId());
            if(e.isPresent()){
                return p; 
            }
            else{
                return scoreRepository.save(p);
            }
        }
    }
}
