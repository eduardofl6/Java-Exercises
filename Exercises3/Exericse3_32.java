package Exercises3;
import java.util.Scanner;

public class Exericse3_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter three points for p0, p1, and p2: ");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
	
		
		double sides = (x1 - x)*(y2 - y) - (x2 - x)*(y1 - y);
		
		if(sides > 0)
			System.out.print("p2 is on the left side of the line");
		else if(sides < 0)
			System.out.print("p2 is on the right side of the line");
		else
			System.out.print("p2 is on the same line");
			
	}

}
