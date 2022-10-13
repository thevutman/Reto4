package com.example.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reto3.entities.Message;
import com.example.reto3.repository.MessageRepository;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll(){
        return messageRepository.getAll();
    }

    public Optional<Message> getMessage(int id){
        return messageRepository.geMessage(id);
    }

    public Message save(Message p){
        if(p.getIdMessage()==null){
            return messageRepository.save(p);
        }
        else{
            Optional<Message> e = messageRepository.geMessage(p.getIdMessage());
            if(e.isPresent()){
                return p; 
            }
            else{
                return messageRepository.save(p);
            }
        }
    }
}
