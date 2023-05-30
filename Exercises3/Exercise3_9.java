package Exercises3;
import java.util.Scanner;

public class Exercise3_9 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int entrace = input.nextInt();
			int total = entrace;
			int d9 = total ;
			total %= 10;
			int d8 = total ;
			total %= 10;
			int d7 = total ;
			total %= 10;
			int d6 = total ;
			total %= 10;
			int d5 = total ;
			total %= 10;
			int d4 = total ;
			total %= 10;
			int d3 = total ;
			total %= 10;
			int d2 = total ;
			total %= 10;
			int d1 = entrace / 100000000;
			
			System.out.print((d4 == 10) ? "X" : d4);
	}

}
