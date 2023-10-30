package Exercises13;

public class Exercise13_7 {
    
    public static void main(String[] args) throws Exception{
     
        GeometricObjectComp[] array = new GeometricObjectComp[5];
        array[0] = new Triangle(2.0,2.0,2.0);
        array[1] = new Circle(1);
        array[2] = new Square(4);
        array[3] = new Square(7);
        array[4] = new Circle(5.0);

        for(int i = 0; i < array.length;i++){
            System.out.print(array[i].getArea() + " " );

            if(array[i] instanceof Square){
               ((Square)array[i]).howToColor();
            }
            System.out.println();
        }

        CircleComp a = new CircleComp(1);

    }
}
