package com.example.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reto3.entities.MotorBike;
import com.example.reto3.repository.MotorBikeRepository;

@Service
public class MotorBikeService {
    @Autowired
    private MotorBikeRepository MotorBikeRepository;

    public List<MotorBike> getAll(){
        return MotorBikeRepository.getAll();
    }

    public Optional<MotorBike> getMotorBike(int id){
        return MotorBikeRepository.geMotorBike(id);
    }

    public MotorBike save(MotorBike p){
        if(p.getId()==null){
            return MotorBikeRepository.save(p);
        }
        else{
            Optional<MotorBike> e = MotorBikeRepository.geMotorBike(p.getId());
            if(e.isPresent()){
                return p; 
            }
            else{
                return MotorBikeRepository.save(p);
            }
        }
    }
}
