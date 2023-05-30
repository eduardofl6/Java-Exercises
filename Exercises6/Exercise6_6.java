package Exercises6;
import java.util.Scanner;

public class Exercise6_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

			int in = input.nextInt();
			
			displayPattern(in);
	}

	public static void displayPattern(int n) {
		
		for(int i = 1; i <= n; i++) {
			
			for(int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
		System.out.print("\n");
		}
		
		while(n > 0) {
			System.out.print(n-- + " ");
		}
	}
	
}
