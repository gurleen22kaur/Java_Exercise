import java.util.*;
import java.text.*;
public class Num_Per_String {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int n=str.length();
        System.out.println("Length of the strring is : "+n);
        char char_str[]=str.toCharArray();
        DecimalFormat df= new DecimalFormat(".##");
        int low_no=0;
        int up_no=0;
        int special_no=0;
        int dig_no=0;
        double per_low;
        double per_up;
        double per_dig;
        double per_special;

        for(int i=0;i<char_str.length;i++)
        {
            int asc=char_str[i];
            if((asc >= 48 ) && (asc <= 57))
                dig_no++;
            else if((asc >= 65 ) && (asc <= 90))
                up_no++;
            else if((asc >= 97 ) && (asc <= 122))
                low_no++;
            else
                special_no++;
        }

        per_dig=(((double)dig_no/n)*100);
        per_low=(((double)low_no/n)*100);
        per_up=(((double)up_no/n)*100);
        per_special=(((double)special_no/n)*100);

        System.out.println("Upper case characters");
        System.out.println("Number: " + up_no  +  "  Percentage  "+df.format(per_up));

        System.out.println("Lower case characters");
        System.out.println("Number: " + low_no  +  "  Percentage  "+df.format(per_low));

        System.out.println("Digits");
        System.out.println("Number: " +  dig_no +  "  Percentage  "+df.format(per_dig));

        System.out.println("Special Characters");
        System.out.println("Number: " +  special_no  +  "  Percentage  "+df.format(per_special));
    }
}
