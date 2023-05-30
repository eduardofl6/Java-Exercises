package Exercises3;
import java.util.Scanner;

public class Exercise3_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchange = input.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int convertion = input.nextInt();
		
		if(convertion == 1 || convertion == 0) {
		
			System.out.print("Enter the "+ ((convertion == 0) ? "dollars" : "RMB"  ) + " amount: ");
			double amount = input.nextDouble();
		
				double lastAmount = 0;
			if(convertion == 0) {
				lastAmount = amount * exchange;
			}else
				lastAmount = amount / exchange;
		
			System.out.print(((convertion == 0) ? "$" + amount : amount + " yuan") + " is " + ((convertion != 0) ? "$" + lastAmount : lastAmount + " yuan"));
		}
		else
			System.out.print("Incorrect input");
	}

}
