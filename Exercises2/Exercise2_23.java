package Exercises2;
import java.util.Scanner;

public class Exercise2_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance $");
		double distance = input.nextDouble();
		
		System.out.print("Enter the milles per gallon $");
		double millesGallon = input.nextDouble();
	
		System.out.print("Enter the price per gallon $");
		double gallonPrice = input.nextDouble();
	
		double totalCost = (distance / millesGallon) * gallonPrice;
		System.out.print("The cost of driving is $" + totalCost);
	}

}
