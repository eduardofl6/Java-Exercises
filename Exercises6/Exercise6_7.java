package Exercises6;
import java.util.Scanner;

public class Exercise6_7 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("The amount invested: ");
	int amount = input.nextInt();
	System.out.print("Annual interest rate: ");
	double interestRate =  input.nextDouble() / 1200;
	double monthlyInterestRate = interestRate / 12;

	System.out.print("Year \t Future Value\n");
	for(int i = 1 ; i <= 30; i++){

	System.out.format("%d \t %.2f\n",i, futureInvestmentValue(amount, monthlyInterestRate, i));
	
	input.close();
	}

}
	
	public static double futureInvestmentValue(
			double investmentAmount, double monthlyInterestRate,int years){
				double interestRate = monthlyInterestRate * 12;
				double futureValue = investmentAmount * Math.pow(1 + interestRate, years * 12);
				return futureValue;
			}

}
