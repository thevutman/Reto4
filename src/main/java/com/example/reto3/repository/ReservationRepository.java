package com.example.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.reto3.entities.Reservation;
import com.example.reto3.repository.crudRepository.ReservationCrudRepository;

@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCrudRepository.findAll();
    }

    public Optional<Reservation> geReservation(int id){
        return reservationCrudRepository.findById(id);
    }

    public Reservation save(Reservation c){
        return reservationCrudRepository.save(c);
    }
}
