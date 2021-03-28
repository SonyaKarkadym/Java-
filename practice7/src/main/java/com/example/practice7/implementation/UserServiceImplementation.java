package com.example.practice7.implementation;

import com.example.practice7.DAO.UserDao;
import com.example.practice7.model.User;
import com.example.practice7.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceImplementation implements UserService {

    private UserDao userDao;

    @Override
    public void save(String name) {
        User user = new User();
        user.setName(name);
        userDao.save(user);
    }

    @Override
    public void update(int id, String name) {
        User user1 = userDao.findById(id).get();
        user1.setName(name);
        userDao.save(user1);
    }

    @Override
    public void delete(int id) {
        User deletedUser = userDao.findById(id).get();
        userDao.delete(deletedUser);
    }

    @Override
    public List<User> findALl() {
        return userDao.findAll();
    }
}
