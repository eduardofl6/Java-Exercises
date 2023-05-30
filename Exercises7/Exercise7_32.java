package Exercises7;
import java.util.*;

public class Exercise7_32 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter list size: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = input.nextInt();
        }
        partition(numbers);

        printArray(numbers);
    }

    public static int partition(int[] list){
        int pivot = 0;
        int high = list.length-1;
        int low = 1;

        while(pivot != high){
            while(list[low] <= list[pivot]){
                low++;
            }

            while(high > 0 && list[high] >= list[pivot]){
                high--;


            }
            if(high > low)
            swap(list,high,low);
            if(high < low) {
                swap(list,high,pivot);
            }
        }
        return 1;
    }

    public static void swap(int[] num, int x, int y){
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }
    
    public static void printArray(int[] array){
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }
}
