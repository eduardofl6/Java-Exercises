package Exercises5;
import java.util.Scanner;

public class Exercise5_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number (1 to 4) to decide de pattern: ");
		int pattern = input.nextInt();
		
		switch(pattern) {
		case 1 :
			for(int i = 0, j = 6; i < 6; i++) {
				
				for(int v = 0; v <= i; v++)
					System.out.print("* ");
				
				System.out.print("\n");
			}
			
			
			break;
		case 2 :
		for(int i = 0, j = 6; i < 6; i++) {
				
				for(int v = 0; v < 6 - i; v++)
					System.out.print("* ");
				
				System.out.print("\n");
			}
			
			break;
		case 3 :
			for(int i = 0, j = 6; i < 6; i++) {
				
				for(int v = 0; v <= 6; v++)
					System.out.print(((v >= 6 - i)? "* " : "  " ));
				
				System.out.print("\n");
			}
			break;
		case 4 : 
			for(int i = 0, j = 6; i < 6; i++) {
				
				for(int v = 6; v > 0; v--)
					System.out.print(((v >= 6 - (i-1)) ? "  " : "* " ));
				
				System.out.print("\n");
			}
			break;
		default : 	
			System.out.print("Unknow pattern"); break;
		}

	}

}
