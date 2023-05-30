package Exercises5;

public class Exercise5_14 {

	public static void main(String[] args) {
int number1 = 24;
int number2 = 16;
int min = Math.min(number1, number2);
int gcd = 0;

	while(min > 0) {
		if(number1 % min == 0 && number2 % min == 0) {
			gcd = min;
			break;
		}
		min--;
		}
	System.out.print("GCD is " + gcd);
	}
}
