package Exercises6;

public class Exercise6_14 {
    public static void main(String[] args){


        System.out.println("i\tm(i)");
        for(int i = 1; i <= 901; i += 100){
            System.out.format("%d\t%.4f\n",i,estimatePI(i));
        }

    }

    public static double estimatePI(int num){
        double pi = 0;

        for(int i = 1, x = 1; i <= 2*num - 1; i+=2, x++){
            if(x % 2 == 0){
                pi -= (1.0 / i);
            }else
            pi += (1.0 / i);

        }


        return 4 * pi;
    }
}
