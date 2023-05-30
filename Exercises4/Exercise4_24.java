package Exercises4;
import java.util.Scanner;

public class Exercise4_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first country: ");
		String c1 = input.nextLine();
		
		System.out.print("Enter the second country: ");
		String c2 = input.nextLine();
		
		System.out.print("Enter the third country: ");
		String c3 = input.nextLine();
		
		String bigger = "";
		String middle = "";
		String lower  = "";
		
		if(c1.compareTo(c2) > 0) {
			if(c1.compareTo(c3) > 0)
				bigger = c1;
			else {
				bigger = c3;
				middle = c2;
				lower = c1;
			}
		}else 
			if(c2.compareTo(c3) > 0) {
					if(c1.compareTo(c3) > 0) {
						bigger = c2;
						middle = c1;
						lower = c3;
					}else{
						bigger = c2;
						middle = c3;
						lower = c1;
					}
			}else {
				bigger = c3;
				middle = c2;
				lower = c1;
			}
		
		System.out.print("The three countries in descending order are " + bigger +", "+ lower + " and "+ middle);
			
	
	
	
	
	
	}

}
