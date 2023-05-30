package Exercises5;

public class Exercise5_23 {

	public static void main(String[] args) {
		double result = 0;
		for(int i = 1; i <= 50000;) {
			result += (1.0/i++);
		}
		System.out.print("Result:  " + result + "\n");
	
		double result1 = 0;
		for(int n = 50000; n >= 1;)
				result1 += (1.0/n--);
		System.out.print("Result1: " + result1 + "\n");
		if(result > result1)
			System.out.print("Result is bigger than Result1");
		else if(result1 > result)
			System.out.print("Result1 is bigger than Result");
		else
			System.out.print("They are both the same");


	}
}
