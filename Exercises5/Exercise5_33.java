package Exercises5;

public class Exercise5_33 {

	public static void main(String[] args) {
		System.out.print("All perfect number from 1 to 10000\n");
		
		
		for(int i = 1,sum = 0; i <= 10000;i++, sum = 0) {
			
			for(int j = i-1; j>0;j--) {
				sum += ((i % j == 0) ? j : 0 );
				
			}
			if(sum == i)
				System.out.println(i);
			
		}
	}

}
