package com.example.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.reto3.entities.MotorBike;
import com.example.reto3.repository.crudRepository.MotorBikeCrudRepository;

@Repository
public class MotorBikeRepository {
    @Autowired
    private MotorBikeCrudRepository motorBikeCrudRepository;

    public List<MotorBike> getAll(){
        return (List<MotorBike>) motorBikeCrudRepository.findAll();
    }

    public Optional<MotorBike> geMotorBike(int id){
        return motorBikeCrudRepository.findById(id);
    }

    public MotorBike save(MotorBike c){
        return motorBikeCrudRepository.save(c);
    }
}
