package Exercises3;
import java.util.Scanner;

public class Exercise3_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b, c " );
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = Math.pow((Math.pow(b,2) + (-4 * a * c)),0.5);
		
		double r1 = 0, r2 = 0;

		if(discriminant > 0)
			{
			r1 = ((-b) + discriminant) / (2 * a);
			r2 = ((-b) - discriminant) / (2 * a);
			System.out.print("The equation has two roots " + r1 + " and " + r2);
			}
		else if (discriminant == 0)
			{			
			r1 = ((-b) + discriminant) / (2 * a);
			System.out.print("The equation has one root " + r1 );
			}
		else 
			System.out.print("The equation has no roots");
			
		
	}

}
