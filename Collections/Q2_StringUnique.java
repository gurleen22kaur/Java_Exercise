package com.bootcamp.collection;
import java.util.*;
import java.util.Scanner;

public class Q2_StringUnique
{
    int lengthString=0;
    public  void checkString(String st)
    {
        String string=st.toLowerCase().replace(" ","");
        HashSet<Character> hashSet=new HashSet<>();
        for(int i=0;i<string.length();i++)
        {
            hashSet.add(string.charAt(i));
        }
        lengthString=hashSet.size();
        System.out.println("Number of unique characters are : " +lengthString);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        Q2_StringUnique q2_stringUnique=new Q2_StringUnique() ;
        q2_stringUnique.checkString(str);
    }

}
