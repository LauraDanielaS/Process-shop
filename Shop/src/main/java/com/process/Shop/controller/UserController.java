package com.process.Shop.controller;

import com.process.Shop.model.User;
import com.process.Shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @Autowired
    private UserService userService;
    public User getUserByID(){
        return userService.getUserById(1L);
    }


}
