
public class Exercise5_76 {
	static public void main(String []args)
	{
		long sum = 0;
		for (int i = 0; i <= 1000; i++)
		sum = sum + i;

		System.out.println(sum);
		sum = 0;
		
		int i = 0;
		while(i <= 1000) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		sum = 0;
		i = 0;
		do {
			sum += i;
			i++;
		}while(i <= 1000);
	
			System.out.println(sum);
	}
}
