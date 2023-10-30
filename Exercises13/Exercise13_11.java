package Exercises13;

public class Exercise13_11 {
    public static void main(String[] args)throws CloneNotSupportedException{
        Octagon ob1 = new Octagon(5);
        System.out.println("Octagon1: Area: " + ob1.getArea() + " Perimeter: " + ob1.getPerimeter());
        Octagon ob2 = (Octagon)ob1.clone();
        System.out.print("Comparing the two Octagons: " + ob1.compareTo(ob2));

    }
}
