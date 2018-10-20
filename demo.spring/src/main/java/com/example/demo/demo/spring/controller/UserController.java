package com.example.demo.demo.spring.controller;

import com.example.demo.demo.spring.entity.User;
import com.example.demo.demo.spring.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


@RestController
public class UserController {

    Logger logger=  LoggerFactory.getLogger(UserController.class);


    @Autowired
    private UserService userService;


    @GetMapping("/user")
    public List<User> getUser()
    {
        logger.info("Logging User");
        return userService.getUser();
    }

}

