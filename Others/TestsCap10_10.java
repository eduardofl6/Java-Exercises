import java.math.*;

public class TestsCap10_10 {
    public static void main(String[] args){
          Integer x = 3 + new Integer(5);
        int y = new Integer(3) + new Integer(4);
        System.out.println(x);

        System.out.println(factorial(4));


        String s1 = "Ola";

        String s2 = "Ola";

        System.out.println(s1 == s2);
        s2 += "t";
        System.out.println(s1 == s2);
        
        String test = String.valueOf(5.44);
        System.out.println(test.replaceFirst("4", "V"));
        System.out.println((String.valueOf(true)).replaceFirst("tr", "HH"));
        System.out.println("Welcome to java".replace('o', 'T'));


        String txt1 = "Welcome to Java";
        String txt2 = txt1.replace("o", "abc"); // Will print "Welcabcme tabc Java" because replace is returning a new string instance

        System.out.println("\n" + txt1);
        System.out.println(txt2);

        //Exercise 10.10.4

        s1 = " Welcome ";
        s2 = " welcome ";

        //a. Replace all occurrences of the character e with E in s1 and assign the new
        //string to s3.

        String s3 = s1.replaceAll("e", "E");

        //b. Split Welcome to Java and HTML into an array tokens delimited by a
        //space and assign the first two tokens into s1 and s2.
    
      String[] tokens = "Welcome to Java and HTML".split(" ");
      s1 = tokens[0];
      s2 = tokens[1];
      System.out.println("\n" + s1 + "\n" + s2);


      // 10.10.10

        }

    public static BigInteger factorial(long n) {
         BigInteger result = BigInteger.ONE;
         for (int i = 1; i <= n; i++)
         result = result.multiply(new BigInteger(i + ""));
        
         return result;
         }
}
