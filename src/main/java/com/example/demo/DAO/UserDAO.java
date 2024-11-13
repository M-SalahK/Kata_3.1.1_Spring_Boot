package com.example.demo.DAO;

import com.example.demo.model.User;

import java.util.List;

public interface UserDAO {
    void save(User user);

    void updateUser(int id, User user);

    List<User> getUsers();

    User findUser(int id);

    void deleteUser(int id);
}
