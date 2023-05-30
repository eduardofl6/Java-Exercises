package Exercises7;
import java.util.Scanner;

public class Exercise7_27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        
        int[] numbers = new int[n];       

        for(int i = 0; i < n;i++){
            numbers[i] = input.nextInt();
        }

        System.out.print("The list is " + ((isSorted(numbers)?"already" : "not"))+ " sorted with a constant interval." );

    }

    public static boolean isSorted(int[] list){

        int interval = list[1] - list[0];
        for(int i = 1; i < list.length;i++){
            if(list[i-1] > list[i] || (list[i] - list[i-1]) != interval){
                return false;
            }
        }

        return true;
    }
}
