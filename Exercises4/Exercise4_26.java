package Exercises4;

import java.util.Scanner;

public class Exercise4_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount in double: ");
		String inputvalue = input.nextLine();
	
		String dollars = inputvalue.substring(0, inputvalue.indexOf('.'));
		int dollar = 1;
		
		
		System.out.println("Your amount of " + inputvalue + " consists of");

	}

}
