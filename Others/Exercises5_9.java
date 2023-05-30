
public class Exercises5_9 {

	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < i; j++) {
				count++;
				System.out.println(i * j);
			}
		System.out.println("Count is " + count);
	
		//5.9.2
		//  A
		System.out.println("\n(a)");
		if(1 > 0)
		{
			
		for (int i = 1; i < 5; i++) {
			int j = 0;
			while (j < i) {
			System.out.print(j + " ");
			j++;
				}
			}
		}
		// B
			System.out.println("\n(b)");
		if(1 > 0)
		{
				int i = 0;
				while (i < 5) {
				for (int j = i; j > 1; j--)
				System.out.print(j + " ");
				System.out.println("****");
				i++;
				}
		}
		// 	C 
			System.out.println("\n(c)");
	
			if(1 > 0)
		{		
			int i = 5;
			while (i >= 1) {
			int num = 1;
			for (int j = 1; j <= i; j++) {
			System.out.print(num + "xxx");
			num *= 2;
			}
			System.out.println();
			i--;
			}
		}
		// D
			System.out.println("\n(d)");
			if(1 > 0)
			{
				int i = 1;
			do {
				int num = 1;
				for (int j = 1; j <= i; j++) {
				System.out.print(num + "G");
				num += 2;
				}
				System.out.println();
				i++;
				} while (i <= 5);
			}
		}
	}


