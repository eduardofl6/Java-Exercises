package Exercises6;

public class Exercise6_2 {

	public static void main(String[] args) {
		int i = 234;
		System.out.print("Sum of all digits(" +  i + "): " + sumDigits(i) );
	}

	static public int sumDigits(int n) {
		int sum = 0;
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	
	
}
