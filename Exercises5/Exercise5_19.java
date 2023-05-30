package Exercises5;

public class Exercise5_19 {

	public static void main(String[] args) {
		for(int i = 0, j = 1; i < 8; i++) {
			
			for(int v = 0, t = 1, b= 1; v <= 8 + i; v++) {
				if( v <= 8) {
					
					System.out.print(((v >= 8 - i) ? t + "\t" : "\t" ));
					t *= (v >= 8 - i) ? 3 : 1;
				}
				else
				System.out.print((((t /= 3) > 0) ? t + "\t" : "\t" ) );
	
			}
			
			System.out.print("\n");
			System.out.print("\n");
		}
	}

}
