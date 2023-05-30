package Exercises5;
import java.util.Scanner;

public class Exercise5_46 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		
		String inuser = input.nextLine();
		String reverse = "";
		
		for(int i = inuser.length()-1; i >= 0; i-- ) {
			reverse += inuser.charAt(i);
		}
		System.out.print(reverse);
	}

}
