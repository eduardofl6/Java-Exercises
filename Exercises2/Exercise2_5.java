package Exercises2;
import java.util.Scanner;

public class Exercise2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		int subtotal = input.nextInt();
		int gratuityRate = input.nextInt();
	
		double gratuity = (gratuityRate / 100.0) * subtotal;
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is $" + gratuity +" and total is $" + total);
		}

}
