package Exercises3;
import java.util.Scanner;

public class Exercise3_35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int value = input.nextInt();
		
		System.out.print(value + " is " + ((value % 2 == 0) ? "even" : "odd"));
		System.out.print("\n " + Math.rint(2.5));
	}

}
