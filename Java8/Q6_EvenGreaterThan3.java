package com.bootcamp.functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q6_EvenGreaterThan3 {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,3,2,12,9,5,10);
        System.out.println("Integer list :"  +integerList);

        System.out.println("First Even number after 3 is :" +integerList.stream().filter(x->x>3).filter(n->n%2==0).min(Comparator.comparing(Integer::valueOf)).get());
                //forEach(System.out::println);
    }
}
