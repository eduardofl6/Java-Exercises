package Exercises3;
import java.util.Scanner;

public class Exercise3_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		
		System.out.print("Enter the number os days elapse since today: ");
		int daysElapse = input.nextInt();
		
		daysElapse = today + (daysElapse  % 7);
		
		System.out.print("Today is ");
		
		switch(today) {
		case 0: System.out.print("Sunday"); break;
		case 1: System.out.print("Monday"); break;
		case 2: System.out.print("Tuesday"); break;
		case 3: System.out.print("Wednesday"); break;
		case 4: System.out.print("Thursday"); break;
		case 5: System.out.print("Friday"); break;
		case 6: System.out.print("Saturday"); break;
		}
	
		System.out.print(" and the future day is ");
		
		switch(daysElapse) {
		case 0: System.out.print("Sunday"); break;
		case 1: System.out.print("Monday"); break;
		case 2: System.out.print("Tuesday"); break;
		case 3: System.out.print("Wednesday"); break;
		case 4: System.out.print("Thursday"); break;
		case 5: System.out.print("Friday"); break;
		case 6: System.out.print("Saturday"); break;
		default: System.out.print("Wrong number"); break;
		}
	}

}
