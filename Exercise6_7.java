
public class Exercise6_7 {

	public static void main(String[] args) {

		
		System.out.println(hexCharToDecimal('B'));
		System.out.println(hexCharToDecimal('7'));
		System.out.println(hexToDecimal("A9"));
		
	}

	 public static int hexToDecimal(String hex) {
		 int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
		char hexChar = hex.charAt(i);
		decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);

		 }
		
		 return decimalValue;
		 }
		
		 public static int hexCharToDecimal(char ch) {
		 if (ch >= 'A' && ch <= 'F')
		 return 10 + ch - 'A';
		 else // ch is '0', '1', ..., or '9'
		 return ch - '0';
		 }
		 
}
