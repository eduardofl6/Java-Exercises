package Exercises8;
import java.util.*;

public class Exercise8_19 {
    public static void main(String[] arsg){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns: ");
        int rows = input.nextInt();
        int column = input.nextInt();

        int[][] array = new int[rows][column];

        System.out.println("Enter the values for an array of " + rows + "-by-" + column);
        for(int i = 0; i < array.length;i++){
            for(int v = 0; v < array[i].length;v++){
                array[i][v] = input.nextInt();
            }
        }
        System.out.print(isConsecutiveFour(array));
    }


    public static boolean isConsecutiveFour(int[][] values){
        if(values[0].length >= 3){
            
            for(int i = 0; i < values.length;i++){
                for(int v = 0; v < values[i].length;v++){
                    if(values[i].length - v >= 3){
                        if(values[i][v] == values[i][v+1] && values[i][v] == values[i][v+2] && values[i][v] == values[i][v+3] )
                        return true;
                        
                    }
                    
                    
                }
            }
            
        }
        if(values.length >= 3){
            for(int i = 0; i < values.length;i++){
                for(int v = 0; v < values[i].length;v++){
                    if(values.length - i >= 4){
                        if(values[i][v] == values[i+1][v] && values[i][v] == values[i+2][v] && values[i][v] == values[i+ 3][v] )
                        return true;
                    }
                }
        }
    }
    if(values[0].length >= 3 && values.length >= 3){
        for(int i = 0; i < values.length;i++){
            for(int v = 0; v < values[i].length;v++){
                if(values[i].length - v >= 3 && values.length - i >= 3){
                    if(values[i][v] == values[i+1][v+1] && values[i][v] == values[i+2][v+2] && values[i][v] == values[i+ 3][v+3] )
                    return true;
                }
                if(v >= 3 && values.length - i >= 3){
                    //i still increase because we're going down in the array
                    if(values[i][v] == values[i+1][v-1] && values[i][v] == values[i+2][v-2] && values[i][v] == values[i + 3][v - 3] )
                    return true;
                }
            }
    }

    }
    return false;
    }
}


