package com.example.etiya.Service;

import com.example.etiya.Models.ToDo;

import java.util.List;
import java.util.Optional;

public interface ToDoService {
    void create(ToDo toDo);
    Optional<ToDo> readById(int id);
    void update(ToDo toDo);
    void delete(int id);
    List<ToDo> findAll();
}
