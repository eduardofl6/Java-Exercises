
public class Exercise4_2 {

	public static void main(String[] args) {

		//4.2.3
		double value = Math.toRadians(47);
		//4.2.4
		double value1 = Math.toDegrees(Math.PI);
		
		//4.2.5
		int random = 34 + (int)(Math.random() * (55-34));
		//This way, i guarantee that the random number will be at least 34, and if i add it to 34, won't exceed 55
		System.out.println(random);
		
		int random1000 = (int)(Math.random() * 1000);
		
		double randomDouble = 5.5 + (Math.random() * (55.5 - 5.5));
		
		System.out.println(Math.log(Math.exp(5.5)));
		System.out.println( Math.exp(Math.log(5.5)));;
		System.out.println(Math.asin(Math.sin(Math.PI / 6)));
		System.out.println(Math.sin(Math.asin(Math.PI / 6)));
	}

}
