package Exercises9;
import java.util.*;

public class Exercise9_5 {
    public static void main(String[] args){
        GregorianCalendar object = new GregorianCalendar();
        System.out.println(object.get(GregorianCalendar.YEAR) + " " + object.get(GregorianCalendar.MONTH) + " " + object.get(GregorianCalendar.DAY_OF_MONTH));
        object.setTimeInMillis(1234567898765L);
        System.out.println(object.get(GregorianCalendar.YEAR) + " " + object.get(GregorianCalendar.MONTH) + " " + object.get(GregorianCalendar.DAY_OF_MONTH));
        }
}
