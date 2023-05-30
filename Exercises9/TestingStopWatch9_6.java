package Exercises9;

public class TestingStopWatch9_6 {
    public static void main (String[] args){
        int[] array = new int[100000];
        
        for(int i = 0; i < array.length;i++){
            array[i] = (int) (Math.random() * 1000);
        }
        StopWatch clock = new StopWatch();
        java.util.Arrays.sort(array);
        clock.stop();
        System.out.print(clock.getElapsedTime());
    }
}
