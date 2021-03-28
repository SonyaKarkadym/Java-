package com.example.etiya.Service;

import com.example.etiya.DAO.ClientDao;
import com.example.etiya.Models.Client;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImp implements UserDetailsService {

    private ClientDao clientDao;

    public UserDetailsServiceImp(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Client client = clientDao.findByLogin(username);
        return client;
    }
}
