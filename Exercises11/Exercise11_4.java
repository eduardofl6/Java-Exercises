package Exercises11;
import java.util.*;

public class Exercise11_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a sequence of numbers (0 to end): ");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(input.nextInt());
        
        while(list.get(list.size()-1) != 0){
            list.add(input.nextInt());
        }

        System.out.print(max(list));

    }


    public static Integer max(ArrayList<Integer> list){
        Integer  max = list.get(0);
        
        if(list.size()- 1 == 0){
            return null;
        }

        for(Integer i = 1; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }

        return max;
    }
}
