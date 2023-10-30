package Exercises13;
import java.util.*;

public class Exercise13_3 {
    public static void main(String[] args){
        ArrayList<Number> list = new ArrayList<>();
        
        for(int i = 0; i < ((int)(Math.random() * 10) + 1); i++){
            list.add(new Integer((int) (Math.random() * 20)));
            System.out.println(list.get(i));
        }

        sort(list);
    }   

    public static void sort(ArrayList<Number> list){

        for(int i = 0; i < list.size();i++){
                Double num = list.get(i).doubleValue();
                int position = i;
                
                for(int v = i + 1; v < list.size();v++){
                    if(num.compareTo(list.get(v).doubleValue()) > 0){
                        position = v;
                        num = list.get(v).doubleValue();
                    }
                }
                swapList(list, i, position);
            }

        }

    


    public static void swapList(ArrayList<Number> list, int x, int y){
        Number temp = list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);
    }
}
