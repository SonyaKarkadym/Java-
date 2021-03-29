package com.example.practice7.DAO;

import com.example.practice7.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface UserDao extends JpaRepository<User,Integer> {

}

