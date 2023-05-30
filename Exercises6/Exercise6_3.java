package Exercises6;

import java.util.Scanner;

public class Exercise6_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		System.out.print(i + " is " + ((isPalindrome(i)) ? "" : " is not") + "a palindrome number");
		
	}

	
	// Return the reversal of an integer, e.g., reverse(456) returns 654
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
	
}
