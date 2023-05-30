package Exercises5;

public class Exercise5_7 {

	public static void main(String[] args) {

		double tuition = 10000;
		double fouryears = 0;
		System.out.print("Year 0: $1000\n");
		for(int i = 1; i <= 14; i++)
		{
			if(i <= 10)
			System.out.format("Year %d: $%.2f\n",i, tuition *= 1.06);
			else
				fouryears += tuition *= 1.06;
		}
		System.out.format("Total of four years after the tenth year: $%.2f",fouryears);
	}

}
