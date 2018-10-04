package com.bootcamp.collection;

import java.text.*;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;

public class Q8_DateFormat {


    public static void main(String[] args) {
         {
             Date date = new Date();
             DateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
             String strDate= formatter.format(date);
             System.out.println(strDate);

         }


    }
}
