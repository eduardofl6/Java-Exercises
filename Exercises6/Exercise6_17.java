package Exercises6;
import java.util.*;

public class Exercise6_17 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = input.nextInt();

        printMatrix(n);
    }

    //Way 1
    public static void printMatrix(int n){

        int random = 0;

        for(int i = 0; i <= n * n - 1; i++){
            if(i % n == 0){
                System.out.println();
            }
            System.out.print((random = (int)(Math.random() * 2)) + " ");

        }

    }
    //Way2
    public static void printMatrix2(int n){

        int random = 0;

        for(int i = 0; i < n ; i++){

            for(int j = 0; j < n; j++){
                System.out.print((random = (int)(Math.random() * 2)) + " ");
            }
            
            System.out.println();
        }

    }
}
