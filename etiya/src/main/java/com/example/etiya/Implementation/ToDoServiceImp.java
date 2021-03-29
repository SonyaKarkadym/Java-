package com.example.etiya.Implementation;

import com.example.etiya.DAO.ToDoDAO;
import com.example.etiya.Models.ToDo;
import com.example.etiya.Service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ToDoServiceImp implements ToDoService {
    private ToDoDAO toDoDAO;

    @Override
    public void create(ToDo toDo) {
        toDoDAO.save(toDo);
    }

    @Override
    public Optional<ToDo> readById(int id) {
        return toDoDAO.findById(id);
    }

    @Override
    public void update(ToDo toDo) {
        toDoDAO.save(toDo);
    }

    @Override
    public void delete(int id) {
        toDoDAO.deleteById(id);
    }

    @Override
    public List findAll(){
        return toDoDAO.findAll();
    }
}
