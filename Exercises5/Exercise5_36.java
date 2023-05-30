package Exercises5;
import java.util.Scanner;

public class Exercise5_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String isbn = input.nextLine();
		
		
		
		int sum = 0;
		for(int i = 1; i <= 9; i++) {
			sum += ((isbn.charAt(i-1)-48) * i);
		}
		sum %= 11;
			System.out.print(isbn + ((sum == 10) ? "X" : sum));
	}

}
