package Exercises7;
import java.util.*;

public class Exercise7_8 {

    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        double[] values = new double[10];
        for(int i = 0; i < values.length;i++){
            values[i] = input.nextDouble();
        }

        System.out.print(average(values));

    } 

    public static int average(int[] array){

        return 1;
    }
    public static double average(double[] array){
        double sum = 0;
        for(int i =0; i < array.length;i++){
        sum +=  array[i];            
        }
        double avarage = sum / array.length;

        return avarage;
    }

}
