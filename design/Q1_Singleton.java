package com.bootcamp.design_patterns;

class Singleton{

    private static Singleton singleton_instance=null;
    public String s;

    private Singleton()
    {
        s="String is instantiated in the constructor";
    }

    public static Singleton getInstance()
    {
        if(singleton_instance==null)
            singleton_instance=new Singleton();

        return singleton_instance;
    }

}
public class Q1_Singleton {
    public static void main(String args[])
    {

        Singleton x = Singleton.getInstance();
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);

    }
}
