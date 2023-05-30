package Exercises2;
import java.util.Scanner;

public class Exercise2_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double meters = input.nextDouble();
		double feet = 3.2786;
		
		double mtf = meters*feet;
		System.out.println(meters+ " meters to feet is "+mtf + " feet");
	}

}
