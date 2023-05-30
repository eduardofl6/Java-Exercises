package Exercises6;
import java.util.*;

public class Exercise6_23 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String one = input.next();
        char two = ((input.nextLine()).charAt(1));

   System.out.print(count(one,two));
    }

    public static int count(String str, char a){
        int count = 0;

        for(int i = 0; i < str.length();i++){

            if(str.charAt(i) == a){
                count++;
            }
        }

        return count;
    }

}
