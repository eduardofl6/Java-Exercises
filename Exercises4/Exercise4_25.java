package Exercises4;

public class Exercise4_25 {

	public static void main(String[] args) {
		int l1 = (int)(Math.random() * ('Z' - 'A')) + 'A';
		int l2 = (int)(Math.random() * ('Z' - 'A')) + 'A';
		int l3 = (int)(Math.random() * ('Z' - 'A')) + 'A';
		
		int d1 = (int)(Math.random() * 10);
		int d2 = (int)(Math.random() * 10);
		int d3 = (int)(Math.random() * 10);
		int d4 = (int)(Math.random() * 10);
		
		String plate = (char)l1 + "" + (char)l2 + (char)l3 + "-" + d1 + d2 + d3 + d4;
		
		System.out.print(plate);
	}

}
