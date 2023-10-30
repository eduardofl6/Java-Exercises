package Exercises13;

public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable{
    private double side;

    public Octagon(){
        this(0);
    }

    public Octagon(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        if(side > 0)
            this.side = side;
    }

    @Override
    public double getArea(){
        return (2 +  4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter(){
        return side * 8;
    }

    @Override
    public int compareTo(Octagon ob){
        if(this.getArea() > ob.getArea())
            return 1;
        else if(this.getArea() < ob.getArea())
            return -1;
        else 
            return 0;
    }

    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    
}
