package Exercises8;
import java.lang.reflect.Modifier;
import java.util.*;

public class Exercise8_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];
        explore(matrix);

    }

    public static void explore(int[][] matrix){

        for(int i = 0; i < matrix.length;i++){
            for(int v = 0; v < matrix[i].length;v++){
                matrix[i][v] = (int)(Math.random() * 2);
                System.out.print(matrix[i][v] + " ");
            }
            System.out.println();
        }

        boolean sameRow = false;

        for(int i = 0; i < matrix.length;i++){
            int value = matrix[i][0];
            for(int v = 1; v < matrix[i].length;v++){
                if(value != matrix[i][v]){
                    value = 2;
                }
            }
            if(value < 2){
                sameRow = true;
                System.out.println("All " + value + "s on row " + i);
            }
        }
        if(!sameRow)
            System.out.print("No same numbers on a row\n");

        boolean sameColum = false;

        for(int i = 0; i < matrix[0].length;i++){
            
          int value = matrix[0][i];
            for(int v = 1; v < matrix.length;v++){
                if(value != matrix[v][i]){
                     value = 2;
                }
            }
            if(value < 2){
                sameColum = true;
                System.out.println("All " + value + "s on column " + i);
            }
        }
        if(!sameColum)
        System.out.print("No same numbers on a column\n");

        boolean majorDiagonal = true;
        boolean subDiagonal = true;

        for(int i = 1; i < matrix.length;i++){
            if(matrix[i][i] != matrix[0][0]){
                majorDiagonal = false;
            }
            if(matrix[0][matrix.length -1] != matrix[i][matrix.length -1 - i]){
                subDiagonal = false;
            }

        }

        if(majorDiagonal){
            System.out.println("All " + matrix[0][0] + "s on the major diagonal");
        }else
        System.out.println("No same numbers on the major diagonal");

        if(subDiagonal){
            System.out.println("All " + matrix[0][matrix.length-1] + "s on the sub diagonal");
        }else
        System.out.println("No same numbers on the sub diagonal");

        
    }
}
