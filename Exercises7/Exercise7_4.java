package Exercises7;
import java.util.*;

public class Exercise7_4 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[] scores = new double[100];

        for(int i = 0; i < 100;i++){
            scores[i] = input.nextDouble();
            if(scores[i] < 0) break;
        }

        calculate(scores);

    }


    public static void calculate(double[] numbers){
        int n = 0;
        double sum = 0;
        for(int i = 0; numbers[i] > 0;n++, i++)
            sum += numbers[i];

        int avarage = ( int) sum / n;

        System.out.println("avarage > " + avarage);

        for(int i = 0; i < n; i++){
            System.out.print(numbers[i] +" is ");
            if(numbers[i] > avarage)
                System.out.print("above avarage ");
            else if(numbers[i] < avarage)
                System.out.print("below avarage");
            else 
                System.out.print("equal to the avarage");
                System.out.println();
        }

    }
}
