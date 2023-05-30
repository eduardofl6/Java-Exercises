package Exercises7;
import java.util.Scanner;

public class Exercise7_19 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        
        int[] numbers = new int[n];       

        for(int i = 0; i < n;i++){
            numbers[i] = input.nextInt();
        }

        System.out.print("The list is " + ((isSorted(numbers)?"already" : "not"))+ " sorted." );

    }

    public static boolean isSorted(int[] list){

        for(int i = 1; i < list.length;i++){
            if(list[i-1] > list[i]){
                return false;
            }
        }

        return true;
    }
}
