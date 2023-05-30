package Exercises5;

public class Exercise5_4 {

	public static void main(String[] args) {
		
		System.out.print("Inches\tCentimetres\n");
		for(int i = 1; i <= 10; i++) {
			System.out.format("%d\t%.2f\n",i,(i * 2.54));
		}
	}

}
