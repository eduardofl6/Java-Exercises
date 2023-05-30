package Exercises3;
import java.util.Scanner;

public class Exercise3_10 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
		
			int n1 = (int)(Math.random() * 1000 % 1000);
			int n2 = (int)(Math.random() * 1000 % 1000);
		
			int answer = n1 * n2;
		System.out.print("What is the result of " + n1 + " * " + n2+ " ?");
			int useranswer = input.nextInt();
			
			System.out.print("Your answer is " + ((answer == useranswer) ? " Corret!" : ("Wrong " + n1 + " * " + n2 + " is: " + answer)));
	}

}
