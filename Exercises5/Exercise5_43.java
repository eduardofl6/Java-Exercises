package Exercises5;

public class Exercise5_43 {

	public static void main(String[] args) {
		
		int i = 1;
		int count = 0;
		
		final int choices = 7;
		
		for(int g = i+1; i <= choices;i++, g = i+1){
			
			for(; g <= choices; g++) {
				System.out.format("(%d,%d)\n",i,g);
				count++;
			}
		
		}
		System.out.print(count);
	}

}
