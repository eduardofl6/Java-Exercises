package Exercises8;
import java.util.*;

public class Exercise8_5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two matrix 2-by-2\n");
        System.out.print("Enter matrix1: ");

        double[][] matrix1 = new double[2][2];
        for(int i = 0; i < 2;i++){
            for(int j = 0; j < 2; j++){
                matrix1[i][j] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");    
        double[][] matrix2 = new double[2][2];
        for(int i = 0; i < 2;i++){
            for(int j = 0; j < 2; j++){
                matrix2[i][j] = input.nextDouble();
            }
        }

        double[][] sum = addMatrix(matrix1,matrix2);
    }

    public static double[][] addMatrix(double[][] a, double[][] b){
        
        
        for(int i = 0; i < a.length; i++){
            if(a[i].length != b[i].length || a.length != b.length){
                System.out.print("Difference between matrices size");
                return new double[0][0];
            }
        }

        System.out.println("The two matrices are added as follows");
        double[][] result = new double[a.length][b[1].length];
       //Adding
        for(int i = 0; i < a.length;i++){

            for(int v = 0; v < b[i].length;v++){
                result[i][v] = a[i][v] + b[i][v];
            }
        }
        //Printing
        System.out.print(a[0][0] + " " + a[0][1] + "   " + b[0][0] + " " + b[0][1] + "   " +  result[0][0] + " " + result[0][1] +
        "\n" + a[1][0] + " " + a[1][1] + " + "  + b[1][0] + " " + a[1][1]  + " = " +result[1][0] + " " + result[1][1] );
        return result;
    }
}
