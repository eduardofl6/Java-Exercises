package Exercises5;

public class Exercise5_24 {

	public static void main(String[] args) {
	double result = 0;
		for(double i = 1.0; i <= 97; i += 2) {
			System.out.format("(%.0f/%.0f)\n", i, i+2);			
			result += (i / (i + 2));
		}
		
		System.out.print("Result: "+result);
				
	}

}
