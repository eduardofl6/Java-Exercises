package Exercises4;
import java.util.Scanner;

public class Exercise4_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee’s name: ");
		String name = input.nextLine();

		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double payrate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalTax = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();
		
		double grosspay = hours * payrate;
		
		double statePay = grosspay * stateTax;
		double federalPay = grosspay * federalTax;
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours workerd: " + hours);
		System.out.println("Pay rate: " + payrate);
		System.out.println("Gross pay: " + ( hours  * payrate));
		System.out.format("Deductions: \n Federal Withholding (%.2f%%): $%.2f \n State Withholding (%.2f%%): $%.2f \n Total Deduction: $%.2f \n Net Pay: $%.2f",
				federalTax * 100, federalPay, stateTax * 100, statePay , statePay + federalPay ,grosspay - statePay - federalPay);
	
	}

}
