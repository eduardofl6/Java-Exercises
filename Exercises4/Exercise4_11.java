package Exercises4;
import java.util.Scanner;

public class Exercise4_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter binary digits (0000 to 1111): ");
		String binary =  input.nextLine();
		int decimal = (binary.charAt(3) == '1') ?  1 : 0;
		decimal += (binary.charAt(2) == '1') ?  2 : 0;
		decimal += (binary.charAt(1) == '1') ?  4 : 0;
		decimal += (binary.charAt(0) == '1') ?  8 : 0;
		System.out.print("The decimal value is " + decimal);
	}

}
