package com.example.demo.dao;

import com.example.demo.models.Calculate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository <Calculate,Integer> {
}
