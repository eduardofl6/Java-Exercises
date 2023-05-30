package Exercises5;

public class Exercise5_40 {

	public static void main(String[] args) {
		int result = 0;
		int heads = 0;
		int tails = 0;
		
		for(int i = 0; i <= 2000000; i++) {
			
			result = (int)(Math.random() * 10 );
			if(result >= 5)
				heads++;
			else
				tails++;
		}
		System.out.format("Total of heads: %d\nTotal of tails: %d", heads, tails);
	}

}
