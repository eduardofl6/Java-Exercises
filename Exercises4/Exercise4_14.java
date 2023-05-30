package Exercises4;
import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter grade: ");
		
		String letter = input.nextLine();
		char character = letter.charAt(0);
		
		int note = 0;
		
		if(character >= 'A' && character <= 'F')
		{
			switch((int)character) {
			case 'A': note = 4; break;
			case 'B': note = 3;break;
			case 'C': note = 2;break;
			case 'D': note = 1;break;
			case 'F': note = 0;break;
			}
			System.out.print("The numeric value for grade " + character + " is " + note);
		}
			else
			System.out.print(character + " is an invalid grade");

	}

}
