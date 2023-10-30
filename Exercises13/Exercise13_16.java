package Exercises13;
import Exercises13.*;

public class Exercise13_16 {
    public static void main(String [] args)throws Exception{
         if(args[0].split(" ").length != 3){
            throw new Exception("Insufficient amount of arguments");
        }

        String[] digits = args[0].split(" ");
        String[][] digits2 = new String[2][2];


        digits2[0] = digits[0].split("/");
        digits2[1] = digits[2].split("/");
        

        
        long num1 = (long)Integer.parseInt(digits2[0][0]);
        long num2 = (long)Integer.parseInt(digits2[0][1]);

        Rational val1 = new Rational(num1, num2);

        long num3 = (long)Integer.parseInt(digits2[1][0]);
        long num4 = (long)Integer.parseInt(digits2[1][1]);

        Rational val2 = new Rational(num3, num4);
            

        switch(digits[1].charAt(0)){
            case  '+' :
            System.out.print(args[0] + " = " + val1.add(val2).toString());
                break;
            case  '-' :
            System.out.print(args[0] + " = " + val1.subtract(val2).toString());
                break;
            case  '*' :
            System.out.print(args[0] + " = " + val1.multiply(val2).toString());
                break;
            case  '/' :
            System.out.print(args[0] + " = " + val1.divide(val2).toString());
                break;   
            default:
                break;
    }
}}
