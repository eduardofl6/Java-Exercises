package Exercises5;
import java.util.Scanner;

public class Exercise5_21 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Loan Amount: ");
			int amount = input.nextInt();
			
			System.out.print("Number of Years: ");
			int years = input.nextInt();
			
			System.out.print("Interest Rate\t Monthly Payment\t Total Payment\n");
			for(double i = 0.05; i <= 0.101; i += 0.00250)
			{
				
				double mRate = ((i * 100) / 1200);
				
				double mPay = amount *  mRate / (1 - 1 / Math.pow(1+ mRate, years * 12));
				
				double totalPay = mPay * years * 12;
				
				System.out.format("%.3f%%",i * 100.0);
				System.out.format("\t\t %.2f", mPay);
				System.out.format("\t\t %.2f",totalPay);
				System.out.print("\n");
				
			}


		}

}
