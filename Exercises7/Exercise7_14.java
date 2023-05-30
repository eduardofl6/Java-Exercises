package Exercises7;
import java.util.*;



// Skipped 


public class Exercise7_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] numbers = new int[5];

        System.out.print("Enter 5 integers: ");
        for(int i =0; i < numbers.length;i++){
            numbers[i] = input.nextInt();
        }

        System.out.print(lcm(numbers));

    }

    public static int lcm(int... numbers){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        
        int lcm = 1;
        boolean pass = false;

        for(int i = 0; !isPrimeA(numbers); ){
            if(divisibleArray(numbers, primes[i])){
                // Mat.pow because each time lcm multiplies prime[i], it just multiple once
                lcm *= Math.pow(primes[i],2) ;
                divide(numbers, primes[i]);

            }else
            i++;
            
        }

        return lcm;
    }

    public static boolean isPrimeA(int[] array){
        boolean prime = true;
        for(int i = 0; i < array.length;i++){
            if(!(isPrime(array[i]))){
                    prime = false;
            }
        }
        return prime;
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
        if (number % divisor == 0) { // If true, number is not prime
        return false; // Number is not a prime
        }
        }
       
        return true;
    }

    public static boolean divisibleArray(int[] array, int num){
        boolean divisible = true;
        for(int i = 0; i < array.length;i++){
            if(array[i] % num != 0){
                divisible = false;
            }
        }
    
        return divisible;
    }


    public static int[] divide(int[] numbers, int div){
        for(int i = 0; i < numbers.length;i++){
                numbers[i] /= div;

        }
        return numbers;
    }
}
