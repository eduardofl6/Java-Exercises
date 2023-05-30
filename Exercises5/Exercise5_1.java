package Exercises5;
import java.util.Scanner;

public class Exercise5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int score = 0;
		while(1 == 1)
		{
			System.out.print("Enter your score: ");
			score = input.nextInt();
			
			if(score >= 60)
				System.out.println("You pass the exam \n");
			else if(score >= 0)
				System.out.println("You don't pass the exam\n");
			else if(score == -1) {
				System.out.print("No numbers are entered except 0");
				break;
			}
			
		}	
			
		
			
	}

}
