package com.example.etiya.Controllers;

import com.example.etiya.Implementation.ListToDoServiceImp;
import com.example.etiya.Implementation.ToDoServiceImp;
import com.example.etiya.Models.ListToDo;
import com.example.etiya.Models.ToDo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/ListToDo/ToDo")
public class ToDoController {

    private ToDoServiceImp toDoServiceImp;


    @GetMapping("/")
    public List findALl(){
        return toDoServiceImp.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody ToDo toDo){
        toDoServiceImp.create(toDo);
    }

    @DeleteMapping("/delete")
    public void delete(int id){
        toDoServiceImp.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody ToDo toDo){
        toDoServiceImp.update(toDo);
    }

    @GetMapping("/readById")
    public void readById(int id){
        toDoServiceImp.readById(id);
    }
}
