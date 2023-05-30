package Exercises8;
import java.util.*;

public class Exercise8_28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        
        int[][] list1 = new int[3][3];
        for(int i = 0; i <  list1.length;i++){
            for(int v = 0 ; v < list1[i].length;v++){
                list1[i][v] = input.nextInt();
            }
        }

        System.out.print("Enter list2: ");
        
        int[][] list2 = new int[3][3];
        for(int i = 0; i <  list2.length;i++){
            for(int v = 0 ; v < list2[i].length;v++){
                list2[i][v] = input.nextInt();
            }
        }

        System.out.print("The two arrays are " + (equals(list1, list2)? "" : "not ") + "strictly identical");
    }

    public static boolean equals(int[][] m1, int[][] m2){
        for(int i = 0; i < m1.length;i++){
            if(!Arrays.equals(m1[i], m2[i]))
                return false;;
        }
        return true;
    }

}
