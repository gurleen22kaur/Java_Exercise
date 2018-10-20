package com.example.demo.demo.spring.service;

import com.example.demo.demo.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class UserService {

    @Autowired
    private User user;

    public List<User> getUser()
    {
        return Arrays.asList(new User("Gurleen","admin"),
                            new User("Tom","hellobye"));
    }

}
