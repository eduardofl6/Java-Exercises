package Exercises5;
import java.util.Scanner;

public class Exercise5_48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String message = input.nextLine();
		
		
		for(int i = 1; i <= message.length() -1; i +=2) {
			if((message.charAt(i) >= 'a' && message.charAt(i) <= 'z') || (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z') )
		System.out.print(message.charAt(i));	
		}
	}

}
