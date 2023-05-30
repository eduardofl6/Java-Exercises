package Exercises4;
import java.util.Scanner;

public class Exercise4_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String user = input.nextLine();
		
		System.out.print("The string \"" + user +  "\" has " + user.length() + " characters and it's last character is '" + user.charAt(user.length()-1)+"'");
	}

}
