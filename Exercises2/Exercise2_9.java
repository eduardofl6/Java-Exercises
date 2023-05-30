package Exercises2;
import java.util.Scanner;

public class Exercise2_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter v0, v1, and t: ");
		
		double vi = input.nextDouble();
		double vo = input.nextDouble();
		double t = input.nextDouble();
		
		double avarage = (vo - vi) / t;
		
		System.out.print("The average acceleration is " + avarage);
	}

}
