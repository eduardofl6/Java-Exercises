package Exercises13;
import java.util.*;

public class Exercise13_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a, b, c: ");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        Rational h = new Rational((b * (-1)), (2 * a));
        Rational k = new Rational( (long) ((4 * a * c ) - Math.pow(b, 2)), (long)(4 * a));

        System.out.print("h is " + h.toString() + " k is " + k.toString());
    }
}
