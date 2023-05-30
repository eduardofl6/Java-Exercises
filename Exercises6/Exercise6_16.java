package Exercises6;

public class Exercise6_16 {
    public static void main(String[] args){
        int days = 0;
        for(int i = 2014; i <= 2034; i++){
            days += numberOfDaysInAYear(i);
        }
        System.out.print("Days from 2014 to 2034: " + days);
    }

    public static int numberOfDaysInAYear(int year){
        
        boolean leap =  year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        int days = ((leap == true) ? 366: 365);
        return days;
    }
}
