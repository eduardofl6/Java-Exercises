package Exercises7;
import java.util.Scanner;

public class Exercise7_15 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < numbers.length;i++){
            numbers[i] = input.nextInt();
        }
        numbers = eliminateDuplicates(numbers);
        for(int i = 0; i < numbers.length;i++){
            System.out.print(((numbers[i] > 0) ? numbers[i] + " "  : ""));
        }
    }

    public static int[] eliminateDuplicates(int[] list){

        int[] noDup = new int[list.length];

        for(int i = 0; i < list.length;i++){
            if(hasntIn(list, i)){
                noDup[i] = list[i]; 
            }
        }
        

        return noDup;
    }
    
    public static boolean hasntIn(int[] array, int num){
        int x = array[num];
        boolean value = false;
        for(int i = 0; i < num;i++){
            if(array[i] == x){
                value = true;
            }
        }
        return !value;
    }
}
