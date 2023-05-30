package Exercises6;
import java.util.*;

public class Exercise6_31 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        long in = input.nextLong();
        String creditCard = "" + in;
        getSize(creditCard);
        System.out.print(creditCard + " is " + ((isValid(creditCard)) ? "valid": "invalid"));
        getPrefix(creditCard, 3);
    }

    /** Return true if the card number is valid */
public static boolean isValid(String number){

    //Part 1
    int part1 = 0;
    for(int i = number.length()-1, pair = 0; i >= 0; i--, pair++){
      
        if(pair % 2 != 0){
            part1 += getDigit(number.charAt(i));
        }
    }

    //Part 2
    int part2 = sumOfDoubleEvenPlace(number);
    // Remainder has higher precedence 
    if((part2 + part1) % 10 == 0 && (getSize(number) >= 13 && getSize(number) <= 16)){
        if(prefixMatched(number, 4) ||
           prefixMatched(number, 5) ||
           prefixMatched(number, 37) ||
           prefixMatched(number, 6) ){
            


               return true;
           }
    }
        return false;
    
}
/** Get the result from Step 2 */
public static int sumOfDoubleEvenPlace(String number){

    int sum2 = 0;
    for(int i = number.length()-1; i >= 0; i--){

        if(i % 2 != 0){
        sum2 += number.charAt(i) - '0';
        }
    }

    return sum2;
}
/** Return this number if it is a single digit, otherwise,
* return the sum of the two digits */
public static int getDigit(int number){
    number -= '0';

    int result = number * 2;
       
    if(result > 9){
        int x = result / 10;
        int y = result % 10;
        
        result = x + y;

    }
    

    return result;
}
/** Return sum of odd-place digits in number */
public static int sumOfOddPlace(long number){
    
    return 1;
}
/** Return true if the number d is a prefix for number */
public static boolean prefixMatched(String number, int d){
    int totalDigits = ("" + d).length();
    if(getPrefix(number, totalDigits) == d)
        return true;
    else
        return false;
}
/** Return the number of digits in d */
public static int getSize(String d){
    int size = d.length();
    return size;
}
/** Return the first k number of digits from number. If the
* number of digits in number is less than k, return number. */
public static long getPrefix(String number, int k){

    int digits = 0;
    for(int i = 0; i < k; i++){
        digits = 10 * digits + (number.charAt(i) - '0');
    }

    return digits;
}
}
