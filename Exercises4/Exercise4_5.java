package Exercises4;
import java.util.Scanner;

public class Exercise4_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of sides: ");
		int sides = input.nextInt();
		System.out.print("Enter the side: ");
		double length = input.nextDouble();
		
		double area = (sides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / sides));
		
		System.out.print("The area of the polygon is " + area);
	}

}
