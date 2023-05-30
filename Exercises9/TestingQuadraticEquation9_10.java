package Exercises9;
import java.util.*;

public class TestingQuadraticEquation9_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b and c for the quadratic equation: ");
        QuadraticEquation9_10 equation = new QuadraticEquation9_10(input.nextDouble(), input.nextDouble(), input.nextDouble());

        if(equation.getDiscriminant() == 0){
            System.out.println("Root: " + equation.getRoot1());
        }else if(equation.getDiscriminant() < 0)
            System.out.print("The equation has no roots");
        else 
            System.out.print("Root1 : " + equation.getRoot1() + " Root2: " + equation.getRoot2());

    }
}
