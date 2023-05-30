package Exercises11;
import java.util.*;
public class Exercise11_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five integers: ");
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            list.add(input.nextInt());    
        }

        sort(list);

        System.out.print(list.toString());
    }

    public static void sort(ArrayList<Integer> list){
        
        int index = 0;

        for(int i = 0; i < list.size();i++){

            index = i;
            for(int v = i+1; v < list.size();v++){
                    if(list.get(v) < list.get(i)){
                        index = v;
                    }
            }

            Integer temp = list.get(i);
            list.set(i,list.get(index));
            list.set(index,temp);


        }

    }
}
