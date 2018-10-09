import java.util.*;
class InvalidValueException extends Exception
{
    InvalidValueException(String s) {
        super(s);
    }
}

public class Q13_CustomException {

    static void check(int i)throws InvalidValueException
    {
        if(i>10)
            throw new InvalidValueException("Enter a value less than 10");
        if(i==10)
            System.out.println(+i+" is equal to 10");
        else
            System.out.println(+i+" is less than 10");
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value to check");
        int val=sc.nextInt();
        try{
            check(val);
        }catch(Exception m)
        {
            System.out.println("Exception occured: "+m);
        }

    }

}

