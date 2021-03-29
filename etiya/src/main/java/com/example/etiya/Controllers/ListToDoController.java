package com.example.etiya.Controllers;

import com.example.etiya.Implementation.ListToDoServiceImp;
import com.example.etiya.Models.ListToDo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/ListToDo")
public class ListToDoController {

    private ListToDoServiceImp listToDoServiceImp;

    @GetMapping()
    public List<ListToDo> findALl(){
        return listToDoServiceImp.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody ListToDo listToDo){
        listToDoServiceImp.create(listToDo);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody int id){
        listToDoServiceImp.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody ListToDo listToDo){
        listToDoServiceImp.update(listToDo);
    }

    @GetMapping("/readById")
    public void readById(int id){
        listToDoServiceImp.readById(id);
    }



}
