package Exercises11;
import java.util.*;

public class Exercise11_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size n: ");

        int arraySize = input.nextInt();
        int[][] array = new int[arraySize][arraySize];

        for(int i = 0; i < array.length; i++){

            for(int v = 0; v < array[i].length;v++){
                array[i][v] = (int)(Math.random() * 2);
                System.out.print(array[i][v] + " ");

            }
            System.out.println();

        }

        //Rows
        ArrayList<Integer> rows = new ArrayList<>();
        for(int i = 0,maxRow = 0, count = 0; i < array.length; i++){
            
            for(int v = 0; v < array[i].length;v++){
                if(array[i][v] == 1){
                    count++;
                }
            }

            if(count == maxRow){
                rows.add(i);
            }
            if(count > maxRow){
                rows.clear();
                maxRow = count;
                rows.add(i);
            }
            count = 0;
        }
        
        //Column
        ArrayList<Integer> column = new ArrayList<>();
        for(int i = 0,maxRow = 0, count = 0; i < array[0].length;i++){

            for(int v = 0; v < array.length;v++){
                if(array[v][i] == 1){
                    count++;
                }
            }
            if(count == maxRow){
                column.add(i);
            }
            if(count > maxRow){
                column.clear();
                maxRow = count;
                column.add(i);
            }
            count = 0;

        }


        System.out.print("Rows: " + rows.toString() + "\nColumns: " + column.toString());


    }
}
