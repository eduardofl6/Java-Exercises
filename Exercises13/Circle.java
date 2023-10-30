package Exercises13;

public class Circle extends GeometricObjectComp {
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

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

}
