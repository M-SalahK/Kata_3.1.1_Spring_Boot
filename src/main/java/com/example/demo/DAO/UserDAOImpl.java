package com.example.demo.DAO;


import com.example.demo.model.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public void updateUser(int id, User user) {
        User existingUser = entityManager.find(User.class, id);
        if (existingUser != null) {
            existingUser.setName(user.getName());
            existingUser.setAge(user.getAge());
            entityManager.merge(existingUser);
        }
    }

    @Override
    public User findUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUser(int id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
        }
    }


    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("select u from User u ", User.class).getResultList();
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }


}
