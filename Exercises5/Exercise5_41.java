package Exercises5;
import java.util.Scanner;

public class Exercise5_41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		String numbers = input.nextLine();
		
		
		int max = 0;
		int num;
		for(int i = 0; (numbers.charAt(i)) != '0';i+=2) {
			num = numbers.charAt(i) - 48;
			if(num > max) {
				max = num;
			}
		}
		
		int count = 0;
		for(int i = 0; i < (numbers.length()); i++) {
			if((numbers.charAt(i)-48) ==  max) {
				count++;
			}
		}
		System.out.format("The largest number is %d\nThe occurrence count of the largest number is %d",max,count);
	}

}
