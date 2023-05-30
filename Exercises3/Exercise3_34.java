package Exercises3;
import java.util.Scanner;

public class Exercise3_34 {

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
		
		if((x2 > x1 && x2 > x || x2 < x1 && x2 < x || y2 < y1 && y2 < y ||y2 > y1 && y2 > y) || sides != 0)
			System.out.print("(" + x2 + ","+  y2 +") is not on the line segment from ("+ x +","+ y +") to ("+ x1 +"," + y1 + ")");
		else
			System.out.print("(" + x2 + ","+  y2 +") is on the line segment from ("+ x +","+ y +") to ("+ x1 +"," + y1 + ")");
		
	}

}
