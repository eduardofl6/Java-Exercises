package Exercises3;

import java.util.Scanner;

public class Exercise3_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter r1’s center x-, y-coordinates, width, and height: ");
		double x1 = input.nextDouble();		
		double y1 = input.nextDouble();		
		double weight1 = input.nextDouble();		
		double height1 = input.nextDouble();		
		
		System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
		double x2 = input.nextDouble();		
		double y2 = input.nextDouble();		
		double weight2 = input.nextDouble();		
		double height2 = input.nextDouble();		
		
		double w1 = weight1 / 2;
		double w2 = weight2 / 2;
		
		double h1 = height1 / 2;
		double h2 = height2 / 2;
		
		// Case right & Upper
			if((x1 + w1 > x2 - w2) && (x1 + w1 < x2 + w2))
				System.out.print("r2 overlaps r1");
			else if( ((y1 + h1 > y2 - h2) && (y1 + h1 < y2 + h2)))
				System.out.print("r2 overlaps r1");
		// Case Left & Upper
			else if( (x1 - w1 < x2 + 2) && (x1 - w1 > x2 - w2) )
				System.out.print("r2 overlaps r1");
			else if((y1 - h1 < y2 + h2) && (y1 - h1 > y2 + h2))
				System.out.print("r2 overlaps r1");
			else if(((x2 + w2 < x1 + w1) && ( x2 - w2 > x1 - w1)) && ((y1 + h1 > y2 + h2) && (y1 - h1 > y2 - h2)))
				System.out.print("r2 inside r1");
			else 
				System.out.print("r2 does not overlap r1");
	}

}
