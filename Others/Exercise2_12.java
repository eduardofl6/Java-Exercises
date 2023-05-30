
public class Exercise2_12 {
	public static void main(String[] args)
	{
	long totalMiliseconds = System.currentTimeMillis();
	
	long totalSeconds = totalMiliseconds / 1000;
	
	long currentSeconds = totalSeconds % 60;
	
	long totalMinutes = totalSeconds / 60;
	
	long currentMinutes = totalMinutes % 60;
	
	long totalHours = totalMinutes / 60;
	
	long currentHours = totalHours % 24;
	
	System.out.print("Time: " + (currentHours - 3) + ":" + currentMinutes + ":" + currentSeconds);
	}
	
}
