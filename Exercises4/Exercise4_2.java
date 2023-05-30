package Exercises4;
import java.util.Scanner;

public class Exercise4_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double earthRadius = 6371.01;
		
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double pointx1 = input.nextDouble();
		double pointy1 = input.nextDouble();
		
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double pointx2 = input.nextDouble();
		double pointy2 = input.nextDouble();
		
		double x1 = Math.toRadians(pointx1);
		double y1 = Math.toRadians(pointy1);
		
		double x2 = Math.toRadians(pointx2);
		double y2 = Math.toRadians(pointy2);
		
		
		double distance = earthRadius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		System.out.print("The distance between the two points is " + distance + " Km");
				
	}

}
