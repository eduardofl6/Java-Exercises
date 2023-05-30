
public class Exercise3_41 {

	public static void main(String[] args) {
		double pay = 100;
		int score = 96;
		
		if(score > 90)
			pay += pay * 0.03;
		else
			pay += pay * 0.01;
		System.out.print(pay);
	}

}
