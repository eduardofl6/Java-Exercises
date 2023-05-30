package Exercises2;
import java.util.Scanner;

public class Exercise2_1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double miles = input.nextDouble();
	double kilometers = 1.6;
	double totalDistance = miles * kilometers;
	System.out.println(miles + "miles is " + totalDistance + " kilometers");
	}

}
