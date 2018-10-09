import java.util.*;
public class Array_Repeat {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int res=arr[0];
        for (int i = 1; i < arr.length; i++)
            res = res ^ arr[i];

        System.out.println("Non repeating element is: "+res);
       }
    }
//        int max=Integer.MAX_VALUE;
//        int count[]=new int[10];
//        for(int i=0;i<count.length;i++)
//        {
//            count[i]=0;
//        }
//        for(int i=0;i<count.length;i++)
//        {
//            count[arr[i]]++;
//        }
//        for(int i=0;i<count.length;i++)
//        {
//            if(count[i]==1)
//            {
//                System.out.println(i);
//            }

