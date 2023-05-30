package Exercises9;
import java.util.Scanner;

public class Exercise9_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        double[][] aArray = new double[input.nextInt()][input.nextInt()];

        System.out.println("Enter the array: ");

        for(int i = 0; i < aArray.length;i++){
            for(int v = 0; v < aArray[i].length;v++){
                aArray[i][v] = input.nextDouble();
            }
        }

        Location largest = locateLargest(aArray);

        System.out.print("The location of the largest element is " + largest.array[0][0] + " at (" + (int) largest.array[1][0] + ", " + (int)largest.array[2][0]+")");
    }

    public static Location locateLargest(double[][] a){
        double maxValue = a[0][0];
        int row = 0;
        int column = 0;


        for(int i = 0; i < a.length;i++){
            for(int v = 0; v < a[i].length;v++){
                if(a[i][v] > maxValue){
                    maxValue = a[i][v];
                    row = i;
                    column = v;
                }
            }
        }

        return new Location(row, column, maxValue);
    }
}
