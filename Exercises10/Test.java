package Exercises10;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        GeometricObject object = new GeometricObject();
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(1);

        System.out.print(circle1.equals(circle2));

        ArrayList<Double> list = new ArrayList<>();
list.add(1.0);
    }
    
    }

    class A {
    
    int i = 7;
    
    public A() {
    setI(20);
    System.out.println("i from A is " + i);
    }
    
    public void setI(int i) {
    this.i = 2 * i;
    }}
    
    class B extends A {

    public B() {
    System.out.println("i from B is " + i);
    }
    
    public void setI(int i) {
    this.i = 3 * i;
    }
    }
