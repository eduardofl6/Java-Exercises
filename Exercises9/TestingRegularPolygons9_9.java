package Exercises9;

public class TestingRegularPolygons9_9 {
    public static void main(String[] args){
        RegularPolygon polygonOne = new RegularPolygon();
        RegularPolygon polygonTwo = new RegularPolygon(6 , 4);
        RegularPolygon polygonThree = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Perimeter1: " + polygonOne.getPerimeter() + " Area1: " + polygonOne.getArea());
        System.out.println("Perimeter2: " + polygonTwo.getPerimeter() + " Area2: " + polygonTwo.getArea());
        System.out.println("Perimeter3: " + polygonThree.getPerimeter() + " Area3: " + polygonThree.getArea());
    }    
}
