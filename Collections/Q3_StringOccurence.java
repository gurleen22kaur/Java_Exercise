package com.bootcamp.collection;

import java.util.Scanner;
import java.util.*;

public class Q3_StringOccurence {
    public void occurenceCharacters(String str)
    {
        char[] strArray=str.toLowerCase().replace(" ","").toCharArray();
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for(char c:strArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
            System.out.println(map);

    }

    public static void main(String[] args)
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        Q3_StringOccurence q3_stringOccurence=new Q3_StringOccurence();
        q3_stringOccurence.occurenceCharacters(str);
    }

}
