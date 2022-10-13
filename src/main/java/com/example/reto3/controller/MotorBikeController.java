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

import com.example.reto3.entities.MotorBike;
import com.example.reto3.service.MotorBikeService;

@RestController
@RequestMapping("api/Motorbike")
public class MotorBikeController {
    @Autowired
    private MotorBikeService motorBikeService;

    @GetMapping("/all")
    public List<MotorBike> getAll(){
        return motorBikeService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public MotorBike save(@RequestBody MotorBike p){
        return motorBikeService.save(p);
    }
}
