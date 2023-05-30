package Exercises6;

public class Exercise6_11 {

    public static void main(String[] args){


	int sales = 0;

    System.out.println("Sales amount \t Commission");

    for(int i  = 10000; i <= 100000; i += 5000){

        System.out.println(i + "\t" + computeCommission(i));
    }
			// Unfinished CODE
            //      ^
            //      |
            //      |
            //      _
        
	
	}

    public static double computeCommission(double salesAmount){
        double commission = 0;

        commission += 0.06 * ((salesAmount >= 5000) ? 5000 : salesAmount);
        commission += 0.08 * ((salesAmount >= 5000) ? 5000 : salesAmount);
        commission += 0.10 * ((salesAmount >= 10000) ? salesAmount - 10000 : 0 );

        return commission;
    }

}
    

