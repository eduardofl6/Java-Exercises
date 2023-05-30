package Exercises8;
import java.util.Scanner;

public class Exercise8_26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a 4-by4 matrix row by row: ");
        double[][] matrix = new double[4][4];
        
        for(int i = 0; i < matrix.length;i++){
            for(int v = 0; v < matrix[i].length;v++){
                matrix[i][v] = input.nextDouble();
            }
        }

        double[][] secondMatrix = sortRows(matrix);
        
        System.out.print("\n\nThe row sorted:\n");
        for(int i = 0; i < secondMatrix.length;i++){
            for(int v = 0; v < secondMatrix[i].length;v++){
                System.out.print(secondMatrix[i][v] + " ");
            }
            System.out.println();
        }
    }


    public static double[][] sortRows(double[][] m){
        double[][] matriz = new double[m.length][m[0].length];
       
        for(int i = 0; i < m.length;i++){
            for(int v = 0; v < m[i].length;v++){
                matriz[i][v] = m[i][v];
            }
        }

        for(int i = 0; i < matriz.length;i++){
            java.util.Arrays.sort(matriz[i]);
        }

        return matriz ;
    }
}
