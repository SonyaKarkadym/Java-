package com.example.etiya.DAO;

import com.example.etiya.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client,Integer> {
    Client findByLogin(String login);
}
