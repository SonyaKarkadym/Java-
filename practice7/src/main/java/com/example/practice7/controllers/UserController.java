package com.example.practice7.controllers;

import com.example.practice7.DAO.UserDao;
import com.example.practice7.implementation.UserServiceImplementation;
import com.example.practice7.model.User;
import com.example.practice7.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
    private UserServiceImplementation userServiceImplementation;

    @GetMapping("/create")
    public void create(@RequestParam String name){
        userServiceImplementation.save(name);
    }

    @GetMapping("/update")
    public void update(@RequestParam int id,@RequestParam String name){
        userServiceImplementation.update(id,name);
    }

    @GetMapping("/delete")
    public void delete(@RequestParam int id){
        userServiceImplementation.delete(id);
    }

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userServiceImplementation.findALl();
    }

}
