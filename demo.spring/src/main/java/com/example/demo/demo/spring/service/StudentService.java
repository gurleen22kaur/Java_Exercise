package com.example.demo.demo.spring.service;

import com.example.demo.demo.spring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class StudentService {

    @Autowired
    private Student student;

    public List<Student> getStudents()
    {
        return Arrays.asList(new Student(1,"Gurleen","Ludhiana"),
                new Student(2,"Sam","Delhi"));

    }
}
