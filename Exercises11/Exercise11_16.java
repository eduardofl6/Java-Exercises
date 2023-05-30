package Exercises11;
import java.util.*;

public class Exercise11_16 {
    public static void main(String[] args) {
         int number1 = (int)(Math.random() * 10);
         int number2 = (int)(Math.random() * 10);
        
         // Create a Scanner
         Scanner input = new Scanner(System.in);
        
         System.out.print(
         "What is " + number1 + " + " + number2 + "? ");
         int answer = input.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
         while (number1 + number2 != answer) {
             
             if(list.contains(answer))
             System.out.println("You already entered " + answer);
             
             System.out.print("Wrong answer. Try again. What is "
             + number1 + " + " + number2 + "? ");
             list.add(answer);
             answer = input.nextInt();
            }
        
         System.out.println("You got it!");
         }
         }
