package Exercises13;

public class Triangle extends GeometricObjectComp {

    private double side1 ;
    private double side2 ;
    private double side3 ;

    public Triangle() throws Exception{
        this(1.0,1.0,1.0);
    }

    public Triangle(double side1, double side2,double side3) throws Exception{
        if( side1 + side2 <= side3 ||side1 + side3 <= side2 ||side3 + side2 <= side1)
        throw new Exception("IllegalTriangleException");

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){
        return side1;
    }

    public void setSide1(double x){
        side1 = x;
    }

    public double getSide2(){
        return side2;
    }

    public void setSide2(double x){
        side2 = x;
    }

    public double getSide3(){
        return side3;
    }

    public void setSide3(double x){
        side3 = x;
    }
    @Override
    public double getArea(){
        double s = (side1 + side2 + side3) / 2.0;
		double area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));

        return area;
    }
    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    
}
