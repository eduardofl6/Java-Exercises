package Exercises5;

public class Exercise5_5 {

	public static void main(String[] args) {
		
		System.out.print("Celsius Fahrenheit | Fahrenheit Celsius\n");
		
		for(double i = 0,f = 20; i <= 100; i += 2, f +=5) {
		System.out.format("%d	%.3f\t   |	%d	%.3f\n",(int)i, (i * 9/5 + 32), (int)f, (f - 32) * 5/9);
		}
	}

}
