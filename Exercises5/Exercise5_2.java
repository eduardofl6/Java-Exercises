package Exercises5;
import java.util.Scanner;

public class Exercise5_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		for(int i = 10 ; i > 0; i--)
		{
			
			int number1 = (int)(Math.random() * 12);
			int number2 = (int)(Math.random() * 12);
			System.out.print("What is " + number1 + " * " + number2 + "? ");
			int answer = input.nextInt();
			
			if( answer ==  (number1 * number2)){
				System.out.println("You are correct!\n");
				count++;
			}else{
				System.out.println("Your answer is wrong\n" + number1 + " * " + number2 + " should be " + (number1 * number2)+ " \n");
			}
		}
		System.out.print("Correct count is " + count);
	}

}
