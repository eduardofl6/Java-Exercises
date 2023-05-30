import java.util.Scanner;

public class Exercise4_5 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

		 System.out.print("Enter a hex digit: ");
		 String hexString = input.nextLine();
		
		 // Check if the hex string has exactly one character
		 if (hexString.length() != 1) {
		 System.out.println("You must enter exactly one character");
		 System.exit(1);
		 }
		
		 // Display decimal value for the hex digit
		 char ch = hexString.charAt(0);
		 
		 if ('A' <= ch && ch <= 'F' || 'a' <= ch && 'f' >= ch) {
		 int value = ch - ((ch >= 'A' && ch <= 'F') ? 'A' : 'a') + 10;
		 System.out.println("The decimal value for hex digit "
		 + ch + " is " + value);
		 }
		 else if (Character.isDigit(ch)) {
		 System.out.println("The decimal value for hex digit "
		 + ch + " is " + ch);
		 }
		 else {
		 System.out.println(ch + " is an invalid input");
		 }
		 
		  // Generate a lottery as a two-digit string
		  String lottery = "" + (int)(Math.random() * 100);
		 
		  // Prompt the user to enter a guess
		  System.out.print("Enter your lottery pick (two digits): ");
		  String guess = input.nextLine();
		 
		  // Get digits from lottery
		 char lotteryDigit1 = lottery.charAt(0);
		  char lotteryDigit2 = lottery.charAt(1);
		 
		 // Get digits from guess
		  char guessDigit1 = guess.charAt(0);
		  char guessDigit2 = guess.charAt(1);
		 
		  System.out.println("The lottery number is " + lottery);
		 
		  // Check the guess
		  if (guess.equals(lottery))
		  System.out.println("Exact match: you win $10,000");
		  else if (guessDigit2 == lotteryDigit1
		  && guessDigit1 == lotteryDigit2)
		  System.out.println("Match all digits: you win $3,000");
		  else if (guessDigit1 == lotteryDigit1
		  || guessDigit1 == lotteryDigit2
		  || guessDigit2 == lotteryDigit1
		  || guessDigit2 == lotteryDigit2)
			 System.out.println("Match one digit: you win $1,000");
	
		  else
		  System.out.println("Sorry, no match");
		  
		  
		 
		 	}

}
