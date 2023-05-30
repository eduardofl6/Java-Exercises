package Exercises3;
import java.util.Scanner;

public class Exercise3_17 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("scissor (0), rock (1), paper (2): ");
			int userPlay = input.nextInt();
	
			int botPlay = (int)(Math.random() * 11 % 3);
			
			switch(botPlay) {
			case 0: System.out.print("The computer is scissor. "); break;
			case 1: System.out.print("The computer is rock. "); break;
			case 2: System.out.print("The computer is paper. "); break;
			}
			
			switch(userPlay) {
			case 0: System.out.print("You are scissor"); break;
			case 1: System.out.print("You are rock"); break;
			case 2: System.out.print("You are paper"); break;
			}	
			
			if(userPlay == botPlay)
				System.out.print(" too. It's a draw");
			else if(userPlay == 1 && botPlay == 2)
				System.out.print(". You loose");
			else if(userPlay == 2 && botPlay == 0)
				System.out.print(". You loose");
			else if(userPlay == 0 && botPlay == 1)
				System.out.print(". You loose");
			else
				System.out.print(". You win");
					
	}

}
