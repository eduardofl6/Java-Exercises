package Exercises8;
import java.net.MulticastSocket;
import java.util.Scanner;

public class Exercise8_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two matrix 3-by-3\n");
        System.out.print("Enter matrix1: ");

        double[][] matrix1 = new double[3][3];
        for(int i = 0; i < matrix1.length;i++){
            for(int j = 0; j < matrix1[i].length; j++){
                matrix1[i][j] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");    
        double[][] matrix2 = new double[3][3];
        for(int i = 0; i < matrix2.length;i++){
            for(int j = 0; j < matrix2[i].length; j++){
                matrix2[i][j] = input.nextDouble();
            }
        }

        double[][] multiply = multiplyMatrix(matrix1,matrix2);

    for(int i = 0; i < multiply.length;i++){

        System.out.format("%.1f %.1f %.1f   ",matrix1[i][0], matrix1[i][1],matrix1[i][2]);
        if(i == 1){
            System.out.print("+   ");
        }
        System.out.format("%.1f %.1f %.1f   ",matrix2[i][0], matrix2[i][1],matrix2[i][2]);
        if(i == 1){
            System.out.print("=   ");
        }
        System.out.format("%.1f %.1f %.1f   ",multiply[i][0], multiply[i][1],multiply[i][2]);

        System.out.println();
    }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        
        
        for(int i = 0; i < a.length; i++){
            if(a[i].length != b[i].length || a.length != b.length){
                System.out.print("Difference between matrices size");
                return new double[0][0];
            }


        }

        System.out.println("The two matrices are added as follows");
        double[][] result = new double[a.length][b[1].length];
       //Multiplying
        for(int i = 0; i < result.length;i++){

            for(int v = 0; v < result[i].length;v++){
                result[i][v] = a[i][0] * b[0][v] + 
                               a[i][1] * b[1][v] + 
                               a[i][2] * b[2][v]  ;
            }
        }
        //Printing

        return result;
    }
    
}
