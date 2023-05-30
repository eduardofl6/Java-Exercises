
public class Exercise3_142_144 {

	public static void main(String[] args) {
		// 3.14.2
		int ages = 15;
		int ticketPrice = (ages >= 16) ? 20 : 10;
		
		// 3.14.3 
			//a
		int x = 11, scale = 2;
		int score = 0;
		if (x > 10)
			 score = 3 * scale;
		else
			 score = 4 * scale;
		
			//b
		int income = 1200;
		double tax = 0;
		
		if (income > 1000)
				tax = income * 0.2;
		else
				tax = income * 0.17 + income;
	
			//c
		int i = 1;
		int j = 2;
		int number = 12;
		if(number % 3 == 0)
			System.out.print(i);
		else
			System.out.print(j);
		// 3.14.4
		
		int expression = (Math.random() > 0.5) ? 1 : -1;
	}

}
