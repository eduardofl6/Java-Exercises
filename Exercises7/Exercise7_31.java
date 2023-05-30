package Exercises7;
import java.nio.BufferUnderflowException;
import java.util.*;
public class Exercise7_31 {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter list1 size and contents: ");
        int size1 = input.nextInt();

        int[] array1 = new int[size1]; 
        for(int i = 0; i < array1.length;i++){
            array1[i] = input.nextInt();
        }
        System.out.print("Enter list2 size and contents: ");
        int size2 = input.nextInt();

        int[] array2 = new int[size2];
        for(int i = 0; i < array2.length;i++){
            array2[i] = input.nextInt();
        }

        bubbleSort(array1);
        bubbleSort(array2);

        System.out.print("list1 is ");
        printArray(array1);
        System.out.print("list2 is ");
        printArray(array2);
        printArray(merge(array1,array2));

    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        int[] mergeArray;
    }

    public static int[] merge(int[] list1, int[] list2){
        int[] fArray = new int[list1.length + list2.length];
        
        int x = 0;

        for(int i = 0; i < list1.length;i++){
            fArray[x++] = list1[i];
 
        }

        for(int i = 0; i < list2.length;i++){
            fArray[x++] = list2[i];
        }
        bubbleSort(fArray);
        return fArray;
    }


    public static void bubbleSort(int[] numbers){

        for(int i = 1; !(inOrder(numbers)) && i < numbers.length;i++){
            if(numbers[i-1] > numbers[i]){
                swap(numbers,i-1,i);
            }
        }

        if(!(inOrder(numbers)))
            bubbleSort(numbers);
    }

    public static boolean inOrder(int[] array){
        for(int i = 1; i < array.length;i++){
            if(array[i-1] > array[i]){
                return false;
            }
        }
        return true;
    }


    public static void swap(int[] num, int x, int y){
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }

}
