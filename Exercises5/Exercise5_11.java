package Exercises5;

public class Exercise5_11 {

	public static void main(String[] args) {
		
		for(int i = 100, x = 0; i <= 200;i++)
		{
	
			System.out.print(((i % 3 == 0 ^ i % 4 == 0)? i : "") + ((i % 3 == 0 ^ i % 4 == 0)? " " : ""));
			
			if(i % 3 == 0 ^ i % 4 == 0) {
				x++;
			}
			if(x == 10) {
				x = 0;
				System.out.print("\n");
			}
			
		}
				
	}

}
