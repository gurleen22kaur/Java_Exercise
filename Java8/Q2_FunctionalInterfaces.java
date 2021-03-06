package com.bootcamp.functional;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface ConsumerInterface
{
    public void addList();
}

public class Q2_FunctionalInterfaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List integerList=Arrays.asList(1,5,2,7,9);
        //Consumer<Integer> consumer=i->;


        System.out.println("(Testing Predicate) Enter a number to check if it is odd : ");
        int num=sc.nextInt();
        Predicate<Integer> isNumberOdd = (n) -> (n%2 != 0) ? true : false;
        System.out.println("Is "+num+" odd number ? "+isNumberOdd.test(num));

        /*Consumer<Integer> consumer = i -> System.out.println(i);
        List<Integer> integerList = Arrays.asList(1, 5, 2, 8, 6);
        printConsumer(integerList, consumer);
       Supplier<String> StrSupplier = () -> new String("Testing Supplier");
        String str = StrSupplier.get();
        printSupplier(str);
        Predicate<String> predicateString = s -> {
            return s.equals("Hello");
        };
        pintPredicate(predicateString);
        calc((a) -> "Result: " +(a * 2), 10);
    }

    public static void printConsumer(List<Integer> integerList, Consumer<Integer> consumer) {
        System.out.println("===> Consumer Interface Test");
        for (Integer integer : integerList) {
            consumer.accept(integer);
        }
        System.out.println(" #### Consumer Interface Ends ");
        System.out.println("-----------------------------------------------");

    }

    public static void printSupplier(String str) {
        System.out.println("==> Supplier Interface Test");
        System.out.println(str);
        System.out.println("####Supplier Interface Ends");
        System.out.println("-----------------------------------------------");

    }

    public static void pintPredicate(Predicate<String> predicateString) {
        System.out.println("===> Predicate Interface Test");
        System.out.println(predicateString.test("Hello"));
        System.out.println(predicateString.test("Hello World"));
        System.out.println("===> Predicate Interface Ends");
        System.out.println("-----------------------------------------------");
    }

    public static void calc(Function<Integer, String> bi, Integer i) {
        System.out.println("===> Function Interface Test");
        System.out.println(bi.apply(i));
        System.out.println("===> Function Interface Ends");
        System.out.println("-----------------------------------------------");
    }
*/
    }
}