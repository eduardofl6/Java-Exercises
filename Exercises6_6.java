
public class Exercises6_6 {

	public static void main(String[] args) {
		

		System.out.println("gcd(4, 6) is " + gcd(4, 6));
		System.out.print("isPrime(25) is " + isPrime(25));
		
	}
	
	 public static int gcd(int n1,int n2) {
		 int gcd = 1; // Initial gcd is 1
		 int k = 2; // Possible gcd
		
		 while (k <= n1 && k <= n2) {
			  if (n1 % k == 0 && n2 % k == 0)
		 gcd = k; // Update gcd
		 k++;
		 	}
		
		 return gcd; // Return gcd
		 }

	  /** Check whether number is prime */
	  public static boolean isPrime(int number) {
		
		  for (int divisor = 2; divisor <= number / 2; divisor++) {
			
			 if (number % divisor == 0) { // If true, number is not prime
				  return false; // Number is not a prime
			 }
		  }
		  return true;
	  }
}
