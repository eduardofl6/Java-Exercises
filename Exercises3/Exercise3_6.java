package Exercises3;
import java.util.Scanner;

public class Exercise3_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter weight in pounds: ");
		int weight = input.nextInt();

		System.out.print("Enter height in feet: ");
		int feet = input.nextInt();
		
		System.out.print("Enter inches: ");
		int inches = input.nextInt();
	
		final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
		final double METERS_PER_INCH = 0.0254; // Constant
		final double METER_PER_FEET = 0.3048;
		
		double heightMeter = (feet * METER_PER_FEET) + (inches * METERS_PER_INCH);
		
		double weightKilo = weight * KILOGRAMS_PER_POUND;
		
		
		double bmi = weightKilo / Math.pow(heightMeter, 2);
	System.out.print("BMI is " + bmi + " ");
	
	if(bmi < 18.5)
		System.out.print("Underweight");
	else if(bmi < 25)
		System.out.print("Normal");
	else if(bmi < 30)
		System.out.print("Overweight");
	else 
		System.out.print("Obese");
	}

}
