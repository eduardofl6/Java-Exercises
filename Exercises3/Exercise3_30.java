package Exercises3;

public class Exercise3_30 {

	public static void main(String[] args) {
		long totalMiliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMiliseconds / 1000;
		
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHours = totalHours % 24;
		
		System.out.print("Time: " + ((currentHours > 12) ? currentHours - 15 : currentHours -3) + ":" + currentMinutes + ":" + currentSeconds + " " + ((currentHours > 12) ? "PM" : "AM"));
	}

}
