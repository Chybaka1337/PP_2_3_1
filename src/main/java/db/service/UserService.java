package db.service;

import db.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User getUserById(int id);

    List<User> getAllUsers();
}
