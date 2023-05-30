package Exercises7;
import java.util.*;
public class Exercise7_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10000];
        System.out.print("Enter numbers: ");
        for(int i = 0; i < numbers.length;i++){
            numbers[i] = input.nextInt();

            if(numbers[i] == 0) break;
        }

        evenOdds(numbers); 

    }

    public static void evenOdds(int[] num){
        int even = 0;
        int odd = 0;

        for(int i = 0; num[i] != 0;i++){
            if(num[i] % 2 == 0){
                even++;
            }else 
                odd++;
        }
        System.out.print("The number of odd numbers: " + odd + "\nThe number of even numbers: " + even);

    }

    
}
