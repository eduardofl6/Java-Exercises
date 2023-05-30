package Exercises4;

public class Exercise4_6 {

	public static void main(String[] args) {
		int angle1 = (int)(Math.random() * (2*180));
		int angle2 = (int)(Math.random() * (2*180));
		int angle3 = (int)(Math.random() * (2*180));
		
		int radius = 40;
		
		double x1 = radius * Math.cos(angle1);
		double y1 = radius * Math.sin(angle1);
		
		double x2 = radius * Math.cos(angle2);
		double y2 = radius * Math.sin(angle2);
		
		double x3 = radius * Math.cos(angle3);
		double y3 = radius * Math.sin(angle3);
		
		System.out.println(x1 + " " + y1 + " " + angle1);
		System.out.println(x2 + " " + y2 + " " + angle2);
		System.out.println(x3 + " " + y3 + " " + angle3);
	}

}
