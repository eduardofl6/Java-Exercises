package Exercises7;
import java.util.Scanner;

public class Exercise7_9 {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");

        for(int i = 0; i < numbers.length;i++){
            numbers[i] = input.nextDouble();
        }

        System.out.print(max(numbers));

        
    }

    public static double max(double[] array){
        double max = array[0];

        for(int i = 1; i < array.length;i++){
            if(max < array[i]) max = array[i];

        }
        
        return max;
    }
}
