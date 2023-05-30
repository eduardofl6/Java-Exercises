package Exercises9;
import java.util.*;

public class TestingLinearEquation9_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e and f: ");

        LinearEquation equation = new LinearEquation(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());

        if(!equation.isSolvable()){
            System.out.print("The equation has no solution");
        }else{
            System.out.print("X: " + equation.getX() + " Y: "  + equation.getY() );
        }

    }    
}
