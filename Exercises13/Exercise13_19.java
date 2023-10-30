package Exercises13;
import java.util.*;

public class Exercise13_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");

        String sNumber = input.next();

        int number = Integer.parseInt(sNumber.replace(".",""));

        int denominator = 1;

        for(int i = 1; i < sNumber.length()-1;i++){
            denominator *= 10;
        }        


        int gcd = (int) RationalBigInt.gcd(number, denominator);

        System.out.print((number/gcd) + "/" + denominator/gcd);
    }
    

}
