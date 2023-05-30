public class Exercise3_72 {

	public static void main(String[] args) {
		
		int randomNumber = (int)(Math.random() * 100) % 20 ;
		int randomNumber1 = (int)((Math.random() * 100) % 10) + 10 ;
		int randomNumber2 = (int)((Math.random() * 100) % 41) + 10 ;
		System.out.println(randomNumber);
		System.out.println(randomNumber1);
		System.out.println(randomNumber2);
		
		int zero1 = (int)(Math.random() * 10) % 2;
		System.out.println(zero1);
	}

}
