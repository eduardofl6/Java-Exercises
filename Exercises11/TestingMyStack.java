package Exercises11;
import java.util.*;

public class TestingMyStack {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        MyStack stack = new MyStack();
        System.out.println("Enter five strings: ");

        for(int i = 0; i < 5; i++){
            stack.push(input.nextLine());
        }

        System.out.println("In reverse order: " );
        for(;stack.getSize() > 0;){
            System.out.println(stack.pop());
        }

    }
}