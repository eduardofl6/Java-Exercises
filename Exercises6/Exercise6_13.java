package Exercises6;

public class Exercise6_13 {
    
    public static void main(String[] args){

        System.out.println("i\tm(i)");

        for(int i = 1; i <= 20; i++){
            System.out.format("%d\t%.4f\n",i,compute(i));
        }
    }


    public static double compute(int m){
        double total = 0;

        for(double i = 1; i <= m; i++){
            total += i/(i+2);
        }

        return total;
    }
    
}
