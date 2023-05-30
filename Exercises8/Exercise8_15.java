package Exercises8;
import java.util.*;

public class Exercise8_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five points: ");
        
        double[][] matrix = new double[5][2];

        for(int i = 0; i < matrix.length;i++){

            for(int v = 0; v < matrix[i].length;v++){
                matrix[i][v] = input.nextDouble();
            }
        }

        boolean sameLine = sameLine(matrix);
        if(sameLine){
            System.out.print("The five points are on the same line");
        }else
            System.out.print("The five points are not on the same line");
    }    

    public static boolean sameLine(double[][] points){
    if(onTheSameLine(points[0][0],points[0][1],points[1][0],points[1][1],points[2][0],points[2][1])){
        if(onTheSameLine(points[2][0],points[2][1],points[3][0],points[3][1],points[4][0],points[4][1])){
            if(onTheSameLine(points[0][0],points[0][1],points[2][0],points[2][1],points[4][0],points[4][1]))
            return true;
        }
    }

        return false;
    }

    public static boolean onTheSameLine(double x0, double y0,
    double x1, double y1, double x2, double y2){
    double sides = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);

    if(sides == 0)
    return true;
    else
    return false;
    }
}
