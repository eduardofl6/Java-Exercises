package Exercises11;
import java.util.*;

import Exercises10.MyPoint;

public class Exercise11_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int number = input.nextInt();

        ArrayList<MyPoint> list = new ArrayList<>();

        for(int i = 0; i < number;i++){
            MyPoint point = new MyPoint(input.nextDouble(),input.nextDouble());
            list.add(point);
        }

        list.add(list.get(0));

        double area = calculateAreaPolygon(list);


        System.out.print("The total area is " + area);
    }


    public static double calculateAreaPolygon(ArrayList<MyPoint> list){
        double row1 = 0;
        double row2 = 0;


        for(int i = 0; i < list.size()-1;i++){
            row1 += list.get(i).getX() * list.get(i+1).getY();
            row2 += list.get(i).getY() * list.get(i+1).getX();
        }


        return -(row1 - row2) / 2;
    }

}
