package Exercises11;
import java.util.*;

public class Exercise11_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer m: ");
        int integer = input.nextInt();

        System.out.println("The smallest number n for m * n to be a perfect square is 15 m * n is " + mForN(integer) + " m * n is " + mForN(integer) * integer);

    }

    public static int mForN(int x){
        ArrayList<Integer> count = new ArrayList<>();
        
        int prime = 2;

        for(; x != 1;){
          
            if(isPrime(prime) && x % prime == 0){
                count.add(prime);
                x /= prime;
            }else{
                prime++;
            }
        }

        int[] odds = new int[prime+1];

        for(int i = 0; i < count.size();i++){
            odds[count.get(i)]++;
        }

        int result = 1;
        for(int i = 0; i < odds.length;i++){
            if(odds[i] > 0 && odds[i] % 2 != 0){
                result *= i;
            }
        }


        return result;
    }

    public static boolean isPrime(int x){

        for(int i = x+1; i < x;i++){
            if(x % i == 0){
                return false;
            }
        }

        return true;
    }
}
