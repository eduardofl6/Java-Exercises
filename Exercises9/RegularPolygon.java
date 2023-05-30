package Exercises9;

public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    RegularPolygon(int nSides, double lSides){
        n = nSides;
        side = lSides;
        x = 0;
        y = 0;
    }

    RegularPolygon(int nSides, double lSides, double x, double y){
        n = nSides;
        side = lSides;
        this.x = x;
        this.y = y;
    }

    public int getNumberOfSides(){
        return n;
    }

    public void setNumberOfSides(int nSides){
        n = nSides;
    }

    public double getSidesLength(){
        return side;
    }

    public void setSidesLength(double length){
        side = length;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getPerimeter(){
        return n * side;
    }

    public double getArea(){
        return (n * Math.pow(side,2)) / (4 * Math.tan(Math.PI / n));        
    }

}
