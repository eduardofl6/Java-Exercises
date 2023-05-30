package Exercises10;

public class MyPoint {
    double x;
    double y;

    public MyPoint(){
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distance(double x1, double y1){
       return Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
    }

    public double distance(MyPoint point){
        return Math.sqrt((point.getX() - x) * (point.getX() - x) + (point.getY() - y) * (point.getY() - y));
    }
    
}
