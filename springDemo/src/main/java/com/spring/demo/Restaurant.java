package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

   /* public void setHotDrink(HotDrink hotDrink)
    {
        this.hotDrink = hotDrink;
    }*/
    //@Required
    @Autowired
    public void setHotDrink(HotDrink hotDrink)

    {
        this.hotDrink = hotDrink;
    }

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public static void main(String[] args) {
        //For using spring-config.xml for beans
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");*/

        //For using AnnotationsConfig.java for beans
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AnnotationsConfig.class);
        Restaurant restaurant = applicationContext.getBean (Restaurant.class);
        restaurant.getHotDrink().prepareDrink();

        //to check if tea class is prototype
        //System.out.println(applicationContext.isPrototype("teaRestaurant"));

    }
}
