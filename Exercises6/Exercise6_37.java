package Exercises6;
import java.util.*;

public class Exercise6_37 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and width: ");
        int number  = input.nextInt();
        int width  = input.nextInt();
   
        System.out.print(format(number, width));
    }

    public static String format(int number, int width){
        String output = "";

        int size1 = ("" + number).length();


        if(size1 >= width){
            return number + "";
        }

        width -= size1;

        for(;width > 0; width--){

            output += "0";
        }

        return output + number;
    }

}
