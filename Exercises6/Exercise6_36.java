package Exercises6;
import java.util.*;

public class Exercise6_36 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int sides = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.print("The area of the pentagon is " + area(sides,side));

    }

    public static double area(int n, double side){
        double area = 0;

        area = (n * Math.pow(side,2)) / (4 * Math.tan(Math.PI/n));

        return area;
    }

    
}
