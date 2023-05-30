package Exercises7;
import java.util.Scanner;

public class Exercise7_17 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberStudents = input.nextInt();

        String[] names = new String[numberStudents];
        double[] scores = new double[numberStudents];
 
        for(int i = 0; i < numberStudents; i++){
            System.out.print("Enter name and score of student " + (i+1) + ":  ");
            names[i] = input.next();
            scores[i] = input.nextDouble();

        }

        selectionSort(scores,names);
        for(int i = 0; i < scores.length;i++){
            System.out.print( names[i]+" ");

            System.out.print( scores[i]+" ");

        }

    }


     public static void selectionSort(double[] list,String[] names) {
         for (int i = 0; i < list.length - 1; i++) {
         // Find the minimum in the list[i..list.length−1]
         double currentMin = list[i];
         int currentMinIndex = i;
         String min = names[i];
        
         for (int j = i + 1; j < list.length; j++) {
         if (currentMin > list[j]) {
         currentMin = list[j];
         currentMinIndex = j;
         min = names[j];
         }
         }
        
         // Swap list[i] with list[currentMinIndex] if necessary
         if (currentMinIndex != i) {
         list[currentMinIndex] = list[i];
         list[i] = currentMin;
         names[currentMinIndex] = names[i];
         names[i] = min;
         }
         }
         }
}
