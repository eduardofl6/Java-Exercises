package Exercises5;

public class Exercise5_6 {

	public static void main(String[] args) {

			System.out.print("Ping Square meter | Square meter Ping\n");
			for(int p = 10; p <= 80; p +=5) {
				System.out.format("%d	%.3f\t   | %d	%.3f\n", p, (float)(p * 3.305), (p + 20), (float)((p+20) / 3.305));
			}
	}

}
