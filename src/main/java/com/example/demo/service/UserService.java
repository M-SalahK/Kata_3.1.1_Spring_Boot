package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void updateUser(int id, User user);

    void deleteUser(int id);

    User getUserById(int id);

    List<User> getUsers();
}
