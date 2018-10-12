package com.spring.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * Created by gurleen on 10/10/18.
 */
public class Complex {
    List list;
    Set set;
    Map map;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "list=" + list +
                ", set=" +set +
                ", map=" + map +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        Complex complex=applicationContext.getBean(Complex.class);
        System.out.println(complex);
    }
}

