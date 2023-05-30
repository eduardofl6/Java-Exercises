package Exercises6;
import java.io.*;

public class Exercise7_20 {
    

    public static void main(String[] x){

        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
   selectionSort(list);
    printArray(list);
    }

    public static void printArray(double arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static int binarySearch(int num, int[] list){
        // {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79}.
        //  10 < mid
        //  {2, 4, 7, 10, 11, 45}
        //  low               high
        //  {10, 11, 45}
        //  low      high
        //  {10, 11}
        //   low high/mid
        //  {10} ((4 + 3) / 2 = 3 = list[3] = 10 = mid = key )
        //  {10}
        //mid ^


        // {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79}
        // 12 < mid
        //  {2, 4, 7, 10, 11, 45}
        //  low               high
        //  12 > mid
        //  {10, 11, 45}   
        //  low      high
        //  12 > mid
        //  {45}
        //  12 < mid(45)
        //   end of the loop
        //  return -low(4) - 1
        //  -6 the only place that could be 12 once 6 is 45, bigger than 11

        // {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79}
        // return -4
        // should be in index 4



        return 1;
    }
       public static void selectionSort(double[] list) {
         for (int i = 0; i < list.length - 1; i++) {
         // Find the minimum in the list[i..list.length−1]
         double currentMin = list[i];
         int currentMinIndex = i;
        
         for (int j = i + 1; j < list.length; j++) {
         if (currentMin > list[j]) {
         currentMin = list[j];
         currentMinIndex = j;
         }
         }
        
         // Swap list[i] with list[currentMinIndex] if necessary
         if (currentMinIndex != i) {
         list[currentMinIndex] = list[i];
         list[i] = currentMin;
         }
         }
         }
}
