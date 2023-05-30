package Exercises8;
import java.util.*;

public class Exercise8_33 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        double[][] points = new double[6][2];

        System.out.print("Enter 6 points: ");
        for(int i = 0; i < points.length;i++){

            for(int v = 0; v < points[i].length;v++){
                points[i][v] = input.nextDouble();
            }
        }
        double[] result = getRightmostLowestPoint(points);

        System.out.format("The righmost lowest point is (%.1f, %.1f)",result[0],result[1]);
    }

    public static double[] getRightmostLowestPoint(double[][] points){
        double lowest = points[0][1];
        double lowestIndex = 0;
        double maxRight = 0;
        double maxRightIndex = 0;

        for(int i = 1; i < points.length;i++){
            if(points[i][1] <= lowest){
                lowest = points[i][1];
                lowestIndex = i;

                maxRight = points[i][0];
                maxRightIndex = i;
            }
            
        }

        for(int i = 1; i < points.length;i++){
            if(points[i][1] == lowest){
                if(points[i][0] > maxRight){
                    maxRight = points[i][0];
                    maxRightIndex = i;
                }
            }
        }
        double[] result = {maxRight,lowest};
        return result;
    }


}
