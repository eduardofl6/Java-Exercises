package Exercises7;
import java.util.*;

public class Exercise7_34 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String test = input.next();
        System.out.print(sort(test));
    }

    public static String sort(String s){
        char[] text = new char[s.length()];

        for(int i = 0; i < text.length;i++){
            text[i] = s.charAt(i);
        }

        java.util.Arrays.sort(text);
        
        String end = "";
        for(int i = 0; i < text.length;i++){
            end += text[i];
        }
        return end;
    }

}
