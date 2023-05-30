package Exercises5;
import java.util.Scanner;

public class Exercise5_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter amount to save each month: ");
		double amount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double annualrate = input.nextDouble();
		double mrate = annualrate / 100 / 12;
		System.out.print("Number of months ");
		int months = input.nextInt();
		
		
		double total = 0;
		for(int i = 0; i < months; i++) {
			total = (amount + total) * (1 + mrate);
		}
	
		System.out.format("You'll have saved $%.2f ", total);
	}

}
