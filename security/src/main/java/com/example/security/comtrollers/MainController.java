package com.example.security.comtrollers;

import com.example.security.DAO.ClientDao;
import com.example.security.Models.Client;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

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
