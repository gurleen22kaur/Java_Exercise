import java.util.Scanner;
public class Occurences_Char {
    public int freq(String s, char c) {
        if (s.length() == 0)
            return 0;
        else if (s.charAt(0) == c)
            return 1 + freq(s.substring(1, s.length()), c);
        else
            return freq(s.substring(1, s.length()), c);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("Enter the duplicate character");
        char ch = sc.next(".").charAt(0);
        Occurences_Char oc=new Occurences_Char();
        System.out.println("Frequency is: "+oc.freq(str,ch));

    }
    /*public int freq2(String s,char c)
    {
        int n=s.length();
        int new_l=s.replace(" "+c," ").length();
        System.out.println(n);
        System.out.println(new_l);
        return(n-new_l);


    }*/
}
