package com.example.practice7.service;

import com.example.practice7.model.User;

import java.util.List;

public interface UserService {
void save(String name);
void update(int id,String name);
void delete(int id);
List<User> findALl();
}
