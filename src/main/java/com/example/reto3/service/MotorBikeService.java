package com.example.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reto3.entities.Motorbike;
import com.example.reto3.repository.MotorbikeRepository;

@Service
public class MotorbikeService {
    @Autowired
    private MotorbikeRepository MotorBikeRepository;

    public List<Motorbike> getAll(){
        return MotorBikeRepository.getAll();
    }

    public Optional<Motorbike> getMotorBike(int id){
        return MotorBikeRepository.geMotorBike(id);
    }

    public Motorbike save(Motorbike p){
        if(p.getId()==null){
            return MotorBikeRepository.save(p);
        }
        else{
            Optional<Motorbike> e = MotorBikeRepository.geMotorBike(p.getId());
            if(e.isPresent()){
                return p; 
            }
            else{
                return MotorBikeRepository.save(p);
            }
        }
    }
}
