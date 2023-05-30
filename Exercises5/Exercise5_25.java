package Exercises5;

public class Exercise5_25 {

	public static void main(String[] args) {
		int i = 10000;
		double pi = 1;
		boolean sign = false;
		
		for(int n = 3; n <= (2*i - 1); n += 2) {
				if(sign == true) {
					
					pi += (1.0/n);
					sign = false;
				}else {
					pi -= (1.0/n);
					sign = true;
				}
			}
			System.out.print(pi);
	}
//Unfinished
	
}
