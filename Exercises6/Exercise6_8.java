package Exercises6;

public class Exercise6_8 {
    
    public static void main(String[] args){

    System.out.print("Miles\tKilometers\t|\tKilometers\tMiles\n");
    
    for(int i = 1, j = 20; i <= 10; i++, j += 5){
        System.out.format("%d\t%.2f",i,mileToKilometer(i));
        System.out.print("\t\t|\t");
        System.out.format("%d\t\t%.2f\n",j,kilometerToMile(j));

    }


    }

/** Convert from Mile to Kilometer */
    public static double mileToKilometer(double mile){
        return mile * 1.609;
    }
/** Convert from Kilometer to Mile */
    public static double kilometerToMile(double kilometer){
        return kilometer / 1.609;
    }

}
