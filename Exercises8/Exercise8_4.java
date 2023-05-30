package Exercises8;

public class Exercise8_4 {
    public static void main(String[] args){
        int[][] employeesHour = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9},
            
        }; 
        int[] totalHours = new int[employeesHour.length];

        for(int i = 0; i < totalHours.length;i++){

            for(int j = 0; j < employeesHour[i].length;j++){
                totalHours[i] += employeesHour[i][j];
            }

        }

        int[] employees = new int[totalHours.length];
        for(int i = 0; i < employees.length;i++){
        employees[i] = i;
        }   
        bubbleSort(totalHours, employees);

        for(int i = 0; i < totalHours.length;i++){
            System.out.println("Employee " + employees[i] + " total hours " + totalHours[i]);
        }
    }
    public static void bubbleSort(int[] numbers,int[] sts){

        for(int i = 1; !(inOrder(numbers)) && i < numbers.length;i++){
            if(numbers[i-1] > numbers[i]){
                swap(numbers,i-1,i);
                swap(sts,i-1,i);
            }
        }

        if(!(inOrder(numbers)))
            bubbleSort(numbers,sts);
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
