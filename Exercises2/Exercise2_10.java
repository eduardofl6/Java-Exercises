package Exercises2;
import java.util.Scanner;

public class Exercise2_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double mass = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double itemp = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double ftemp = input.nextDouble();
		
		double Q = mass * (ftemp - itemp) * 4148;
		System.out.println("The energy needed is " + Q);
	}

}
