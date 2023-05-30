package Exercises2;
import java.util.Scanner;

public class Exercise2_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double ping = 0.3025;
		System.out.print("Enter a number in square meters: ");
		double squareMeters = input.nextDouble();
	
		double smTp = squareMeters * ping;
		System.out.println(squareMeters + " square meters in ping is " + smTp + " pings");
	}

}
