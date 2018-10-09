import java.util.*;
public class Q8_Check_Done {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("USING WHILE LOOP");
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String demo;
        String str_do;
        String demo_do;
        while(!str.equals("done"))
        {
            if(str.charAt(0)==str.charAt(str.length()-1))
            {
                System.out.println("Starting and Ending characters are same in " +str);
            }
            else
            {
                System.out.println("Starting and Ending characters are different in: "+str);
            }
            System.out.println("Enter another string");
            demo=sc.nextLine();
            str=demo;

        }
        System.out.println("String terminated after entering done" );


        System.out.println("Using DO WHILE LOOP");
        do {
            System.out.println("Enter a string");
            str_do = sc.nextLine();
            {
                if (str_do.charAt(0) == str_do.charAt(str_do.length() - 1)) {
                    System.out.println("Starting and Ending characters are same in " + str_do);
                } else {
                    System.out.println("Starting and Ending characters are different in: " + str_do);
                }
            }
        }while(!str_do.equals("done"));
        System.out.println("done is entered");
    }






}
