package Exercises9;

// Exercise 9.1

public class Rectangle {
     double height;
      double width;

    Rectangle (){
        height = 1;
        width = 1;
    }

    Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

}
