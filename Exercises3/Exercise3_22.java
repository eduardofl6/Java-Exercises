package Exercises3;
import java.util.Scanner;

public class Exercise3_22 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a point with two coordinates: ");
			int x = input.nextInt();
			int y = input.nextInt();
	
			//They're 0 because the circle is centered in 0,0
			int x1 = 0;
			int y1 = 0;
					
			System.out.print("Point ("+ x * 1.0 + ", " + y * 1.0 + ") ");
			
			double distance = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
		
			System.out.print("is " + ((distance <= 10) ? "" : "not ") + "in the circle ");
	}

}
