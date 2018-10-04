package com.bootcamp.functional;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class Q8_BufferedReader_Read {
    public static void main(String[] args)throws IOException {
        FileInputStream fin=new FileInputStream("/home/gurleen/BufferReader.txt");
        BufferedInputStream bin=new BufferedInputStream(fin);
        int i;
        while((i=bin.read())!=-1){
            System.out.print((char)i);
        }
        bin.close();
        fin.close();
    }
}
