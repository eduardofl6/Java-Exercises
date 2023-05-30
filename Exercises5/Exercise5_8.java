package Exercises5;
import java.util.Scanner;

public class Exercise5_8 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the number of students: ");
			int students = input.nextInt();
		
			String student = "";
			int score = 0;
			
			String best = "";
			int max = 0;
			
			System.out.print("Enter student's name and score: ");
		
			for(;students > 0; students--) {
				student = input.next();
				score = input.nextInt();
				
				if(score >= max) {
					best = student;
					max = score;
				}
			}
			System.out.print("The best student is " + best + " and the score is " + score);
	}

}
