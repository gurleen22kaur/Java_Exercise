import java.util.*;
public class Reverse_Remove_StringBuff {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a String: ");
        String str=sc.nextLine();
        if(str.length()>9) {
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            System.out.println("Reversed string is:" + sb);
            sb.delete(4, 9);
            System.out.println("String is : " + sb);
        }
        else
        {
            System.out.println("Please enter a string with valid length");
        }
    }

}
