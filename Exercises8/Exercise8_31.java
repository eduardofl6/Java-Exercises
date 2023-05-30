package Exercises8;
import java.util.*;

public class Exercise8_31 {
        public static void main(String[] args){
            Scanner input =  new Scanner(System.in);

            System.out.print("Enter four points: ");

            double[][] points = new double[4][2];

            for(int i = 0; i < points.length;i++){

                for(int v = 0; v < points[i].length;v++){
                    points[i][v] = input.nextDouble();
                }
            }
            double[] result = getIntersectingPoint(points);
            if(result == null){
                System.out.println("The two lines are parallel");
            }else
            System.out.println("The intersecting point is at (" + result[0] + ", " + result[1] + ")");

        }            

        public static double[] getIntersectingPoint(double[][] points){
            double[] result = new double[2];

            double a = points[0][1] - points[1][1];
            double b = -(points[0][0] - points[1][0]);
            double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
            double c = points[2][1] - points[3][1];
            double d = -(points[2][0] - points[3][0]);
            double f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

            if (a * d != b * c) {
                result[0] = (e * d - b * f) / (a * d - b * c);
                result[1] = (a * f - e * c) / (a * d - b * c);
                return result;
            }

            return null;
        }
}
