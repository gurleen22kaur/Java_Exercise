package com.spring.demo;

/**
 * Created by gurleen on 10/10/18.
 */
public class Tea implements HotDrink{
    @Override
    public void prepareDrink() {
        System.out.println( "Preparing Tea");
    }


}
