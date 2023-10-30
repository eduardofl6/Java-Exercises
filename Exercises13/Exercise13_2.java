package Exercises13;
import java.util.ArrayList;

public class Exercise13_2 {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < ((int)(Math.random() * 10) + 1); i++){
            list.add(new Integer((int)(Math.random() * 20)));
            System.out.println(list.get(i));
        }

        average(list);
    }

    public static void average(ArrayList<Integer> list){
        Integer average;
        Integer sum = new Integer(0);

        for(int i = 0; i < list.size();i++){
            sum += list.get(i);
        }
        average = sum / list.size();

        System.out.print("Average:" + average);
    }
}
