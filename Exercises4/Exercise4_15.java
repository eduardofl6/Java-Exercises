package Exercises4;
import java.util.Scanner;

public class Exercise4_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a letter: ");	
		String letter = input.nextLine();
		
		char character = letter.charAt(0);
		
		char digit = Character.toLowerCase(character);

		int number = 0;
		switch((int)digit) {
		case 'a':case 'b':case 'c':
			number = 2; break;
		case 'd':case 'e':case 'f':
			number = 3; break;
		case 'g':case 'h':case 'i':
			number = 4; break;
		case 'j':case 'k':case 'l':
			number = 5; break;
		case 'm':case 'n':case 'o':
			number = 6; break;
		case 'p':case 'q':case 'r':case 's':
			number = 7; break;
		case 't':case 'u':case 'v':
			number = 8; break;
		case 'w':case 'x':case 'y':case 'z':
			number = 9; break;
		default : 
			System.out.print(character + " is an invalid input");
			System.exit(1);
		}
		
		System.out.print("The corresponding number is " + number);
	
	
	}

}
