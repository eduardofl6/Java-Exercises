package Exercises5;

public class Exercise5_3 {

	public static void main(String[] args) {

		System.out.print("Celsius	Fahrenheit\n");
		
		for(double i = 0; i <= 100; i += 2) {
			System.out.format("%.1f\t%.1f\n", i, (i * 9/5 + 32));
		}
		
		
	}

}
