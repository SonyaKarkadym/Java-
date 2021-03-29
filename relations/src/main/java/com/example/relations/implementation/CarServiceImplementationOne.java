package com.example.relations.implementation;

import com.example.relations.dao.CarDAO;
import com.example.relations.models.Car;
import com.example.relations.services.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("s1")
public class CarServiceImplementationOne implements CarService {

    private CarDAO carDAO;
    @Override
    public void save(Car car) {
        if(car != null){
            carDAO.save(car);
        }
    }

    @Override
    public List<Car> findAll() {
        return carDAO.findAll();
    }
}
