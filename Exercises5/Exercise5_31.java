package Exercises5;

import java.util.Scanner;

public class Exercise5_31 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the initial deposit amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual percentage yield: ");
		double annualrate = input.nextDouble();
		System.out.print("Enter maturity period (number of months): ");
		int months = input.nextInt();
		
		System.out.println("Month\t\tCD Value");
		for(int i = 0; i < months; i++) {
			amount = amount + ((amount * annualrate) / 1200);
			
		System.out.format("%d\t\t%.2f\n", i+1,amount);
		}
		
		
	}

}
