package Exercises2;
import java.util.Scanner;

public class Exercise2_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int minutes = input.nextInt();
		
		int minutez = minutes;
		int years = minutez / 525600;
		minutez %= 525600;
		
		int days = minutez / 1440;
		minutez %= 1440;
		
		System.out.println(minutes + " minutes is approximately " + years + " years and " +
		days + " days");
	}

}
