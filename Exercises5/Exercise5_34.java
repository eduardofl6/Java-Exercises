package Exercises5;

import java.util.Scanner;

public class Exercise5_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userPlay = input.nextInt();
		int botPlay = (int)(Math.random() * 11 % 3);
		
		int userwin = 0;
		int computerwin = 0;
		
		while(1> 0) {
		
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
		else if(userPlay == 1 && botPlay == 2) {
			computerwin++;
			System.out.print(". You loose");
		}
		else if(userPlay == 2 && botPlay == 0) {
			computerwin++;
			System.out.print(". You loose");
		}
		else if(userPlay == 0 && botPlay == 1) {
			computerwin++;
			System.out.print(". You loose");
		}
		else {
			System.out.print(". You win");
			userwin++;
			}
		System.out.print("\n");
		if(userwin >= 3 ||  computerwin >= 3) {
			System.out.print("End");
			System.exit(1);
		}
		userPlay = input.nextInt();
		 botPlay = (int)(Math.random() * 11 % 3);
		}
	}
}

