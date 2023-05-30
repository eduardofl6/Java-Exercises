package Exercises7;

public class Exercise7_6 {
 
    public static void main(String[] args){
        boolean[] sieve = new boolean[50];

        for(int i = 0; i < sieve.length;i++){
            sieve[i] = true;
        }


        primes(sieve);

    }

    public static void primes(boolean[] sieves){

        for(int i = 2; i < sieves.length;i++){
            if(!isPrime(i)){
                sieves[i] = false;
            }
        }
        for(int i = 2; i < sieves.length;i++){
            if(sieves[i] == true)
                System.out.print(i + " ");
        }

        

 
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
        if (number % divisor == 0) { // If true, number is not prime
        return false; // Number is not a prime
        }
        }
       
        return true;
    }
}
