package Exercises3;
import java.util.Scanner;

public class Exercise3_27 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a point’s x- and y-coordinates: ");
			double x = input.nextDouble();
			double y = input.nextDouble();
			
			if(x < 0 || y < 0 || x > 200 || y > ( 100 - x/2))
				System.out.print("The point is not the triangle");
			else if (x <= 200 && y <(100 - x/2))
				System.out.print("The point is in the triangle");
	}

}
