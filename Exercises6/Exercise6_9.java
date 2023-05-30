package Exercises6;

public class Exercise6_9 {
    
    public static void main(String[] args){

        System.out.print("Kilograms\tPounds\t|\tPounds\tKilograms\n");
    
        for(int i = 1, j = 20; i <= 199; i += 2, j += 5){
            System.out.format("%d\t%.2f",i,kilogramToPound(i));
            System.out.print("\t\t|\t");
            System.out.format("%d\t\t%.2f\n",j,poundToKilogram(j));
    
        }
    }

    /** Convert from Mile to Kilometer */
    public static double poundToKilogram(double pound){
        return pound * 0.453;
    }
/** Convert from Kilometer to Mile */
    public static double kilogramToPound(double kilogram){
        return kilogram * 2.205;
    }
}
