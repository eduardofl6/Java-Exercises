package Exercises5;
import java.util.Scanner;

public class Exercise5_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines (1 to 15): ");
		int l = input.nextInt();
	
		if(l > 0 && l <=15) {
			
		while(l > 0)
		{
			for(int i = l; i > 1; i--)
				System.out.print(i + " ");
			
			for(int j = 1; j <= l; j++)
				System.out.print(j + " ");
			System.out.print("\n");
			l--;
		}
			}else
				System.out.print("Wrong input");
			
	}

}
