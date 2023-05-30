package Exercises6;

import java.util.PrimitiveIterator;

public class Exercise6_26 {
    

    public static void main(String[] args){



        for(int i = 2 , palindromic = 0; palindromic < 120; i++){
            if(isPalindrome(i) && isPrime(i)){
                palindromic++;
                System.out.print(i +" ");
                if(palindromic % 10 == 0){
                    System.out.println();
                }
            }
          
        }
    }

    public static int reverse(int number) {
		int reverse = 0;
		while(number > 0) {
			reverse = 10 * reverse + (number % 10);
			number /= 10;
		}
		
		return reverse;
		
	}
	// Return true if number is a palindrome
	public static boolean isPalindrome(int number) {
		
		if(number == reverse(number))
		return true;
		else
			return false;
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
