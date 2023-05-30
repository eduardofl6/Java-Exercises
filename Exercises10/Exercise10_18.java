package Exercises10;

import java.math.BigDecimal;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class Exercise10_18 {
    public static void main(String[] args){
        BigDecimal primes = new BigDecimal(Long.MAX_VALUE);
        boolean isPrime = false;

        for(int i = 0; i < 5; ){

            isPrime = true;
            for(BigDecimal num = new BigDecimal(2); num.compareTo(primes) < 0; num = num.add(BigDecimal.ONE)){
                BigDecimal remainder = (primes.remainder(num));

                if(remainder.compareTo(BigDecimal.ZERO) == 0){
                    isPrime = false;
                }

                
            } 
            if(isPrime == true){
                System.out.println(primes.toString());
                i++;
            }
            primes = primes.add(BigDecimal.ONE);
        }


    }
}
