package ru.hasa.springbootapp.dao;

import ru.hasa.springbootapp.model.User;

import java.util.List;

public interface UserDao {

    User findByUsername(String username);

    void saveUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    User showUser(long id);

    void updateUser(User user);
}