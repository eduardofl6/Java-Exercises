package Exercises6;
import java.util.*;

public class Exercise6_19 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
    
        if(isValid(side1, side2, side3)){
            System.out.print("The area is " + area(side1, side2, side3));
        }else
            System.out.print("Wrong input");
    
    }

    public static double area(
double side1, double side2, double side3){


    double s = (side1 + side2 + side3) / 2.0;
		
    double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)),0.5);

    return area;
}


    public static boolean isValid(
double side1, double side2, double side3){

    double sum1 = side1 + side2;
    double sum2 = side3 + side2;
    double sum3 = side1 + side3;

    if(sum1 >= side3 && sum2 > side1 && sum3 > side2){
        return true;
    }else
        return false;
}

}
