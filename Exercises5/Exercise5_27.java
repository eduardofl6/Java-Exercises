package Exercises5;

public class Exercise5_27 {

	public static void main(String[] args) {
		
		int c = 0;
		for(int y = 2014, i = 0; y <= 2114;y++) {
				
			
		if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
			System.out.print(y + " ");
			i++;
			c++;
		}
			
			if(i == 10) {
				System.out.print("\n");
				i = 0;
			}
			
			}
	System.out.print("\n Total of " + c + " leap years");	
	}

}
