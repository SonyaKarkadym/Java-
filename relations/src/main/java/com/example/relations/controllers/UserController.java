package com.example.relations.controllers;


import com.example.relations.dao.UserDao;
import com.example.relations.models.Car;
import com.example.relations.models.Product;
import com.example.relations.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private UserDao userDao;

    @GetMapping("/save")
    public void save(){
        User user = new User();
        user.setName("vasya");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("milk"));
        productList.add(new Product("kokos"));
        user.setProductList(productList);
        userDao.save(user);
    }

    @GetMapping("/")
    public List<User> getUsers(){
        return userDao.findAll();
    }

    @GetMapping("/saveWithCars")
    public void saveWithCars(){
        User user = new User("Max");
        List <Car> cars = new ArrayList<>();
        cars.add(new Car("suba"));
        cars.add(new Car("mazda"));
        user.setCars(cars);

        userDao.save(user);
    }

    @PostMapping("/save")
    public void saveUserWithImage(@RequestParam String name,
                                  @RequestParam MultipartFile image) throws IOException {

        String pathToImgFolder = System.getProperty("user.home") + File.separator
                + "images" + File.separator + image.getOriginalFilename();
        image.transferTo(new File(pathToImgFolder));

        User user = new User();
        user.setName(name);

        String fileName = image.getOriginalFilename();
        user.setImg(fileName);

        userDao.save(user);

//        System.out.println(System.getProperty("user.home"));
    }

    @GetMapping("/{id}")
    public  User getImageOfUser(@PathVariable int id){
        return userDao.getOne(id);
    }

}
