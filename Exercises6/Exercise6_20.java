package Exercises6;
import java.util.*;

public class Exercise6_20 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String letters = input.nextLine();

        System.out.print("There is " + countLetters(letters) + " letter" + ((countLetters(letters) > 1) ? "s" : "") +  " in this string");
    }

    public static int countLetters(String s){

        int letters = 0;
        for(int i = 0; i <= s.length()-1; i++){

        
            if(Character.isLetter(s.charAt(i)) == true){
                letters++;
            }

        }
        


        return letters;
    }
}
