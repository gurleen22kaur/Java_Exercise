package com.example.demo.demo.spring.service;


import com.example.demo.demo.spring.entity.Student1;
import com.example.demo.demo.spring.repository.Student1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class Student1Service {


    @Autowired
    Student1Repository student1Repository;

    public List<Student1> getBooks(){
        List<Student1> student1s = new ArrayList<>();
        Iterator<Student1> bookIterator = student1Repository.findAll().iterator();
        bookIterator.forEachRemaining(student1s::add);
        return student1s;
    }
}


