package com.example.demo.demo.spring.controller;

import com.example.demo.demo.spring.entity.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Contended;

@Controller
public class DatabaseController {

    @Autowired
    Database database;

    @GetMapping("/database")
    @ResponseBody
    public String getDatabaseDetails(){
        return "Name" +database.getName()+ "Port" +database.getPort();
    }
}
