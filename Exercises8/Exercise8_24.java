package Exercises8;
import java.util.*;
public class Exercise8_24 {
     public static void main(String[] args) {
        // Read a Sudoku solution
        int[][] grid = readASolution();
    
        System.out.print((tester(grid) ? "valid" : "invalid") + " solution");
         }
        
         /** Read a Sudoku solution from the console */
         public static int[][] readASolution() {
         // Create a Scanner
         Scanner input = new Scanner(System.in);
        
         System.out.println("Enter a Sudoku puzzle solution:");
         int[][] grid = new int[9][9];
         for (int i = 0; i < 9; i++)
         for (int j = 0; j < 9; j++)
         grid[i][j] = input.nextInt();
        

         return grid;
         }

         public static boolean tester(int[][] grid){
            int[] array = new int[9];

            for(int i = 0; i < grid.length;i++){
                clean(array);
                for(int v = 0; v < grid[i].length;v++){
                    if(grid[i][v] >= 1 && grid[i][v] <= 9){
                        if(array[(grid[i][v])-1] == 0 ){
                            array[(grid[i][v])-1] = grid[i][v];
                        }else{
                            return false;
                        }
                    }

                }

            }

            for(int i = 0; i < grid[0].length;i++){

                clean(array);
                for(int v = 0; v < grid.length;v++){
                    if(grid[v][i] >= 1 && grid[v][i] <= 9){
                        if(array[(grid[i][v])-1] == 0 ){
                            array[(grid[i][v])-1] = grid[v][i];
                        }else{
                            return false;
                            }
                    }
                }
            }
            for(int i = 0; i < grid.length;i+=3){
            
                for(int v = 0; v < grid[i].length;v+=3){
                    clean(array);
                    for(int t = i; t < (i + 3);t++){
                            // Important to use (i+3) and (v + 3) because t and e will continually increase
                        for(int e = v; e < (v + 3) && e < 9;e++){
                            if(grid[t][e] >= 1 && grid[t][e] <= 9){
                                if(array[(grid[t][e])-1] == 0 ){
                                    array[(grid[t][e])-1] = grid[t][e];
                                }else{
                                    return false;
                                    }
                            }
                        }

                    }

                }

            }

            return true;
            }
        
        

         public static void clean(int[] array){
            for(int i = 0; i < array.length;i++){
                array[i] = 0;
            }

         }
}