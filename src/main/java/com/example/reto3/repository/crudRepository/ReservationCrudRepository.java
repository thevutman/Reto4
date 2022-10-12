package com.example.reto3.repository.crudRepository;

import org.springframework.data.repository.CrudRepository;

import com.example.reto3.entities.Reservation;

public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer>{
    
}
