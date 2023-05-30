package Exercises4;
import java.util.Scanner;

public class Exercise4_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a SSN: ");
		String ssn = input.nextLine();
		int x = 0;
		
		
		if((Character.isDigit(ssn.charAt(x++))) && ( Character.isDigit(ssn.charAt(x++))) && (Character.isDigit(ssn.charAt(x++)))) {
			if(ssn.charAt(x++) == '−') {
				if((Character.isDigit(ssn.charAt(x++))) && (Character.isDigit(ssn.charAt(x++)))){
					if(ssn.charAt(x++) == '−') {
						if((Character.isDigit(ssn.charAt(x++))) && ( Character.isDigit(ssn.charAt(x++))) && (Character.isDigit(ssn.charAt(x++))) && (Character.isDigit(ssn.charAt(x++)))) {
							System.out.print( ssn  + " is a valid social security number");
							System.exit(1);
						}
					}
				}
			}
		}
					System.out.print(ssn + " is an invalid social security number");
						
					
			
			
	}

}
