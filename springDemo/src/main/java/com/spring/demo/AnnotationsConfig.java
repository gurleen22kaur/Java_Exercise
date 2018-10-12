package com.spring.demo;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationsConfig {
    /*@Bean
    public Tea teaRestaurant()
    {
        return new Tea();
    }*/

   @Bean
    public ExpressTea expressTea()
    {
        return new ExpressTea();
    }

    /*@Bean
    public Restaurant restaurant1()
    {
        return new Restaurant(teaRestaurant());
    }*/

    @Bean
    public Restaurant restaurant2()
    {
        return new Restaurant(expressTea());
    }

}

