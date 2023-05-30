package Exercises5;
import java.util.Scanner;

public class Exercise5_49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String enter = input.nextLine();
		
		int consoant = 0;
		int vowel = 0;
		
		for(int i = 0,  c = 0; i <= enter.length()-1; i++) {
			c = Character.toLowerCase(enter.charAt(i));
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowel++;
			}else if(Character.isLetter(c)) {
				consoant++;
			}
			
		}
		System.out.format("The number of vowel is %d\nThe number of consoants is %d", vowel,consoant);

	}

}
