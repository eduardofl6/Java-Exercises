package Exercises2;
import java.util.Scanner;

public class Exercise2_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double lengthSides = input.nextDouble();
		
		double area = ((Math.sqrt(3.0) / 4.0) * Math.pow(lengthSides, 2));
		
		double volume = area * lengthSides;
		
		System.out.println("Area : " + area);
		System.out.println("Volume : " + volume);
	}

}
