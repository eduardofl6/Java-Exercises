
public class Exercise4_4 {

	public static void main(String[] args) {
	
		//4.4.3
		System.out.println("1" + 1);
		System.out.println('1' + 1);
		System.out.println("1" + 1 + 1);
		System.out.println("1" + (1 + 1));
		System.out.println('1' + 1 + 1);
		//In case of single quotes, it's value isn't a string, and isn't going to be concatenated, we'll receive 49 ( value form ASCII)
		
		//4.4.4
		System.out.println(1 + "Welcome " + 1 + 1);
		System.out.println(1 + "Welcome " + (1 + 1));
		System.out.println(1 + "Welcome " + ('\u0001' + 1)); // 2 because u001 is equal to string 1 then you concatenate it with 1
		System.out.println(1 + "Welcome " + 'a' + 1);
		
		//4.4.5
		String s1 = " Welcome ";
		String s2 = " welcome ";
		
		boolean isEqual = s1.equals(s2);
		boolean isEqual2 = s1.equalsIgnoreCase(s2);
		
		int x = s1.compareTo(s2);
		int x2 = s1.compareToIgnoreCase(s2);
		
		boolean b1 = s1.startsWith("AAA");
		boolean b2 = s1.endsWith("AAA");
		
		int x3 = s1.length();
		
		char x4 = s1.charAt(0);
		
		String s3 = s1 + s2;
		
		String substring = s1.substring(1);
		String substring1 = s1.substring(1,4);
		
		String s31 = s1.toLowerCase();
		String s32 = s1.toUpperCase();
		
		String s33 = s1.trim();
		
		int occurrence1 = s1.indexOf("e");
		
		int occurrence2 = s1.lastIndexOf("abc");
		
		//4.4.6
		
		int i = 123321;
		
		int numberDigits =(i + "" ).length();
		
		System.out.println(numberDigits);
		
		double i1 = 123.123;
		
		int numberDigits1 = (i1 + "").length();
		
		System.out.println(numberDigits1);
		
	}

}
