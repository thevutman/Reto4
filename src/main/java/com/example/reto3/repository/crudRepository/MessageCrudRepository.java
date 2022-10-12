package com.example.reto3.repository.crudRepository;

import org.springframework.data.repository.CrudRepository;

import com.example.reto3.entities.Message;

public interface MessageCrudRepository extends CrudRepository<Message,Integer>{
    
}
