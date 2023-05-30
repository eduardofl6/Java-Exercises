package Exercises2;
import java.util.Scanner;

public class Exercise2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly saving amoun : ");
		double moneySave = input.nextDouble();
		
		double currentValue = moneySave * (1 + 0.003125);
		currentValue = (moneySave + currentValue) * (1 + 0.003125);
		currentValue = (moneySave + currentValue) * (1 + 0.003125);
		currentValue = (moneySave + currentValue) * (1 + 0.003125);
		currentValue = (moneySave + currentValue) * (1 + 0.003125);
		currentValue = (moneySave + currentValue) * (1 + 0.003125);
		System.out.print("After the six month the value is " + currentValue);
	}

}
