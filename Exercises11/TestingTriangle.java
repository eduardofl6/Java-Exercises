package Exercises11;
import java.util.*;


public class TestingTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);        

        System.out.print("Enter three sides of a triangle: ");
        double[] sides = {input.nextDouble(),input.nextDouble(),input.nextDouble()};

        input.nextLine();
        System.out.print("Enter a color for the triangle: ");
        String color = input.nextLine();

        System.out.print("Enter a boolean value to decide if the triangle is filled: ");
        boolean filled = ((input.nextLine()).toLowerCase().compareTo("true") == 0) ? true : false;

        Triangle triangle = new Triangle(sides[0],sides[1],sides[2]);

        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.print("The triangle has an area of: " + triangle.getArea() + "\n The perimeter is: " + triangle.getPerimeter() + "\n The color is: " + triangle.getColor() + 
        "\nThe triangle is " + ((triangle.isFilled()) ? "" : "not") + " filled");

    }
}
