package com.example.etiya.Controllers;

import com.example.etiya.Implementation.ListToDoServiceImp;
import com.example.etiya.Implementation.ToDoServiceImp;
import com.example.etiya.Models.ListToDo;
import com.example.etiya.Models.ToDo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/ListToDo/ToDo")
public class ToDoController {

    private ToDoServiceImp toDoServiceImp;

    @GetMapping("/")
    public List findALl(){
        return toDoServiceImp.findAll();
    }

    @GetMapping("/create")
    public void create(ToDo toDo){
        toDoServiceImp.create(toDo);
    }

    @GetMapping("/delete")
    public void delete(int id){
        toDoServiceImp.delete(id);
    }

    @GetMapping("/update")
    public void update(ToDo toDo){
        toDoServiceImp.update(toDo);
    }

    @GetMapping("/readById")
    public void readById(int id){
        toDoServiceImp.readById(id);
    }
}
