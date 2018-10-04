package com.bootcamp.collection;
import java.util.*;
import java.text.*;
public class Q9_TimeZone {
    public static void main(String[] args) {

        SimpleDateFormat indsdf = new SimpleDateFormat("dd/MM/yyyy zZ HH:mm:ss a");
        SimpleDateFormat usasdf = new SimpleDateFormat("MM/dd/yyyy zZ HH:mm:ss a");
        SimpleDateFormat paksdf = new SimpleDateFormat("yyyy-MM-dd zZ HH:mm:ss a");

        TimeZone ind = TimeZone.getTimeZone("Asia/Kolkata");
        TimeZone usa = TimeZone.getTimeZone("US/Central");
        TimeZone pakistan = TimeZone.getTimeZone("Asia/Karachi");

        indsdf.setTimeZone(ind);
        usasdf.setTimeZone(usa);
        paksdf.setTimeZone(pakistan);

        System.out.println("India Time format " + indsdf.format(new Date()));
        System.out.println("USA time format " + usasdf.format(new Date()));
        System.out.println("Pak time format " + paksdf.format(new Date()));

    }
}
