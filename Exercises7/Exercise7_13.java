package Exercises7;

public class Exercise7_13 {
    public static void main(String[] args){
        System.out.print(getRandom(1,2,3,4,5,6));

    }

    public static int getRandom(int... numbers){

        int random = (int)(Math.random() * numbers.length+1);


        return random;
    }
}
