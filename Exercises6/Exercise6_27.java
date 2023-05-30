package Exercises6;

public class Exercise6_27 {
    
    public static void main(String[] args){

        for(int i = 2, emirp = 0; emirp < 120; i++){
            if(isEmirp(i)){
                emirp++;
                System.out.print(i+ " ");
                if(emirp % 10 == 0){
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

    public static boolean isEmirp(int number){

        if(isPrime(number) && isPrime(reverse(number)) && !isPalindrome(number))
        return true;
        else
        return false;
    }
}
