import java.util.*;

public class Duplicate_words {
    public static void main(String[] args){
        String str = null;
        int count=0,len=0;
        System.out.println("Enter the String ");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        if(!str.equals("null")){
            System.out.println("Entered String : "+str);
            String[] words = str.split(" ");
            int wc = 1;
            for(int i=0;i<words.length;i++)
            {
                for(int j=i+1;j<words.length;j++)
                {
                    if(words[i].equals(words[j]))
                    {
                        wc = wc+1;
                        words[j]="0";
                    }
                }
                if(words[i]!="0")
                    System.out.println(words[i]+"--->"+wc);
                wc = 1;
            }
        }
    }
}
