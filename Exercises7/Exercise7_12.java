package Exercises7;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercise7_12 {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        int[] array = reverse(numbers);
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }
        
    }

    public static int[] reverse(int[] array){
        int[] num = new int[array.length];
        for(int i = 0, j = num.length-1; i < array.length; i++,j--){
            num[i] = array[j];
        }
        System.arraycopy(num, 0, array, 0, array.length);
        return array;
    }
}
