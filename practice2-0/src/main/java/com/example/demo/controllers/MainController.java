package com.example.demo.controllers;

import com.example.demo.dao.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController {
    private UserDao userDao;

    @GetMapping("/calculator")
    public String calculate(@RequestParam int a,@RequestParam String action,@RequestParam int b){
        int res;
        switch (action){
            case "add": action = "+";
            res = a + b;
            break;
            case "sub": action = "-";
            res = a-b;
            break;
            case "div": action = "/";
            res = a/b;
            break;
            case "mult": action = "*";
            res = a*b;
            break;
            default: return "wrong";
        }
        return a + action + b + "=" + Integer.toString(res);
    }
}
