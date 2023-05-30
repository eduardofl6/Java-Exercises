package Exercises7;
import java.util.Scanner;

public class Exercise7_30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of values: ");
        int number = input.nextInt();

        System.out.print("Enter the values: ");
        int[] values = new int[number];

        for(int i = 0; i <  values.length;i++){
            values[i] = input.nextInt();
        }

        System.out.print("This list has " + ((isConsecutiveFour(values)) ? "" : "no ") + "consecutive fours");

    }

    public static boolean isConsecutiveFour(int[] values){
        int count = 0;
        for(int i = 1; i < values.length;i++){
            if(values[i] == values[i-1]){
                count++;
            }else if(values[i] != values[i-1]){
                count = 0;
            }
            if(count == 3){
                return true;
            }
        }

        return false;
    }
}
