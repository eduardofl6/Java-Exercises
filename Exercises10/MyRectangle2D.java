package Exercises10;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;


    MyRectangle2D(){
        this(0,0,1,1);
    }

    MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return width * height;  
    }

    public double getPerimeter(){
        return (height + width) * 2;
    }

    public boolean contains(double x, double y){
        MyPoint point = new MyPoint(x,y);

        if(point.distance(this.x,this.y) <= width / 2 && point.distance(this.x,this.y) <= height / 2 )
            return true;

        return false;
    }

    public boolean contains(MyRectangle2D r){
        MyPoint point = new MyPoint(r.getX(),r.getY());
    
        double distanceX = point.distance(x,y);
        if((width/2) - distanceX < r.getWidth() / 2 || (height/2) - distanceX < r.getHeight() / 2)
            return false;

        return true;
    }






































    // skipped

}
