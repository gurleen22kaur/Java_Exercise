package com.bootcamp.functional;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class Q8_BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout=new FileOutputStream("/home/gurleen/BufferReader.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Writing into a file using buffered output stream and then reading from it";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }

}
