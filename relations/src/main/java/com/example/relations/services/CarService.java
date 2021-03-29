package com.example.relations.services;

import com.example.relations.models.Car;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CarService {
    void save(Car car);
    List<Car> findAll();
}
