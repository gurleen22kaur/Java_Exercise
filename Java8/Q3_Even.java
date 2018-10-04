package com.bootcamp.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Q3_Even {
    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,9,2,4,3,6);
        System.out.println("Original list: "+integerList);
        System.out.println("Even numbers are:");
        integerList.stream().filter(num -> num%2 == 0).forEach(System.out::println);
    }
}

