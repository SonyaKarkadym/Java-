package com.example.etiya.DAO;

import com.example.etiya.Models.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface ToDoDAO extends JpaRepository<ToDo,Integer> {
}
