package Exercises13;

public class Exercise13_5 {
    public static void main(String [] args){
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(1);

        if(Circle.max(c1, c2) == c2){
            System.out.print("Hello");
        }
    }
    
}
