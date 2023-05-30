package Exercises7;
import java.util.*;

public class Exercise7_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] numbers = new int[10000];

        System.out.print("Enter integers between 1 and 50: ");
        for(int i = 0; i < numbers.length;i++){
            numbers[i] = input.nextInt();

            if(numbers[i] == 0) break;
        }

        occurrence(numbers);

    }

    public static void occurrence(int[] num){
        int[] count = new int[50];

        for(int i = 0; num[i] != 0;i++){
            count[num[i]]++;
        }
        
        for(int i = 0; i < count.length; i++){
          if(count[i] > 0)
            System.out.println(i + " occures " + count[i] + " time" + ((count[i] > 1) ? "s" : ""));

        }

    }
}
