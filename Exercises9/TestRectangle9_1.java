package Exercises9;

public class TestRectangle9_1 {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);

        System.out.format("Rectangle1:\nWidth: %.2f\nHeight: %.2f\nArea: %.2f\nPerimeter: %.2f",rectangle1.width,rectangle1.height,rectangle1.getArea(),rectangle1.getPerimeter());
        System.out.format("\n\nRectangle2:\nWidth: %.2f\nHeight: %.2f\nArea: %.2f\nPerimeter: %.2f",rectangle2.width,rectangle2.height,rectangle2.getArea(),rectangle2.getPerimeter());

    }
}
