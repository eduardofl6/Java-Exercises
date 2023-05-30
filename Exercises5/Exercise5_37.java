package Exercises5;
import java.lang.Math;
import java.util.Scanner;

public class Exercise5_37 {

	public static void main(String[] args) {
			System.out.print("Enter a decimal number: ");
			Scanner input = new Scanner(System.in);
			
			int num =  input.nextInt();
			String binary = "";
		
			for(int i = 0;num > 0;i++){
				if(num % 2 == 0) {
					binary += "0";
				}else if(num % 2 == 1) {
					binary += "1";
				}
				num /= 2;
			}
			String answer = "";
			
			for(int i = binary.length()-1; i >= 0; i--) {
				answer += binary.charAt(i);
			}
			System.out.println(answer.length());
			System.out.print(answer);
	
	}

}
