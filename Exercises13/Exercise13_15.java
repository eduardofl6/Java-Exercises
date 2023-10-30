package Exercises13;
import java.util.*;

public class Exercise13_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first rational number: ");
        RationalBigInt var1 = new RationalBigInt(input.nextInt(),input.nextInt());
        System.out.print("Enter the second rational number: ");
        RationalBigInt var2 = new RationalBigInt(input.nextInt(),input.nextInt());
    
        System.out.println(var1.toString() + " + " + var2.toString() + " = " + var1.add(var2));
        System.out.println(var1.toString() + " + " + var2.toString() + " = " + var1.subtract(var2));
        System.out.println(var1.toString() + " + " + var2.toString() + " = " + var1.multiply(var2));
        System.out.println(var1.toString() + " + " + var2.toString() + " = " + var1.divide(var2));
        System.out.print(var2.toString() + " is "  + var2.doubleValue());
    }
}
