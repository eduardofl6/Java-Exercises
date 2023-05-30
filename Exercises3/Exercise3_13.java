package Exercises3;
import java.util.Scanner;

public class Exercise3_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pay = input.nextInt();
	
		double single = 0;
		double filing = 0;
		double married = 0;
		double head = 0;
		
		
		
		if(pay <= 8350) {
			single = 0.10;
			filing = 0.10;
			married = 0.10;
			head = 0.10;
		}else if(pay <= 11950) {
			single =  0.15;
			filing =  0.10;
			married =  0.15;
			head =  0.10;
		}else if(pay <= 16700) {
			single = 0.15;
			filing = 0.10;
			married =  0.15;
			head =  0.15;
		}else if(pay <= 33950) {
			single =  0.15;
			filing =  0.10;
			married = 0.15;
			head =  0.15;
		}else if(pay <= 45500) {
			single =  0.25	;
			filing =  0.10;
			married =  0.25;
			head =  0.15;
		}else if(pay <= 67901) {
			single =  0.25	;
			filing =  0.10;
			married =  0.25;
			head =  0.15;
		}
	}

}
