package Exercises10;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercise10_17 {
    public static void main(String[] args){
        BigDecimal decimal = new BigDecimal(Long.MAX_VALUE);
        long sqr = (long) Math.sqrt(Long.MAX_VALUE);
        BigDecimal calculate = new BigDecimal(sqr);
        calculate.add(BigDecimal.ONE);

        for(int i = 0; i < 10;i++){
                
            decimal = calculate.multiply(calculate); 
            System.out.println(decimal.toString() + " comes from sqr: " + calculate.toString());
           calculate = calculate.add(BigDecimal.ONE);
                //If you're going to use add to alterate the value of a variable, you have to define it new value to the variable
        }

    } 
}
