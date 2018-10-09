import java.util.*;

public class Replace_Sub {



    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            String str="Hello..How are you?" ;
            System.out.println("String is:" +str);
            System.out.println("Enter a string to replace");
            String rep=sc.nextLine();
            System.out.println("Enter the new string for replacement ");
            String new_rep=sc.nextLine();
            String rep_str=str.replaceAll("(?i)"+rep,new_rep);
            System.out.println("New string is:" +rep_str);



    }
}


