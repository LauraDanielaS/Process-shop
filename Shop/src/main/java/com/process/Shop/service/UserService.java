package com.process.Shop.service;

import com.process.Shop.model.User;

import java.util.List;

public interface UserService {
    User CreateUser(User user);

    User updateUser(User userUpdated, Long id);

    User getUserById(Long id);

    List<User> findAllUsers();


}
