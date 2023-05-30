import java.util.Scanner;
public class Exercise5_113 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		
		 // Prompt the user to enter a decimal integer
		 System.out.print("Enter a decimal number: ");
		 int decimal = input.nextInt();
		 int copy = decimal;
		 
		// Convert decimal to hex
		 String hex = "";
		
		 int times = 0;
		 while (decimal != 0) {
		 int hexValue = decimal % 16;
		
		 // Convert a decimal value to a hex digit
		 char hexDigit = (0 <= hexValue && hexValue <= 9) ?
		 (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
		 
		 hex = hexDigit + hex;
		 decimal = decimal / 16;
		 times++;
		 }
		
		 System.out.println("The hex number is " + ((copy == 0) ? 0 : hex) + "\n Times executed: " + times);
	}

}
