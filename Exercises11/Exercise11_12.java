package Exercises11;
import java.util.*;

public class Exercise11_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter five doubles: ");
        ArrayList<Double> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            list.add(input.nextDouble());    
        }

        double sum = sum(list);

        System.out.print("The sum of the numbers is: " + sum);
    }

    public static double sum(ArrayList<Double> list){

        Double value = 0.0;

        for(int i = 0; i < list.size();i++){
            value = value.sum(value, list.get(i));
        }

        return value;
    }
}
