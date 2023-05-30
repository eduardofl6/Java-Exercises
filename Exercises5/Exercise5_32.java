package Exercises5;
import java.util.Scanner;

public class Exercise5_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two-digit): ");
		int guess = input.nextInt();
		
		int guess1 = guess /10;
		int guess2 = guess %10;
		
		int digit1 = (int)(Math.random() * 10);
		int digit2 = (int)(Math.random() * 10);
		
		while(digit1 == digit2) {
			digit2 = (int)(Math.random() * 10);
		}
		if(digit1 == guess1 && digit2 == guess2)
			System.out.println("Exact match: you win $10,000");
		else if(digit2 == guess1 && digit1 == guess2)
			System.out.println("Match all digits: you win $3,000");
		else if(digit1 == guess1 || digit1 == guess2
				|| digit2 == guess1 || digit2 == guess2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");
		System.out.print("Result is: " + digit1 + "" + digit2);

	}

}
