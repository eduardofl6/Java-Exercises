package Exercises4;
import java.util.Scanner;

public class Exercise4_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the bounding circle: ");
		double radius = input.nextDouble();
		
		double angle = 72;
		int  i = 1;
		
		
		
		double x2 = radius * Math.cos(Math.toRadians(angle * i));
		double y2 = radius * Math.sin(Math.toRadians(angle * i++));
			
		double x1 = radius * Math.cos(Math.toRadians(0));
		double y1 = radius * Math.sin(0);
		
		double x5 = radius * Math.cos(Math.toRadians(angle * i));
		double y5 = radius * Math.sin(Math.toRadians(angle * i++));
		
		double x4 = radius * Math.cos(Math.toRadians(angle * i));
		double y4 = radius * Math.sin(Math.toRadians(angle * i++));
		
		double x3 = radius * Math.cos(Math.toRadians(angle * i));
		double y3 = radius * Math.sin(Math.toRadians(angle * i++));

		
		System.out.format("The coordinates of five points on the pentagon are \n(%.2f,%.2f)\n(%.2f,%.2f)\n(%.2f,%.2f)\n(%.2f,%.2f)\n(%.2f,%.2f)"
			, y2,x2 ,y1,x1 ,y3,x3 ,y4,x4 ,y5,x5);

	}

}
