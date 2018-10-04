package com.bootcamp.functional;
import java.util.*;

interface FirstGreater
{
    public boolean checkGreater(int ab,int b);
}
interface Increment
{
    public int incValue(int num);
}
interface Concatenation
{
    public String concatString(String s1, String s2);
}
interface Uppercase
{
    public String stringUppercase(String st);
}

public class Q1_Lambda
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integers to check if first number is greater than the second number ");
        int y=sc.nextInt();
        int z=sc.nextInt();
        FirstGreater firstGreater = (a, b) -> (a > b);
        System.out.println("Is First number greater than Second : " +firstGreater.checkGreater(y,z));

        System.out.println("Enter the number to increment");
        int value=sc.nextInt();
        Increment increment=val->val+1;
        System.out.println("value after increment : " +increment.incValue(value));

        System.out.println("Enter two strings to concatenate");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        Concatenation concatenation=(s1,s2)->(s1.concat(s2));
        System.out.println("After concatenation :" +concatenation.concatString(str1,str2));

        System.out.println("Enter a string to change it to uppercase");
        String string=sc.nextLine();
        Uppercase uppercase=(s)->s.toUpperCase();
        System.out.println("Uppercase String : " +uppercase.stringUppercase(string));




    }

}
