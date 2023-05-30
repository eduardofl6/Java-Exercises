package Exercises11;
import java.util.*;


public class Exercise11_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter 10 integers: ");
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            list.add(input.nextInt());    
        }

        removeDuplicate(list);

        System.out.print("The distinct integers are " + list.toString());

    }

    public static void removeDuplicate(ArrayList<Integer> list){
        for(int i = 0; i < list.size();i++){

            for(int v = i+1; v < list.size();v++){
                    if(list.get(v) == list.get(i)){
                    list.remove(v);
                    }
            }


        }



    }
}
