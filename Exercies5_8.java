
public class Exercies5_8 {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		while (sum < 10000) {
		sum = sum + i;
		i++;
		}
		
		System.out.println(sum);
		sum = 0;
		
		for(int j = 0; sum < 10000; j++) {
			sum = sum + j;
		}
		
		System.out.println(sum);
		sum = 0;
	
	}

}
