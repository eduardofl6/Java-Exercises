package Exercises6;
import java.util.*;

public class Exercise6_35 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.print("The area of the pentagon is " + area(side));

    }

    public static double area(double side){
        double area = 0;

        area = (5 * Math.pow(side,2)) / (4 * Math.tan(Math.PI/5));

        return area;
    }
}
