package Exercises7;

public class Exercise7_7 {
    
    public static void main(String[] args){

        int[] numbers = new int[200];

        random(numbers);
    }


    public static void random(int[] values){
        for(int i = 0; i < values.length; i++){
            values[i] = (int)(Math.random() * 10);

        }
        // if you want to go to nine, you have to put Math.Random() * 10, because math.random never gonna be 1.0 (it's a random value
        // from 0.00...1 until 0.9999...)


        int[] zeroNine = new int[10];

        for(int i = 0; i < values.length;i++){
  
            zeroNine[values[i]]++;
        }


        for(int i = 0; i <= 9;i++){
            System.out.println(i + " occurs " + zeroNine[i] + " time" + ((zeroNine[i]) > 1 ? "s" : ""));

        }
    }
}
