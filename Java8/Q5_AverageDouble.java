package com.bootcamp.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


public class Q5_AverageDouble {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,2,3,4,5);
        System.out.println("Elements are: "+integerList);
        System.out.println("Average of numbers after doubling the values : ");
        averageDouble(integerList);
    }
   public  static void averageDouble(List<Integer> list)
    {
        System.out.println(list.stream().mapToDouble(x->x*2).average().getAsDouble());

    }


}
