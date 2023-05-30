package Exercises6;

public class Exercise6_24 {
  
    public static void main(String[] args){


        System.out.print("The current time is " + currentTime() + " of today and year is " + getyear() + " day is "
        + today(currentDays()) + " and month is "  + getMonth(currentDays()));
    } 

    public static long totalDays(){
        long totaldays = (System.currentTimeMillis()) / 1000 / 60 / 60 / 24;
        
        return totaldays;
    }

    public static String currentTime(){

        int offset = -3;
		
		long totalMiliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMiliseconds / 1000;
		
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHours = totalHours % 24;
		
        String realtime = "" + (currentHours + offset) + ":" + currentMinutes + ":" + currentSeconds;

		return realtime;
    }
       
        public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
        month == 8 || month == 10 || month == 12)
        return 31;
       
         if (month == 4 || month == 6 || month == 9 || month == 11)
         return 30;
        
         if (month == 2) return isLeapYear(year) ? 29 : 28;          
         return 0; // If month is incorrect
         
        }
       
         public static boolean isLeapYear(int year) {
         return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
         }

         public static int getyear(){

            long days = totalDays();
            int currentYear = 1970;
            long dayscome = 0;

            for(; dayscome < days ;currentYear++){

                if(isLeapYear(currentYear)){
                    dayscome += 366;
                }else
                    dayscome += 365;

            }


            return currentYear-1;
         }

         public static long currentDays(){
            long today = 0;
            int startyear = 1970;
            int currentYear = getyear();
            long days = totalDays();
            
            for(;currentYear > startyear; currentYear--){
                if(isLeapYear(currentYear)){
                    days -= 366;
                }else
                    days -= 365;
            }

            today = days;

            return today+1;
         }

         public static int getMonth(long currentDays){

            int month = 1;
            for(; currentDays - getNumberOfDaysInMonth(getyear(), month) > 0; month++){
                currentDays -= getNumberOfDaysInMonth(getyear(), month);
            }

            return month;
         }

         public static long today(long currentDays){

            int month = 1;
            for(; currentDays - getNumberOfDaysInMonth(getyear(), month) > 0; month++){
                currentDays -= getNumberOfDaysInMonth(getyear(), month);
            }

            return currentDays + ((isLeapYear(getyear()) ? 1 : 0));
         }

}
