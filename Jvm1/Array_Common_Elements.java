import java.util.*;
public class Array_Common_Elements {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int arr1[]=new int[5];
       int arr2[]=new int[5];
       System.out.println("enter the elements for 1st array");
       for(int i=0;i<arr1.length;i++)
       {
           arr1[i]=sc.nextInt();
       }
        System.out.println("enter the elements for 2nd" +
                " array");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("Common elements are:");
        for(int m=0; m<arr1.length; m++)
        {
            for(int n=0; n<arr2.length; n++)
            {
                if(arr1[m]==arr2[n])
                {
                    System.out.println(arr1[m]);
                }
            }

        }
    }
}
