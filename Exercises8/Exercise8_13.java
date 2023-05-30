package Exercises8;
import java.util.*;

public class Exercise8_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] array = new double[rows][columns];

        System.out.print("Enter the array:\n");

        for(int i = 0; i < array.length;i++){

            for(int v = 0; v < array[i].length;v++){
                array[i][v] = input.nextDouble();
            }

        }
        int[] values = locateSmallest(array);
        System.out.format("The location of the smallest element is at (%d, %d)",values[0],values[1]);
    }

    public static int[] locateSmallest(double[][] a){
        int[] index = new int[2];
        double smallest = a[0][0];

        for(int i = 0; i < a.length;i++){

            for(int v = 0; v < a[i].length;v++){
                if(a[i][v] < smallest){
                    index[0] = i;
                    index[1] = v;
                    smallest = a[i][v];
                }

            }

        }
        
        
        return index;
    }

}
