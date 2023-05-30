package Exercises8;
import java.util.*;

public class Exercise8_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] matrix = new double[3][3];

        for(int i = 0; i < matrix.length;i++){

            for(int v = 0; v < matrix[i].length;v++){
                matrix[i][v] = input.nextDouble();
            }
        }
        System.out.print("It is " + (isMarkovMatrix(matrix) ? "" : "not ") + "a Markov matrix");
    }

    public static boolean isMarkovMatrix(double[][] m){
        for(int i = 0; i < m[0].length;i++){
            double sum = 0;
            for(int v = 0; v < m.length;v++){
               if(m[v][i] >= 0)
                sum += m[v][i];
                else
                return false;
            }
            if(sum != 1.00){
                return false;
            }
        }

        return true;
    }

}
