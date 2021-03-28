package com.example.etiya.Service;

import com.example.etiya.Models.ListToDo;

import java.util.List;
import java.util.Optional;

public interface ListToDoService {
    void create(ListToDo listToDo);
    Optional<ListToDo> readById(int id);
    void update(ListToDo listToDo);
    void delete(int id);
    List<ListToDo> findAll();
}
