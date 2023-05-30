package Exercises7;
import java.util.Scanner;

public class Exercise7_18 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 double numbers: ");

        double[] numbers = new double[10];

        for(int i = 0; i < numbers.length;i++){
            numbers[i] = input.nextDouble();
        }

        bubbleSort(numbers);

        for(int i = 0; i < numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }

    }
    
    public static void bubbleSort(double[] numbers){

        for(int i = 1; !(inOrder(numbers)) && i < numbers.length;i++){
            if(numbers[i-1] > numbers[i]){
                swap(numbers,i-1,i);
            }
        }

        if(!(inOrder(numbers)))
            bubbleSort(numbers);
    }

    public static boolean inOrder(double[] array){
        for(int i = 1; i < array.length;i++){
            if(array[i-1] > array[i]){
                return false;
            }
        }
        return true;
    }


    public static void swap(double[] num, int x, int y){
        double temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }

}
