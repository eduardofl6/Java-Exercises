package Exercises2;
import java.util.Scanner;

public class Exercise2_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double temp = input.nextDouble();
		
		System.out.print("Enter the wind speed (7 = 2) in miles per hour");
		double windspeed = input.nextDouble();
		double windspeedpow = Math.pow(windspeed, 0.16);
		
		double wind_chill = 35.74 + 0.6215 * temp - 35.75 * windspeedpow + 0.4275 * temp * windspeedpow;

		System.out.print("The wind chill index is " + wind_chill);
	}

}
