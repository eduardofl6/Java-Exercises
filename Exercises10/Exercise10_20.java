package Exercises10;
import java.math.*;

public class Exercise10_20 {
    public static void main(String[] args){
        BigDecimal e = new BigDecimal(1);
        
        

        for(int i = 1; i <= 100; i++){
            e = e.add((BigDecimal.ONE).divide(factorial(new BigDecimal(i)),25,BigDecimal.ROUND_UP));
        }

        System.out.print(e.toString());
    }

    public static BigDecimal factorial(BigDecimal n){
        BigDecimal answer = new BigDecimal(1);

        for(BigDecimal value = new BigDecimal(1); value.compareTo(n) <= 0; value = value.add(BigDecimal.ONE))
        answer = answer.multiply(value);

        return answer;

    }


}
