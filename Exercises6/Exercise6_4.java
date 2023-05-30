package Exercises6;
import java.util.Scanner;

public class Exercise6_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int in = input.nextInt();
		
		
		reverse(in);
		reverse2(in);
	}
	// 2 ways of solving the same problem, one uses more calculations and other uses more functions
	public static void reverse(int number) {
		int reverse = 0;
		while(number > 0) {
			reverse = 10 * reverse + (number % 10);
			number /= 10;
		}
		System.out.println(reverse);
	}
	
	public static void reverse2(int number) {
		while(number > 0) {
			System.out.print(number % 10);
			number /= 10;
		}
	}
}
