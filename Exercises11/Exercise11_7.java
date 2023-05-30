package Exercises11;
import java.util.*;

public class Exercise11_7 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        shuffle(list);
        System.out.print(list.toString());
    }


    public static void shuffle(ArrayList<Integer> list){
        
        for(int i = 0; i < list.size();i++){
            int num = ((int)(Math.random() * list.size()));
            Integer value = list.get(i);
            list.set(i,list.get(num));
            list.set(num,value);

        }


    }
}
