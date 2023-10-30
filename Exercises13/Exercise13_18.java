package Exercises13;

import java.math.BigDecimal;

public class Exercise13_18 {
    public static void main(String[] args){
         double sum = 0;
        
        for(int i = 2; i <= 100;i++){
            sum += ((new RationalBigInt(i-1, i).doubleValue()));
            
        }

        System.out.println(sum);
    }
}
