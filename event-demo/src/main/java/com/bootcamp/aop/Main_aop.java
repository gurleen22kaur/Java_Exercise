package com.bootcamp.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main_aop {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop-config.xml");
        Employee employee=applicationContext.getBean(Employee.class);
          employee.display();


          employee.MethodParameter(10);


        //Question 3
       /* employee.methodException();*/

        //Question 6
       /* employee.getInteger(10);*/


    }
}
