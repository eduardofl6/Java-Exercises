package Exercises4;
import java.util.Scanner;

public class Exercise4_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		
		String letter = input.nextLine();
		char character = letter.charAt(0);
		char hex = Character.toLowerCase(character);
		
		if(hex == 'a' || hex == 'e' || hex == 'i' || hex == 'o' || hex == 'u')
				System.out.print(character + " is a vowel");
		else if(hex >= 'a' && hex <= 'z')
			System.out.print(character + " is a consonant");
		else
			System.out.print(character + " is an invalid input");
			
		
				
		
		
	}

}
