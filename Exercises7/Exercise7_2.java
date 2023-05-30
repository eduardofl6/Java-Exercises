package Exercises7;

public class Exercise7_2 {
    public static void main(String[] args){
        int[] numbers = new int[11];
        for(int i = 0; i < numbers.length;i++)
            numbers[i] = (int)(Math.random() * 100);
        
        compare(numbers);


    }

    public static void compare(int[] n){
        for(int i = 0; i < n.length; i++){
            System.out.print("numbers[" + i + "] ("+ n[i]+") is");
            if(n[i] > n[10]) 
             System.out.print(" bigger than " + n[10]);
            else if(n[i] == n[10]) 
              System.out.print(" equal to " + n[10]);
            else
              System.out.print(" smaller than "+ n[10]);
              System.out.println();
            }

    }
}
