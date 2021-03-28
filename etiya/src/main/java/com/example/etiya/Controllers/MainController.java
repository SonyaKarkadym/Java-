package com.example.etiya.Controllers;

import com.example.etiya.DAO.ClientDao;
import com.example.etiya.Models.Client;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class MainController {

    private PasswordEncoder passwordEncoder;
    private ClientDao clientDao;

    public MainController(PasswordEncoder passwordEncoder, ClientDao clientDao) {
        this.passwordEncoder = passwordEncoder;
        this.clientDao = clientDao;
    }

    @PostMapping("/signUp")
    public void signUp(@RequestBody Client client){
        System.out.println(client);
        String pass = client.getPassword();
        String encode = passwordEncoder.encode(pass);
        client.setPass(encode);
        clientDao.save(client);
    }

    @GetMapping("/")
    public List<Client> home(){
        return clientDao.findAll();
    }
}
