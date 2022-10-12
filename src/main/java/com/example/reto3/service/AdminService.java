package com.example.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reto3.entities.Admin;
import com.example.reto3.repository.AdminRepository;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAll(){
        return adminRepository.getAll();
    }

    public Optional<Admin> getAdmin(int id){
        return adminRepository.geAdmin(id);
    }

    public Admin save(Admin p){
        if(p.getId()==null){
            return adminRepository.save(p);
        }
        else{
            Optional<Admin> e = adminRepository.geAdmin(p.getId());
            if(e.isPresent()){
                return p; 
            }
            else{
                return adminRepository.save(p);
            }
        }
    }
}
