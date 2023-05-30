package Exercises4;

import java.util.Scanner;

public class Exercise4_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		String userInput = input.next();
		int finalInput = userInput.charAt(0);
		
		System.out.format("The ASCII code for character %c is %d", (char) finalInput, finalInput);
	}

}
