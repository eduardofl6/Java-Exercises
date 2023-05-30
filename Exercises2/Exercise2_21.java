package Exercises2;
import java.util.Scanner;

public class Exercise2_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		double interestRate =  input.nextDouble() /1200;
		
		System.out.print("Enter the number of years: ");
		int numberYears = input.nextInt();
		
		double futureValue = investmentAmount * Math.pow(1 + interestRate, numberYears * 12);
		System.out.print("Future value is " + futureValue);
	}

}
