package com.example.demo.service;

import com.example.demo.DAO.UserDAO;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Transactional
    @Override
    public void saveUser(User user) {
        userDAO.save(user);
    }

    @Transactional
    @Override
    public void updateUser(int id, User user) {
        userDAO.updateUser(id, user);
    }

    @Transactional
    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Transactional
    @Override
    public User getUserById(int id) {
        return userDAO.findUser(id);
    }
    @Transactional
    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }
}
