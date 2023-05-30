package Exercises11;
import java.util.*;

public class Exercise11_6 {
    public static void main(String[] args){
        Date date = new Date();
        Loan loan = new Loan();
        Circle circle = new Circle();

        ArrayList<Object> list = new ArrayList<>();
        list.add(circle);
        list.add(loan);
        list.add(date);

        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
