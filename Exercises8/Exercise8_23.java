package Exercises8;
import java.util.*;
public class Exercise8_23 {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter a 6−by−6 matrix row by row:\n");
        int[][] matrix = new int[6][6];
        
        for(int i = 0; i < matrix.length;i++){
            for(int v = 0 ; v < matrix[i].length;v++){
                matrix[i][v] = input.nextInt();
            }
        }
        
        flipped(matrix);
    }

    public static void flipped(int[][] matrix){
        int firstRow = 0;
        for(int i = 0,even = 0; i < matrix.length;i++,even = 0){
            
            for(int v = 0; v < matrix[i].length;v++){
                if(matrix[i][v] == 1)
                    even++;
            }
            if(even % 2 != 0){
                firstRow = i;
            }
        }

        int firstColumn = 0;
        for(int i = 0,even = 0; i < matrix[0].length;i++,even = 0){
            for(int v = 0; v < matrix.length;v++){
                if(matrix[v][i] == 1)
                even++;
            }
            if(even % 2 != 0){
                firstColumn = i;
            }
        }
        System.out.print("The flipped cell is at (" +firstRow+", " + firstColumn + ")");
    }
}
