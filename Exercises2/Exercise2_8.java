package Exercises2;
import java.util.Scanner;

public class Exercise2_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		
		int offset = input.nextInt();
		
		long totalMiliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMiliseconds / 1000;
		
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHours = totalHours % 24;
		
		long totaldays = totalHours / 24;
	
		long currentDays = totaldays % 365;

		System.out.println(currentDays);
		System.out.print("Time: " + (currentHours + (offset)) + ":" + currentMinutes + 
			":" + currentSeconds);
	}

}
