package Exercises13;
import java.util.*;


public class Exercise13_4 {
    public static void main(String [] args) throws Exception{
       
        switch(args.length){
            case 1:{
                int month = Integer.valueOf(args[0]);
                displayMonth(new GregorianCalendar(GregorianCalendar.YEAR,month,0));
                break;
            }
            case 2:{
                int month =  Integer.valueOf(args[0]);
                int year =  Integer.valueOf(args[1]);
                displayMonth(new GregorianCalendar(year,month,0)); 
                break;
            }
            case 0:
                displayMonth(new GregorianCalendar());
                break;
            default:
                throw new Exception("Wrong amount of arguments!");
        }

    }

    public static void displayMonth(GregorianCalendar date){
        date.set(date.get(date.YEAR),date.get(date.MONTH),1);


        Date time = date.getTime();
        String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        String[] info = time.toString().split(" ");
        
        int position = 0;
        for(int i = 0; i < days.length;i++){
            if(info[0].compareTo(days[i]) == 0){
                position = i;
            }   
        }

        System.out.println("\t"+info[1] + ", " + info[info.length-1]);

        System.out.print("---------------------------\n");
      
        
        for(int i = 0; i < days.length;i++){
            System.out.print(days[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < position;i++){
            System.out.print("    ");
        }
        for(int i = 0, v = ++position; i < maxDays(date, date.get(date.MONTH));i++, v++){
            System.out.format("%3d ", i+1);
            if( v % 7 == 0){
                v = 0;
                System.out.println();
            }
        }
    }

    public static int maxDays(GregorianCalendar date,int month){

        int[] daysMonth = {31, ((date.isLeapYear(date.YEAR)) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return daysMonth[month];
    }


}
