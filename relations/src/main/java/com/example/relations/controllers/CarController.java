package com.example.relations.controllers;

import com.example.relations.models.Car;
import com.example.relations.services.CarService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {

    private CarService carService;

    public CarController(@Qualifier(value = "s1") CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/car/save")
    public void saveCar(){
        carService.save(new Car("kddkdkd"));
    }

}
