package Exercises3;
import java.util.Scanner;

public class Exercise3_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 3 integers: ");
		int number = input.nextInt();
		int number1 = input.nextInt();
		int number2 = input.nextInt();
	
		if(number >= number1 && number >= number2) {
			System.out.print(((number1 >= number2) ? number2 : number1) + " " + ((number1 >= number2) ? number1 : number2)+ " " +number);
		}else if(number1 >= number && number1 >= number2) {
			System.out.print(((number >= number2) ? number2 : number)+ " " + ((number >= number2) ? number : number2 )+ " " + number1);
		}else if(number2 >= number1 && number2 >= number) {
			System.out.print( ((number >= number1) ? number1: number) + " " + ((number >= number1) ? number : number1)+ " " +number2);
		}
	}
}
