package com.example.reto3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.reto3.entities.Motorbike;
import com.example.reto3.service.MotorbikeService;

@RestController
@RequestMapping("api/Motorbike")
public class MotorbikeController {
    @Autowired
    private MotorbikeService motorBikeService;

    @GetMapping("/all")
    public List<Motorbike> getAll(){
        return motorBikeService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Motorbike save(@RequestBody Motorbike p){
        return motorBikeService.save(p);
    }
}
