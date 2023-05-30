package Exercises6;

public class Exercise6_28 {
    

    public static void main(String[] args){

        System.out.print("P\t2^p-1\n");
        for(int i = 2; i <= 31; i++){
            System.out.println(i + "\t" + mersennePrime(i));
        }
    }

    public static int mersennePrime(int number){ return (int)Math.pow(2, number) -1;}
    
}
