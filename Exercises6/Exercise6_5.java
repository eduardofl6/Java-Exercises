package Exercises6;
import java.util.Scanner;

public class Exercise6_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		displaySortedNumbers(a,b,c);
	}
	public static void displaySortedNumbers(
			double num1, double num2, double num3) {
		
		double b1 = 0, b2 = 0;
		
		if(num1 < num2 && num1 < num3) {
			System.out.print(num1);
			b1 = num2;
			b2 = num3;
		}
		if(num2 < num3 && num2 < num1) {
			System.out.print(num2);
			b1 = num3;
			b2 = num1;
		}
		if(num3 < num1 && num3 < num2) {
			System.out.print(num3);
			b1 = num1;
			b2 = num2;
		}
		if(b1 < b2)
			System.out.print(" " + b1 + " " + b2);
		else
			System.out.print(" " + b2 + " " + b1);

	}
}
