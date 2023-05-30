package Exercises8;
import java.util.*;
public class Exercise8_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 3-by-4 matrix row by row: ");
        double[][] matrix = new double[3][4];

        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        for(int i = 0; i < 3;i++){
            System.out.println("Sum of elements at row " + i + " is " + sumRow(matrix, i));
        }
    }

    public static double sumRow(double[][] m, int rowIndex){
        double sum = 0;
        for(int i = 0; i < m[rowIndex].length;i++){
            sum += m[rowIndex][i];
        }
        return sum;
    }
}
