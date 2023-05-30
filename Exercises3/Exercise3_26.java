package Exercises3;
import java.util.Scanner;

public class Exercise3_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a integer: ");
		
		int number = input.nextInt();
		
			System.out.println("Is " + number + " divisable by 4 and 5? " + ((number % 4 == 0 && number % 5 == 0) ? "true" : "false"));
			System.out.println("Is " + number + " divisable by 4 or 5? " + ((number % 4 == 0 || number % 5 == 0) ? "true" : "false"));
			System.out.println("Is " + number + " divisable by 4 or 5 but not for both? " + ((number % 4 == 0 ^ number % 5 == 0) ? "true" : "false"));
	}

}
