package com.bootcamp.functional;
import java.io.*;

public class Q9_PrintStream {
    public static void main(String[] args) throws IOException {

        int a=10;
        System.out.printf("Demo of printf() : %d",a);
        System.out.println();
        System.out.println("Changes made in file using printStream");

        PrintStream printStream = new PrintStream("/home/gurleen/file1.txt");

        printStream.println(true);
        printStream.println("Hello");
        printStream.println((int) 123);


        printStream.close();
    }
}
