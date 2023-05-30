package Exercises10;

public class Circle extends GeometricObject {
    double radius;
    
    Circle(){
        this(1);
    }

    Circle(double x){
        radius = x;
    }

    public boolean equals(Circle circle) {
        return this.radius == circle.radius;
    }    

}
