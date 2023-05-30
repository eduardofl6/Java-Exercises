package Exercises3;
import java.util.Scanner;

public class Exercise3_19 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter three sides of a triangle to calculate the perimeter: ");
			
			int p = input.nextInt();
			int p1 = input.nextInt();
			int p2 = input.nextInt();
	
			int perimeter = p + p1 + p2;
	
			if(p1 + p2 > p && p2 + p > p1 && p1 + p > p2)
					System.out.print("The perimeter of the triangle is: " + perimeter );
			else 
					System.out.print("The perimiter is invalid");
	}

}
