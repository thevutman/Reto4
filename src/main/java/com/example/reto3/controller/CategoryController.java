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

import com.example.reto3.entities.Category;
import com.example.reto3.service.CategoryService;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category p){
        return categoryService.save(p);
    }
}
