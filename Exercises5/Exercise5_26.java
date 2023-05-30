package Exercises5;

public class Exercise5_26 {

	public static void main(String[] args) {
		double e = 1;
		double f = 0;
		
		int max = 100000;
		f = max;

		for(int i = max; i > 1; i--, f = 0) {
			
			f = i;
			for(int j = i; j > 1;)
				f *= --j;
			
			f = (1.0 / f);
			e += f;
		}
		System.out.print(e);
	}
}
