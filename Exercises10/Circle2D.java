package Exercises10;

public class Circle2D {
    private double x;
    private double y;
    private double radius;


    Circle2D(){
        this(0.0,0.0,1.0);
    }

    Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getRadius(){
        return radius;
    }    

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter(){
        return Math.PI * (radius * 2);
    }

    public boolean  contains(double x, double y){
        double distance = ( new MyPoint(this.x,this.y)).distance(x,y);
        if(distance <= radius)
        return true;

        return false;
    }

    public boolean  contains(Circle2D circle){
        if(!this.contains(circle.getX(),circle.getY()))
            return false;

        double distance =  ( new MyPoint(this.x,this.y)).distance(circle.getX(),circle.getY());
        if((radius - distance) < circle.radius)
            return false;
        
        return true;

    }

    public boolean overlaps(Circle2D circle){
        double distance =  ( new MyPoint(this.x,this.y)).distance(circle.getX(),circle.getY());

        if((radius + circle.getRadius()) > distance)
            return true;

        return false;
    }
    
}
