package com.bootcamp.Event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DatabaseMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext=new ClassPathXmlApplicationContext("event-config.xml");
        Database database=configurableApplicationContext.getBean(Database.class);

        configurableApplicationContext.start();
        System.out.println(database);
        database.connect();


        configurableApplicationContext.stop();
        configurableApplicationContext.close();
    }
}
