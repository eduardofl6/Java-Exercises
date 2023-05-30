package Exercises7;

public class Exercise7_16 {
    public static void main(String[] args){

        int[] millions = new int[100000000];
        for(int i = 0; i < millions.length;i++){
            millions[i] = i+1;
        }

        int[] numbers = { 1, 25000000, 50000000, 75000000, 100000000 };

        double startTimeOne = System.currentTimeMillis() ;
        double endTimeOne = System.currentTimeMillis() ;
        
        for(int i = 0; i < numbers.length;i++){
            System.out.print("----------" + numbers[i] + "----------\n");
            startTimeOne = System.currentTimeMillis() ;
            linearSearch(millions, numbers[i]);
            endTimeOne = System.currentTimeMillis() ;
            System.out.print("Linear Search: " + (endTimeOne - startTimeOne) + "mms\n");
            

            startTimeOne = System.currentTimeMillis() / 1000;
            binarySearch(millions, numbers[i]);
            endTimeOne = System.currentTimeMillis() / 1000;
            System.out.print("Binary Search: " + (endTimeOne - startTimeOne) + "mms\n");

            }



    }

     public static int linearSearch(int[] list, int key) {
         for (int i = 0; i < list.length; i++) {
         if (key == list[i])
         return i;
         }
         return -1;
         }




    public static int binarySearch(int[] list, int key) {
         int low = 0;
         int high = list.length - 1;
        
         while (high >= low) {
         int mid = (low + high) / 2;
         if (key < list[mid])
         high = mid - 1;
         else if (key == list[mid])
         return mid;
         else
         low = mid + 1;
         }
        
         return -low - 1; // Now high < low, key not found
         }
}
