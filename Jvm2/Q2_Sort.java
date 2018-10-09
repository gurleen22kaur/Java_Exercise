import java.util.*;
public class Q2_Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String ");
        String str = scan.nextLine();
        Q2_Sort sr = new Q2_Sort();
        if (!str.equals("null")) {
            sr.sort(str);
        }
    }

    public static void sort(String s) {
        int j = 0;
        char temp = 0;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            for (j = 0; j < chars.length; j++) {

                if (chars[j] > chars[i]) {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        String name="";

        for (int k = 0; k < chars.length; k++) {
            name=name+chars[k];

        }
        System.out.println(name);
    }
}


    /*public static void sort(String str){
        char ch[] = str.toCharArray();
        System.out.println("Length : "+ch.length);
        char temp = 0;
        for(int k = 0; k < ch.length-1; k++){
            for(int j = 0; j < ch.length-1; j++){
                if(ch[j] > ch[j+1]){
                    temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }
        String name = "";
        for(int a = 0; a < ch.length; a++){
            name += ch[a];
        }
        name = name.replaceFirst(" ","");
        System.out.println("Sorted String ="+name);
    }*/

