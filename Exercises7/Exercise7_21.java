package Exercises7;
import java.util.Scanner;

public class Exercise7_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers to normalize: ");

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length;i++){
            numbers[i] = input.nextInt();
        }

        normalize(numbers);

        for(int i = 0; i < numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }

    }


    public static void normalize(int[] array){
        int max = array[0];

        for(int i = 1; i < array.length;i++){
            if(max < array[i]){
                max = array[i];
            }
        }

        for(int i = 0; i < array.length;i++){
            array[i] /= max;
        }

    }

}
