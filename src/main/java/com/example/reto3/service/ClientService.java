package com.example.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reto3.entities.Client;
import com.example.reto3.repository.ClientRepository;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }

    public Optional<Client> getClient(int id){
        return clientRepository.geClient(id);
    }

    public Client save(Client p){
        if(p.getId()==null){
            return clientRepository.save(p);
        }
        else{
            Optional<Client> e = clientRepository.geClient(p.getId());
            if(e.isPresent()){
                return p; 
            }
            else{
                return clientRepository.save(p);
            }
        }
    }
}
