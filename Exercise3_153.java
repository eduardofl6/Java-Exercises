import java.util.Scanner;

public class Exercise3_153 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		int sign = year % 12;
		
		if(sign == 0)
			System.out.println("Monkey");
		else if(sign == 1)
			System.out.println("Rooster");
		else if(sign == 2)
			System.out.println("Dog");
		else if(sign == 3)
			System.out.println("Pig");
		else if(sign == 4)
			System.out.println("Rat");
		else if(sign == 5)
			System.out.println("Ox");
		else if(sign == 6)
			System.out.println("Tigger");
		else if(sign == 7)
			System.out.println("Rabbit");
		else if(sign == 8)
			System.out.println("Dragon");
		else if(sign == 9)
			System.out.println("Snake");
		else if(sign == 10)
			System.out.println("Horse");
		else if(sign == 11)
			System.out.println("Sheep");
	}

}
