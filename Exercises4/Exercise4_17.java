package Exercises4;
import java.util.Scanner;

public class Exercise4_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Enter a month: ");
		String monthString = input.next();

		String lowerMonth = "";
		
		if(monthString.charAt(0) < 'A' || monthString.charAt(0) > 'Z')
		{
			System.out.print(monthString + " is not a correct month name");
			System.exit(1);
		}else
		{
			 lowerMonth = monthString.toLowerCase();
		}
		
		boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		int days = 0;
		switch(lowerMonth) {
		case "jan": days = 31; break;
		case "feb": days = (leap) ? 29 : 28; break;
		case "mar": days = 31;break;
		case "apr": days = 30; break;
		case "may": days = 31;	break;
		case "jun": days = 30;	break;
		case "jul": days = 31;	break;
		case "aug": days = 31;	break;
		case "sep": days = 30;	break;
		case "oct": days = 31; break;
		case "nov": days = 30; break;
		case "dec": days = 31;break;
		default :break;
		}
		
		System.out.print(monthString + " " + year + " has " + days + " days");
	
	}

}
