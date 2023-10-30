package Exercises13;

public class Exercise13_12 {
    public static void main(String [] args)throws CloneNotSupportedException{
        GeometricObject[] array = new GeometricObject[4];
        array[0] = new CircleComp(2);
        array[1] = new CircleComp(4);
        array[2] = new Rectangle(4,6);
        array[3] = new Rectangle(6,8);
    
        System.out.println(sumArea(array));

    }

    public static double sumArea(GeometricObject[] a){

        Double areas = 0.0;

        for(int i = 0; i < a.length;i++){
            areas += a[i].getArea();
        }
    
        return areas;
    }
}
