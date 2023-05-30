package Exercises5;
import java.util.Scanner;

public class Exercise5_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int y = input.nextInt();
		
		System.out.print("Enter a day of week (in numbers): ");
		int d = input.nextInt();
	
		boolean isLeapYear = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
		
		int days = (isLeapYear) ? 366 : 365;
		
		int a = 31;
		
		for(int ad = 1, m = 1; ad < days; m++) {
	
			
			if(m != 2 && m != 7 ) {
				
				ad += (a == 31) ? a-- : a++;
			
			}else if(m == 2) {
				
			ad += (isLeapYear) ? 29 : 28;
			
			}else {
				
			}
				ad += 31;
			
			
			
			
			switch(m) {
			case 1 : System.out.print(" January "); break;
			case 2 : System.out.print(" February "); break;
			case 3 : System.out.print(" March "); break;
			case 4 : System.out.print(" April "); break;
			case 5 : System.out.print(" May "); break;
			case 6 : System.out.print(" June "); break;
			case 7 : System.out.print(" July "); break;
			case 8 : System.out.print(" August "); break;
			case 9 : System.out.print(" September "); break;
			case 10 : System.out.print(" October "); break;
			case 11 : System.out.print(" November "); break;
			case 12 : System.out.print(" December "); break;
			}
			
			System.out.print("1, 2013 is");
			
			switch((ad % 7) + d) {
			case 1 : System.out.print(" Sunday "); break;
			case 2 : System.out.print(" Monday "); break;
			case 3 : System.out.print(" Tuesday "); break;
			case 4 : System.out.print(" Wednesday "); break;
			case 5 : System.out.print(" Thursday "); break;
			case 6 : System.out.print(" Friday "); break;
			case 7 : System.out.print(" Saturday "); break;

			}
			System.out.print("\n");

		}
		
		
		
	}

}
