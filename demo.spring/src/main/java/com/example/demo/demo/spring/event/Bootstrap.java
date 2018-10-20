package com.example.demo.demo.spring.event;


import com.example.demo.demo.spring.entity.Student1;
import com.example.demo.demo.spring.repository.Student1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class Bootstrap {

    @Autowired
    Student1Repository student1Repository;

    @EventListener(ApplicationStartedEvent.class)
    public void init()
    {
        Iterator<Student1> iterator=student1Repository.findAll().iterator();
        if (!iterator.hasNext()) {
            for (int i = 1; i <= 10; i++) {
                Student1 student1 = new Student1(i, "Student " + i);
                student1Repository.save(student1);
                System.out.println("Student " + i + " created");
            }
        }
        System.out.println("Your Application is up and running");

    }


}
