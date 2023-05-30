package Exercises5;

public class Exercise5_39 {

	public static void main(String[] args) {
			
	
	double commission = 0;

	int sales = 0;
			
	for(; commission != 30000; sales++, commission = 0) {
		
	
		//Unfinished Code
	if(sales > 0) {
		commission += (sales >= 5000) ? 5000 * 0.06 : sales * 0.06;
		sales -= 5000;
	}
	if(sales > 5000) {
		commission += (sales > 10000) ? 5000 * 0.08 : sales * 0.08;
		sales -= 5000;
	}
	if(sales > 10000) {
		commission += sales * 0.10;
	}
	System.out.println(sales);
		}
	System.out.print(sales);
	}

}
