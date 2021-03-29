package com.example.etiya.DAO;

import com.example.etiya.Models.ListToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface ListToDoDAO extends JpaRepository<ListToDo,Integer> {
}
