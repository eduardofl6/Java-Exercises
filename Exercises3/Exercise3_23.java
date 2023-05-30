package Exercises3;
import java.util.Scanner;

public class Exercise3_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		int x = input.nextInt();
		int y = input.nextInt();
	
		int x1 = 1;
		int y1 = 1;
		
		System.out.print("Point ("+ x * 1.0 + ", " + y * 1.0 + ") ");
		
		if((x <= x1 + 5 && x >= x1 - 5) && (y <= y1 + 2 && y >= y1 - 2))
				System.out.print("is in the rectangle");
		else
				System.out.print("is not the rectangle");
			
	}

}
