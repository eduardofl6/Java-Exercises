package Exercises5;
import java.util.Scanner;

public class Exercise5_38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value in decimal: ");
		String user = input.nextLine();

		String convertion = "";
		
		int num = 0;
		for(int v = user.length(), t = 0; t < v; t++) {
			num *= 10;
			 num += user.charAt(t) - 48;
		}

		for(int i = 0;num > 0;i++){
		
			convertion += "" + num % 8;
			num /= 8;
			
		}
		String answer = "";
		
		for(int i = convertion.length()-1; i >= 0; i--) {
			answer += convertion.charAt(i);
		}
		
		System.out.print(answer);
	}

}
