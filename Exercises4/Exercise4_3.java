package Exercises4;

public class Exercise4_3 {

	public static void main(String[] args) {
		final double earthRadius = 6371.01;
		
		//Orlando (28.5383355, –81.3792365)
		double x1 = 28.5383355;
		double y1 = -81.3792365;
		//Savannah (32.0835407, –81.0998342)
		double x2 = 32.0835407;
		double y2 = -81.0998342;
		//Charlotte (35.2270869, –80.8431267)
		double x3 = 35.2270869;
		double y3 = -80.8431267;
		//Atlanta (33.7489954, –84.3879824)
		double x4 = 33.7489954;
		double y4 = -84.3879824;
		
		//Distance Savannah x Orlando 
		double dis1 = earthRadius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		//Distqance Savannah x Charlotte
		double dis2 = earthRadius * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));
		
		//Distance Charlotte x Orlando
		double dis3 = earthRadius * Math.acos(Math.sin(x1) * Math.sin(x3) + Math.cos(x1) * Math.cos(x3) * Math.cos(y1 - y3));
		
		//Distance Atlanta x Charlotte
		double dis4 = earthRadius * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));
		//Distance Atlanta x Orlando
		double dis5 = earthRadius * Math.acos(Math.sin(x1) * Math.sin(x4) + Math.cos(x1) * Math.cos(x4) * Math.cos(y1 - y4));
		
		double s = (dis1 + dis2 + dis3) / 2.0;
		double area = Math.pow((s * (s - dis1) * (s - dis2) * (s - dis3)),0.5);
		
		double s2 = (dis3 + dis4 + dis5) / 2.0;
		double area2 = Math.pow((s2 * (s2 - dis3) * (s2 - dis4) * (s2 - dis5)),0.5);
		
		double finalArea = area + area2;
		System.out.print(finalArea);
	}

}
