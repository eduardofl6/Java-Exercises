package Exercises5;
import java.util.Scanner;

public class Exercise5_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Loan Amount: ");
		int amount = input.nextInt();
		
		System.out.print("Number of Years:  ");
		int years = input.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double yrate = input.nextDouble();
		
		double mrate = yrate / 1200;
		
		double mpay = amount * mrate / ( 1 - 1 / Math.pow(1 + mrate, years * 12));
		
		double totalpay = mpay * years * 12;
		
		double interest = 0;
		double balance = amount;
		double principal = 0;
		
		System.out.format("\nMonthly Payment: %.2f \nTotal Payment: %.2f\n\n", mpay,totalpay);
		
		System.out.print("Payment#\t\tInterest\t\tPrincipal\t\tBalance\n");
		for(int i = 1; i<= years * 12; i++) {
			interest = mrate * balance;
			principal = mpay - interest;
			balance = balance - principal;
			System.out.format("%d\t\t\t%.2f\t\t\t%.2f\t\t\t%.2f\n", i, interest, principal, balance );
			}
			
	}

}
