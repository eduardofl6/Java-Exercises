package Exercises8;
import java.util.*;

public class Exercise8_11 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511: ");
        
        int number = input.nextInt();
        if(number>= 0 && number < 512){
            String test = toBinary(number);
            headsAndTails(test);

        }else
            System.out.print("Wrong input");
        
    }

    public static void headsAndTails(String enter){
        char[][] matrix = new char[3][3];


        for(int i = 0,t = 0; i < matrix.length;i++){

            for(int v = 0; v < matrix[i].length;v++){

                matrix[i][v] = (enter.charAt(t++) == '0') ? 'H' : 'T';
            }
        }

        for(int i = 0; i < matrix.length;i++){

            for(int v = 0; v < matrix[i].length;v++){
                System.out.print(matrix[i][v] + " ");
            }
            System.out.println();
        }

    }

    public static String toBinary(int number){
        String answer = Integer.toBinaryString(number);
        String zeros = "";
        for(int i = 9 - answer.length(); i > 0; i--){
            zeros += "0";
        }
        


        return zeros + answer;
    }
}
