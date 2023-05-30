package Exercises4;
import java.util.Scanner;

public class Exercise4_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter two characters: ");
		String chars = input.nextLine();
		
		char major = chars.charAt(0);
		char status = chars.charAt(1);
		
		if(major != 'A' ||major != 'C' || major != 'I' || (status < 1 || status > 4)) {
			System.out.print("invalid input");
			System.exit(1);
		}
		switch(major){
			case 'I' : System.out.print("Information Management "); break;
			case 'C' : System.out.print("Computer Science ");break;
			case 'A' : System.out.print("Accounting ");break;
			default: break;
		}
		
		switch(status){
		case '1': System.out.print("Freshman");break;
		case '2': System.out.print("Sophomore");break;
		case '3': System.out.print("Junior");break;
		case '4': System.out.print("Senior");break;
			default: break;
		}
	}

}
