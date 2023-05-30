package Exercises12;
import java.util.*;

public class Exercise12_02 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April",
        "May", "June","July", "August", "September", "October",
        "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        try{
            System.out.print("Enter a integer between 1 and 12: ");

            int integer = input.nextInt();

            System.out.print("Corresponding month and its total days " + months[integer] + " " + dom[integer] +  " days");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.print("Wrong number");
        }


    } 
}
