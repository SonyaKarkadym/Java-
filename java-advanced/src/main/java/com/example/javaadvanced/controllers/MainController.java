package com.example.javaadvanced.controllers;

import com.example.javaadvanced.dao.UserDao;
import com.example.javaadvanced.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController {

    private UserDao userDao;

    @GetMapping("/hello")
    public String hello(){
        System.out.println("!!!!");
        return "hello";
    }

    @GetMapping("/user")
    public User getUser(){
        User user = new User();
        user.setId(111);
        user.setName("kokos");
        return user;
    }

    @GetMapping("saveUser")
    public void saveUser(@RequestParam String name){
        User user = new User(name);
        userDao.save(user);
    }




}
