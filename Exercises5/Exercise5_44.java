package Exercises5;
import java.util.Scanner;

public class Exercise5_44 {

	public static void main(String[] args) {
		System.out.print("Enter a decimal number: ");
		Scanner input = new Scanner(System.in);
		
	byte num = input.nextByte();
	
	for(int i = 1,b = 128; i <= 8; i++, b /= 2) {
		
		if((num & b) > 0) {
			System.out.print(1);
		}else
			System.out.print(0);
		
	}
	
	}

}
