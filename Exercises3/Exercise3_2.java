package Exercises3;
import java.util.Scanner;

public class Exercise3_2 {
	public static void main(String[] args) {
		int number  = (int)(Math.random() * 10);
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		 
		 // Create a Scanner
		 Scanner input = new Scanner(System.in);
			
		 System.out.print(
		 "What is " + number + " * " + number1 + " * " + number2 + "? ");
		 int answer = input.nextInt();			 

		 System.out.println(
		 number + " * " + number1 + " * "+ number2 +" = " + answer + " is " +
		 (number * number1 * number2 == answer));
	}
}
