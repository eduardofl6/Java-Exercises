package Exercises3;
import java.util.Scanner;

public class Exercise3_21 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int year = input.nextInt();
			int month = input.nextInt();
			// DayM  == day of month
			int dayM = input.nextInt();
			// k == year of century
			int k = year % 100;
			// j = year / 100
			int j = year / 100;
			
			year -= (month <= 2) ? 1 : 0;
			month += (month <= 2) ? 9 : 0;
			
			int dayOfWeek = (dayM + ((26 * (month + 1)) / 10) + k + (k/4) + (j/4) +  (5 * j)) % 7;
			
			System.out.print("Day of week is: ");
			
			switch(dayOfWeek) {
			case 0: System.out.print("Saturday"); break;
			case 1: System.out.print("Sunday"); break;
			case 2: System.out.print("Monday"); break;
			case 3: System.out.print("Tuesday"); break;
			case 4: System.out.print("Wednesday"); break;
			case 5: System.out.print("Thursday"); break;
			case 6: System.out.print("Friday"); break;
			default: System.out.print("Wrong number"); break;
			}
	}

}
