package Exercises2;
import java.util.Scanner;

public class Exercise2_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your weight in KG : ");
		double weight = input.nextDouble();
		
		System.out.print("Enter your height in meters :");
		double height = input.nextDouble();
		
		double imc = weight / Math.pow(height, 2);
		System.out.print("Your IMC is " + imc); 
		}

}
