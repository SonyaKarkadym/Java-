package com.example.etiya.Implementation;

import com.example.etiya.DAO.ListToDoDAO;
import com.example.etiya.Models.ListToDo;
import com.example.etiya.Service.ListToDoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ListToDoServiceImp implements ListToDoService {

    private ListToDoDAO listToDoDAO;

    @Override
    public void create(ListToDo listToDo) {
        listToDoDAO.save(listToDo);
    }

    @Override
    public Optional<ListToDo> readById(int id) {
        return listToDoDAO.findById(id);
    }

    @Override
    public void update(ListToDo listToDo) {
        listToDoDAO.save(listToDo);
    }

    @Override
    public void delete(int id) {
        listToDoDAO.deleteById(id);
    }

    @Override
    public List<ListToDo> findAll(){
        return listToDoDAO.findAll();
    }
}
