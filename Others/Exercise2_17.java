import java.util.Scanner;

public class Exercise2_17 {

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
		System.out.println(" " + dollars + " Dollars");
		System.out.println(" " + quarters + " Quarters");
		System.out.println(" " + dines + " Dines");
		System.out.println(" " + nickels + " Nickels");
		System.out.println(" " + pennies + " Pennies");
	}

}
