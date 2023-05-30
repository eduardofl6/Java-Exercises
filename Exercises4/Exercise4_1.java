package Exercises4;
import java.util.Scanner;


public class Exercise4_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length from the center to a vertex: ");
		double lcv = input.nextDouble();
		
		double side = 2 * lcv  * Math.sin(Math.PI /  5);
		
		double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
		
		System.out.print("The area of the pentagon is " + area);
		
	}

}
