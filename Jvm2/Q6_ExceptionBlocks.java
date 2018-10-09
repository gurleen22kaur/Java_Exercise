import java.io.IOException;

import java.util.*;
public class Q6_ExceptionBlocks {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter the size of an array");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter a number for division");
            int no=sc.nextInt();
            int div=arr[n-1]/no;
            System.out.println("Answer is: "+div);
        }
        catch (ArithmeticException  | ArrayIndexOutOfBoundsException | NullPointerException ex)
        {
            System.out.println("Exception arises");

        }
        finally
        {
         System.out.println("Finally will always execute");
        }
    }


}
