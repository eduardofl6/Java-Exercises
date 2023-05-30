package Exercises3;
import java.util.Scanner;

public class Exercise3_18 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the weight of the package (in pounds): ");
			int packageWeight = input.nextInt();
			
			double cost = 0;
			
			if(packageWeight <= 2 && packageWeight > 0)
				cost = 2.5 * packageWeight;
			else if(packageWeight > 2 && packageWeight <= 4)
				cost = 4.5 * packageWeight;
			else if(packageWeight > 4 && packageWeight <= 10)
				cost = 7.5 * packageWeight;
			else if(packageWeight > 10 && packageWeight <= 20)
				cost = 10.5 * packageWeight;
			else
				cost = -1.0;
			
			if(cost > 0)
				System.out.print("It will cost $" + ( ((int) (cost * 100)) / 100.0 ) + " dollars to transport");
			else
				System.out.print("Package cannot be transported");
	}

}
