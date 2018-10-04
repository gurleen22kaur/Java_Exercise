package com.bootcamp.collection;

import java.util.ArrayList;
import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListManipulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Float> arrayList = new ArrayList<>(5);
        System.out.println("Enter the number of values you want to add");
        int n=sc.nextInt();
        System.out.println("Enter float values");

        for(int i=0;i<n;i++)
        {
            float j=sc.nextFloat();
            arrayList.add(j);

        }
        float sum=0f;
        Iterator<Float> i=arrayList.iterator();
        while (i.hasNext())
        {
            sum=sum+i.next();

        }
        System.out.println("Sum is :" +sum);

    }
}
