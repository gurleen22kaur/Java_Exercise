package com.example.demo.demo.spring.controller;


import com.example.demo.demo.spring.entity.Student;
import com.example.demo.demo.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }
}