package Exercises3;
import java.util.Scanner;

public class Exercise3_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount in double: ");
		double inputValue = input.nextDouble();
	
		int remainingAmount = (int)(inputValue * 100);
		
		int dollars = remainingAmount / 100;
		remainingAmount %= 100;
		
		int quarters = remainingAmount / 25;
		remainingAmount %= 25;
		
		int dines = remainingAmount / 10;
		remainingAmount %= 10;
		
		int nickels = remainingAmount / 5;
		remainingAmount %= 5;
		
		int pennies = remainingAmount;
		
		System.out.println("Your amount of " + inputValue + " consists of");
		System.out.println(" " + dollars + ((dollars > 1) ? " Dollars" : " Dollar"));
		System.out.println(" " + quarters + ((quarters > 1) ? " Quarters" : " Quarter"));
		System.out.println(" " + dines + ((dines > 1) ? " Dines" : " Dine"));
		System.out.println(" " + nickels + ((nickels > 1) ? " Nickels" : " Nickel"));
		System.out.println(" " + pennies + ((pennies > 1) ? " Pennies" : " Pennie"));
	}

}
