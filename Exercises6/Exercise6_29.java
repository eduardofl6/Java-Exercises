package Exercises6;

public class Exercise6_29 {
    
    public static void main(String[] args){
        int newprime = 0;
        int lastprime = 0;

        for(int i = 3; i < 1200; i++){
            //You cannot put 0 as else in newprime because lastprime ill take it as prime, becoming 0,then the two values won't meet each other
            newprime = (isPrime(i) == true) ? i : 4;
            if(newprime - lastprime == 2){
                System.out.print("("+lastprime+","+newprime+")\n");
            }
          
            lastprime = (isPrime(newprime)) ? newprime : lastprime;
        }
    }    

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
        if (number % divisor == 0) { // If true, number is not prime
        return false; // Number is not a prime
        }
        }
       
        return true;
    }
}
