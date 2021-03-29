package com.example.relations.implementation;

import com.example.relations.dao.CarDAO;
import com.example.relations.models.Car;
import com.example.relations.services.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service("s2")
public class CarServiceImplementationTwo implements CarService {

    private CarDAO carDao;

    @Override
    public void save(Car car) {
        carDao.save(car);
    }

    @Override
    public List<Car> findAll() {
        return carDao.findAll();
    }
}
