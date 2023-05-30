package Exercises6;

import java.nio.channels.WritableByteChannel;

public class Exercise6_22 {
    

    public static void main(String[] args){
        int number = 10;

        System.out.print("The square root of "+ number + " is " + sqrt(number));
    }

    public static double sqrt(long n){
        double root = 0;
        double lastGuess = 1;
        double nextGuess = 0;

        while((lastGuess - nextGuess ) > 0.0001){
            nextGuess = (lastGuess + n / lastGuess) / 2;
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }

        root = nextGuess;

        return root;
    }
}
