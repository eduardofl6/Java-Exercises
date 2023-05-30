package Exercises5;

public class Exercise5_35 {

	public static void main(String[] args) {
			
		double sum = 0;
		for(int i = 1; i < 1000;) {
			sum += 1.0 / (Math.sqrt(i) + Math.sqrt(++i));
			
			}
	System.out.print("Sum is: " + sum);
	}

}
