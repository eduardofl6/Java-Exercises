package Exercises10;

import java.math.BigInteger;

public class Exercise10_16 {
    public static void main(String[] args){
        BigInteger myInt = new BigInteger("10000000000000000000000000000000000000000000000000");
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");


        for(int i = 0,v = 0; i < 10;){
            if(myInt.remainder(two).equals(BigInteger.ZERO) || (myInt.remainder(three)).equals(BigInteger.ZERO)  ){
               System.out.println(i + ": " + myInt.toString());
                i++;

            }
            
            myInt = myInt.add(BigInteger.ONE);
        }


    }
}
