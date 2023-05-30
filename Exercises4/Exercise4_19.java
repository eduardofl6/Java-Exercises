package Exercises4;
import java.util.Scanner;

public class Exercise4_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		String code = input.nextLine();
		int x = 0;
		int d1 = (code.charAt(x++) - 48) ;
		int d2 = (code.charAt(x++) - 48) ;
		int d3 = (code.charAt(x++) - 48) ;
		int d4 = (code.charAt(x++) - 48) ;
		int d5 = (code.charAt(x++) - 48) ;
		int d6 = (code.charAt(x++) - 48) ;
		int d7 = (code.charAt(x++) - 48) ;
		int d8 = (code.charAt(x++) - 48) ;
		int d9 = (code.charAt(x++) - 48) ;

		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
				d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		System.out.print( d1 +""+ d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + ((d10 == 10) ? "X": d10));
	}

}
