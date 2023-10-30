package Exercises13;
import java.util.Scanner;

public class Exercise13_1 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three sides of a triangle:");
        Triangle triangle = new Triangle();

        triangle.setSide1(input.nextDouble());
        triangle.setSide2(input.nextDouble());
        triangle.setSide3(input.nextDouble());
        
        System.out.print("Enter a color for the triangle: ");
        triangle.setColor(input.next());

        System.out.print("A boolean value to decide if the triangle if filled(true/false):");
        String filled = input.next().toLowerCase();

        if(filled.compareTo("true") == 0){
            triangle.setFilled(true);
        }else
            triangle.setFilled(false);

        System.out.format("Triangle's information:\nArea: %.2f\nPerimeter: %.2f\nColor: %s\nFilled: %b",triangle.getArea(),triangle.getPerimeter(),triangle.getColor(),triangle.isFilled());

    }
}
