package Exercises5;

public class Exercise5_15 {

	public static void main(String[] args) {
		for(int i = '!', x = 1; i < '~';i++,x++) {
			System.out.print((char)i + " ");
			if(x == 10)
			{
				x = 0;
				System.out.print("\n");
			}
		}
			
	}

}
