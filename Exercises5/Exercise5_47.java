package Exercises5;
import java.util.Scanner;

public class Exercise5_47 {

	public static void main(String[] args) {
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		Scanner input = new Scanner(System.in);
		
		String enter = input.nextLine();

		
		if(enter.length() == 12) {
			
		
		int sum = 0;

		for(int i = 0; i < 11;) {
			sum += (enter.charAt(i++) - '0');
			sum += 3 * (enter.charAt(i++) - '0');
		}
		
		sum = 10 - sum % 10;
		
		//978013213080
		
		System.out.print("The ISBN-13 number is "  + enter+((sum == 10) ? 0 : sum));
		}else
			System.out.print(enter + " is an invalid input");
	}

}
