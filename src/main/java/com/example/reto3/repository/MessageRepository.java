package com.example.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.reto3.entities.Message;
import com.example.reto3.repository.crudRepository.MessageCrudRepository;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }

    public Optional<Message> geMessage(int id){
        return messageCrudRepository.findById(id);
    }

    public Message save(Message c){
        return messageCrudRepository.save(c);
    }

    public void delete(Message c){
        messageCrudRepository.delete(c);
    }

}
