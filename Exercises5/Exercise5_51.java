package Exercises5;
import java.util.Scanner;

public class Exercise5_51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String in1 = input.nextLine();
		String in2 = input.nextLine();
		
		int min = (in1.length() >= in2.length()) ? in2.length() - 1 : in1.length() - 1;  
		
		String common = "";
		
		for(int i = 0;  in1.charAt(i) == in2.charAt(i) && i <= min; i++) {
			common += in1.charAt(i);
		}
		if(in1.charAt(0) != in2.charAt(0)){
			System.out.print(in1 + " and " + in2 + " have no common prefix");
		}else
			System.out.print("The common prefix is " + common);
	}

	
	
}
