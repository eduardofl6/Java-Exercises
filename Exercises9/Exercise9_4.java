package Exercises9;

import java.util.Random;

public class Exercise9_4 {
    public static void main(String[] args){
        Random object = new Random(1000);
    for(int i = 0; i < 50;i++)
        System.out.println(object.nextInt(100) );
    }
}
