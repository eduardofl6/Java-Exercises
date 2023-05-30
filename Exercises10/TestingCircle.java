package Exercises10;

public class TestingCircle {
    public static  void main(String[] args){
       Circle2D c1 =  new Circle2D(2, 2, 5.5);

       System.out.format("Area: %.2f\nPerimeter: %.2f\n",c1.getArea(),c1.getPerimeter());
       System.out.format("%b\n%b\n%b",c1.contains(3,3),c1.contains(new Circle2D(4, 5, 10.5)),c1.overlaps(new Circle2D(3, 5, 2.3)));


    }
}
