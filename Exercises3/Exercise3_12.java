package Exercises3;
import java.util.Scanner;

public class Exercise3_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three-digit integer: ");
		int total = input.nextInt();
		int n1 = total / 100;
		int n2 = total / 10 % 10;
		int n3 = total % 10;
	System.out.print(total + " is " + ((n1 == n3) ? "a palindrome " : "not a palindrome"));
	}

}
