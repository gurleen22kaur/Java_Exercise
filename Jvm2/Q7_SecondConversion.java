
import java.util.*;
import java.text.*;
public class Q7_SecondConversion {

        int hour, min, sec, day;

        public void convert ( int seconds)
        {
            day = seconds / 86400;

            seconds = seconds % (24 * 3600);
            int hour = seconds / 3600;

            seconds %= 3600;
            int min = seconds / 60;

            seconds %= 60;
            int sec = seconds;
            System.out.println(+day+" "+hour+":"+min+":"+sec+" ");


        }

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for seconds");
        int seconds=sc.nextInt();
        Q7_SecondConversion sec_con=new Q7_SecondConversion();
        sec_con.convert(seconds);

    }


}


