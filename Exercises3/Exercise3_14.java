package Exercises3;
import java.util.Scanner;

public class Exercise3_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Coin flipped, make a guess (1 or 0): ");
		int guess = input.nextInt();
		
		int result = (int)(Math.random() * 100 % 2);
		
		System.out.print("Your guess is " + ((result == guess) ? "correct!" : "wrong...") + result);
	}

}
