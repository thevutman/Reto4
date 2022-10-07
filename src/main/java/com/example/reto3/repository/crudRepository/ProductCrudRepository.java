package com.example.reto3.repository.crudRepository;

import org.springframework.data.repository.CrudRepository;

import com.example.reto3.entities.Product;

public interface ProductCrudRepository extends CrudRepository<Product,Integer> {
    
}
