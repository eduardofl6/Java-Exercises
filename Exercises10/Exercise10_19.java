package Exercises10;

import java.math.BigDecimal;

public class Exercise10_19 {
    public static void main(String[] args){

        for(int i = 2; i <= 100; i++){

            if(isPrime(new BigDecimal(i))){
                BigDecimal value = new BigDecimal(Math.pow(2,i) - 1);
                if(isPrime(value)){
                    System.out.format("%d\t%s\n",i,value.toString());
                }
            }


        }


    }

    public static boolean isPrime(BigDecimal value){

        for(BigDecimal val = new BigDecimal(3); val.compareTo(value) < 0; val = val.add(BigDecimal.ONE)){
                if(value.remainder(val).compareTo(BigDecimal.ZERO) == 0)
                return false;
        }

        return true;   
    }


}
