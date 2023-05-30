package Exercises8;
import java.util.*;
public class Exercise8_32 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");

        double[][] points = new double[3][2];

        for(int i = 0; i < points.length;i++){

            for(int v = 0; v < points[i].length;v++){
                points[i][v] = input.nextDouble();
            }
        }

        double areaTriangle = getTriangleArea(points);

        if(areaTriangle == 0){
            System.out.print("The three points are on the same line");
        }else
            System.out.print("The triangle area is (" + areaTriangle + ")");
    }

    public static double getTriangleArea(double[][] points){
        double[] sides = new double[3];

        sides[0] = Math.sqrt((Math.pow(points[1][0] - points[0][0],2) + Math.pow(points[1][1] - points[0][1],2)));
		sides[1] = Math.sqrt((Math.pow(points[2][0] - points[1][0],2) + Math.pow(points[2][1] - points[1][1],2)));
		sides[2] = Math.sqrt((Math.pow(points[2][0] - points[0][0],2) + Math.pow(points[2][1] - points[0][1],2)));

        double s = (sides[0] + sides[1] + sides[2]) / 2.0;
		
		double area = Math.pow((s * (s - sides[0]) * (s - sides[1]) * (s - sides[2])),0.5);
        if(onTheSameLine(points[0][0],points[0][1],points[1][0],points[1][1],points[2][0],points[2][1]))
        return 0;
        return area;

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
