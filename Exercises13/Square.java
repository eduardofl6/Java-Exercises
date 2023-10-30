package Exercises13;

public class Square extends GeometricObjectComp implements Colorable{
    private double side;

    public Square(){
        this(0);
    }

    public Square(double side){
        this.side = side;
    }

    public void setSide(double side){
        if(side > 0)
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public void howToColor(){
        System.out.print("Color all four sides");
    }

    @Override
    public double getPerimeter(){
        return side * 4;
    }     

    @Override
    public double getArea(){
        return side * side;
    }
    
}
