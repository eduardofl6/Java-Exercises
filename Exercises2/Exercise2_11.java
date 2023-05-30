package Exercises2;
import java.util.Scanner;

public class Exercise2_11 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int currentPopu = 312032486;
			int numberYears = input.nextInt();
			double numberSeconds = numberYears * 31536000;
			double births =  numberSeconds / 7;
			double deaths = numberSeconds / 13;
			double immigrant = numberSeconds / 45;
			currentPopu += births + immigrant;
			currentPopu -= deaths;
			
			System.out.print("The population in 5 years is " + currentPopu);
			
	}

}
