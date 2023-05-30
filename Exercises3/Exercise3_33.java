package Exercises3;
import java.util.Scanner;

public class Exercise3_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight and price for package 1:");
		double w1 = input.nextDouble();
		double p1 = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2:");
		double w2 = input.nextDouble();
		double p2 = input.nextDouble();
		
		double unitPrice1 = p1 / w1 ;
		double unitPrice2 = p2 / w2 ;

		if(unitPrice1 == unitPrice2)
			System.out.print("Two packages have the same price.");
		else
			System.out.print("Package " + ((unitPrice1 > unitPrice2) ? "2 " : "1 ") + "has better price.");
		
				
	}

}
