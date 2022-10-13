package com.example.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.reto3.entities.Motorbike;
import com.example.reto3.repository.crudRepository.MotorbikeCrudRepository;

@Repository
public class MotorbikeRepository {
    @Autowired
    private MotorbikeCrudRepository motorBikeCrudRepository;

    public List<Motorbike> getAll(){
        return (List<Motorbike>) motorBikeCrudRepository.findAll();
    }

    public Optional<Motorbike> geMotorBike(int id){
        return motorBikeCrudRepository.findById(id);
    }

    public Motorbike save(Motorbike c){
        return motorBikeCrudRepository.save(c);
    }
}
