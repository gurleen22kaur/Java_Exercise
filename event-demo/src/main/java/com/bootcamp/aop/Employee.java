package com.bootcamp.aop;

import java.io.IOException;

public class Employee {
        String name;

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display()
    {
        System.out.println(name);
    }

    public void MethodParameter(int a){
        System.out.println("Method With Parameter " +a );
    }

    Integer getInteger(Integer a)
    {
        return 5;
    }


    public void methodException() throws IOException
    {
        throw new IOException("Generic IO Exception");
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}

