package Exercises4;
import java.util.Scanner;

public class Exercise4_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		String userInput = input.next();
		char finalInput = userInput.charAt(0);
		
		System.out.format("The ASCII code for character %c is %d",finalInput, (int) finalInput);
	}

}
