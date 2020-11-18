package com.lbl.forumbackend.controller;


import com.lbl.forumbackend.pojo.User;
import com.lbl.forumbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloContoller {

    @Autowired
    private UserService userService;

    @GetMapping("/sayhello")
    public List<User> sayHello() {
        return userService.getAllUser();
    }
}
