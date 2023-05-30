public class Exercise4_3 {

	public static void main(String[] args) {
		System.out.print("ASCII CODE\n");
		System.out.println((int) '1');
		System.out.println((int) 'A');
		System.out.println((int) 'B');
		System.out.println((int) 'a');
		System.out.println((int) 'b');
		
		System.out.print("DECIMAL CODES\n");
		System.out.println((char) 40 );
		System.out.println((char) 59 );
		System.out.println((char) 79 );
		System.out.println((char) 85 );
		System.out.println((char) 90 );

		System.out.print("HEXADECIMAL CODES\n");
		System.out.println((char) 0x40);
		System.out.println((char) 0x5A);
		System.out.println((char) 0x71);
		System.out.println((char) 0x72);
		System.out.println((char) 0x7A);
	
		System.out.println("\n\\ \"");
		
		int i = '1'; // i is 49
		int j = '1' + '2' * ('4'  - '3') + 'b' / 'a'; // j is 100
		int k = 'a'; // k is 95
		char c = 90; // c is 'Z'
		
		char x = 'a';
		char y = 'c';
		System.out.println(++x); // output is 'b'
		System.out.println(y++); // output is 'c'
		System.out.println(x - y); // output is -2, because (('b' = 96) - ('d' = 98)) = -2
		
		int lowerCaseLetter = (int)(Math.random() * ('z' - 'a')) + 'a';
		
		System.out.println((char) lowerCaseLetter + " " + lowerCaseLetter);
		
	
	}

}
