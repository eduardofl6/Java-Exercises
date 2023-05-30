package Exercises9;
import java.util.*;

public class Exercise9_3 {
    public static void main(String[] args){
        long n = 10000;
        Date object = new Date(n);

        for(int i = 0; i < 8; i++, n *= 10){
            object.setTime(n);
            System.out.printf("Current time at %d is %s\n",n,object.toString());
        }
    }  
}
