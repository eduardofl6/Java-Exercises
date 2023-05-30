package Exercises5;
import java.util.Scanner;

public class Exercise5_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		while(num > 1) {
			for(int i = 2; i < 10; i++) {
				if(num % i == 0) {
					num /= i;
					System.out.print(i+" ");
					break;
				}
					
			}
		}
		
	}

}
