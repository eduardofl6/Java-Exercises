package Exercises4;
import java.util.Scanner;

public class Exercise4_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a hex digit: ");
		String letter = input.nextLine();
		char hex = letter.charAt(0);
		
		String binary = "";
		switch((int)hex) {
		case 'A': binary = "1010"; break;
		case 'B': binary = "1011";break;
		case 'C': binary = "1100";break;
		case 'D': binary = "1101";break;
		case 'E': binary = "1110";break;
		case 'F': binary = "1111";break;
		default:
			System.out.print(hex + " is an invalid input");
			System.exit(1);
		}
	
	System.out.print("The binary value is " + binary);
	}

}
