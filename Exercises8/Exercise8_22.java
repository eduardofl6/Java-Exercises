package Exercises8;

public class Exercise8_22 {
    public static void main(String[] args){
        int[][] matrix = new int[6][6];

        for(int i = 0; i < matrix.length;i++){
            for(int v = 0; v < matrix[i].length;v++){
                matrix[i][v] = (int)(Math.random() * 2);
                System.out.print(matrix[i][v] + " ");
            }
            System.out.println();
        }
        hasEven(matrix);
    }

    public static void hasEven(int[][] matrix){
        boolean everyRow = true;
        for(int i = 0,even = 0; i < matrix.length;i++,even = 0){
            
            for(int v = 0; v < matrix[i].length;v++){
                if(matrix[i][v] == 1)
                    even++;
            }
            if(even % 2 != 0){
                everyRow = false;
            }
        }

        boolean everyColumn = true;
        for(int i = 0,even = 0; i < matrix[0].length;i++,even = 0){
            for(int v = 0; v < matrix.length;v++){
                if(matrix[v][i] == 1)
                even++;
            }
            if(even % 2 != 0){
                everyColumn = false;
            }
        }
        System.out.println("Every row" + ((everyRow) ? "" : " doesn't" )+ " have an even number of 1s ");
        System.out.println("Every column" + ((everyColumn) ? "" : " doesn't") + " have an even number of 1s ");
    }

}
