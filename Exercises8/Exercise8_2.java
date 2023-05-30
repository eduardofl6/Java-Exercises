package Exercises8;

import java.util.Scanner;

public class Exercise8_2 {
    public static void main(String[] args){
             Scanner input = new Scanner(System.in);
             System.out.print("Enter a 4-by-4 matrix row by row: ");

        double[][] matrix = new double[4][4];

        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.print("Avarage of the elements in the major diagonal is " + averageMajorDiagonal(matrix));

        }

    

    public static double averageMajorDiagonal(double[][] m){
        double avarage = 0;
        int elements = 0;

        for(int i = 0; i <m.length;i++){
            avarage += m[i][i];
            elements++;
        }
        return avarage / elements;
    }
}
