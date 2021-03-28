package com.example.security.DAO;

import com.example.security.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client,Integer> {
    Client findByLogin(String login);
}
