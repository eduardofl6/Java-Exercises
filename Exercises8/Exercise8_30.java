package Exercises8;
import java.util.*;

public class Exercise8_30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a00,a01,a10,a11,b0 and b1: ");
        double[][] a = new double[2][2];
        double[] b = new double[2];

        for(int i = 0; i < a.length;i++){
            for(int v = 0; v < a[i].length;v++){
                a[i][v] = input.nextDouble();
            }
        }
        
        for(int i = 0; i < b.length;i++){
            b[i] = input.nextDouble();
        }
        double[] solution = linearEquation(a, b);
        System.out.print("x is " + solution[0] + " and y is " + solution[1]);
    }

    public static double[] linearEquation(double[][] a, double[] b){
        double[] solution = new double[2];

        double equation0 = (a[0][0] * a[1][1]) - (a[0][1] * a[1][0]);

        if(equation0 == 0){
            System.out.println("\nThe equation has no solution.");
            return solution ;
        }


        solution[0] = (((b[0] * a[1][1]) - (b[1] * a[0][1])) / equation0);
        solution[1] = ((b[1] * a[0][0]) - (b[0] * a[1][0])) / equation0;

        return solution;
    }
}
