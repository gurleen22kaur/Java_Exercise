import java.util.*;

public class Operator_Overloading {

    public int add(int a,int b) {
        return (a + b);
    }
    public double add(double a, double b)
    {
        return (a+b);

    }
    public float mul(float a, float b)
    {
        return (a*b);
    }
    public int mul(int a,int b)
    {
        return (a*b);
    }
    public String concatenate(String a,String b)
    {
        return(a+b);
    }
    public String concatenate(String a,String b,String c)
    {
        return(a+b+c);
    }



    public static void main(String args[])
    {
        Operator_Overloading oo=new Operator_Overloading();
        System.out.println("Adding 2 integers " +oo.add(10,20));
        System.out.println("Adding 2 double values " +oo.add(10.5,20.5));
        System.out.println("Multiplying 2 integers " +oo.mul(10,20));
        System.out.println("Multiplying 2 floats "+oo.mul(10.5f,20.5f));
        System.out.println("Concatenating 2 strings "+oo.concatenate("Good", "Morning"));
        System.out.println("Concatenating 3 strings "+oo.concatenate("Good", "Morning", "Everyone"));



    }


}
