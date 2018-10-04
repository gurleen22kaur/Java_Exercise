package com.bootcamp.functional;
import java.util.*;

public class Q4_Add {
    public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1,9,2,3,4,5,7);
        System.out.println("Elements are: " +list);
        System.out.println("Sum of elements gretaer than 5 are: "+sum(list));
}

    public static int sum(List<Integer> list)
    {
        return list.stream().filter(i -> i > 5).mapToInt(i -> i).sum();
    }
}
