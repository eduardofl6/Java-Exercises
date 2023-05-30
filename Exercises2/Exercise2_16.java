package Exercises2;
import java.util.Scanner;


public class Exercise2_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double sides = input.nextDouble();
		double area = (3 * Math.sqrt(3) / 2 )* Math.pow(sides, 2);
		
		System.out.print("The area of the hexagon is " + area);
	}

}
