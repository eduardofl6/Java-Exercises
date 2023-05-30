package Exercises3;
import java.util.Scanner;

public class Exercise3_15 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int result = 512;
	
			boolean loses = false;
			boolean win = false;
			
			System.out.print("Lottery make a guess(three-digit): ");
			int guess = input.nextInt();
			int n1 = guess / 100;
			int n2 = guess / 10 % 10;
			int n3 = guess % 10;
			
			int r1 = result / 100; 
			int r2 = result / 10 % 10; 
			int r3 = result % 10;
			
			int b1 = r1;
			int b2 = r2;
			int b3 = r3;
			
			if(guess == result) {
				System.out.print("Congratulations, you recivied $12.000");
					win = true;
			}
			else if((n1 == r1 || n1 == r2 || n1 == r3)) {
						if(n1 == r1)
							r1 = 10;
							else if(n1 == r2)
								r2 = 10;
								else if(n1 == r3)
									r3 = 10;
						if((n2 == r1 || n2 == r2 || n2 == r3)) {
							if(n2 == r1)
								r1 = 10;
								else if(n2 == r2)
									r2 = 10;
									else if(n2 == r3)
										r3 = 10;
							if((n3 == r1 || n3 == r2 || n3 == r3)) {
								win = true;
								System.out.print("Congratulations, you recivied $5.000");
							}
					} 									
				}
				 if(((n1 == b1 || n1 == b2 || n1 == b3) || (n3 == b1 || n3 == b2 || n3 == b3) || (n2 == b1 || n2 == b2 || n2 == b3)) && win == false) {
					 System.out.print("Congratulations, you recivied $2.000");
					 win = true;
				 }
				 
				
					
				if(!win)
					System.out.print("Congratulations, you recivied nothing");
						
	
	}

}
