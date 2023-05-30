package Exercises6;

public class Exercise6_25 {

    public static void main(String[] args){


        System.out.print(convertMillis(100000));
    } 
    // Work as a clack
    public static String convertMillis(long millis){
        String time = "";

        // convert to seconds then uses %, so the rest of it is for minutes, basically the surplus of seconds go to minutes, the same in minutes
		long totalSeconds = millis / 1000 % 60;
		// convert to seconds then to minutes, again using %, so the rest is for hours, that will use more than 24
		long totalMinutes = millis / 1000 / 60 % 60;
		
		long totalHours = millis / 1000 / 60 /  60;
		

        time = "" + totalHours + ":" + totalMinutes + ":" + totalSeconds;

        return time;
    }
}
