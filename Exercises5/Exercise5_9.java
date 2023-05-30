package Exercises5;
import java.util.Scanner;

public class Exercise5_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int students = input.nextInt();
	
		String student = "";
		int score = 0;
		
		String worse = "";
		int scorew = 100;
		
		String worse2 = "";
		int scorew2 = 100;
		
		System.out.print("Enter student's name and score: ");
	
		for(;students > 0; students--) {
			student = input.next();
			score = input.nextInt();
			
			if(score < scorew)
			{
				worse = student;
				scorew = score;
			}else if(score < scorew2) {
				worse2 = student;
				scorew2 = score;
			}
		
		}
		System.out.print("The worse stundent is " + worse + " and the score is " + scorew + "\nThe second-worse student is " 
				+ worse2 + " and the score is " + scorew2);
	}

}
