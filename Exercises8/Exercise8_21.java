package Exercises8;
import java.util.*;

public class Exercise8_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of cities: ");
        int numberofCities = input.nextInt(); 
        double[][] cities = new double[numberofCities][2];
        
        System.out.print("Enter the coordinates of the cities:\n");
        for(int i = 0; i < cities.length;i++){
            for(int v = 0; v < cities[i].length;v++){
                cities[i][v] = input.nextDouble();
            }
        }

        distanceCities(cities);
    }

    public static double distanceCities(double[][]cities){
        double[] distances = new double[cities.length];

        for(int i = 0; i < cities.length;i++){
            for(int v = 0; v < cities.length;v++){
                distances[i] += distance(cities[i][0], cities[i][1], cities[v][0], cities[v][1]);
            }
        }
        double min = distances[0];
        int minIndex = 0;
        for(int i = 1; i < distances.length;i++){
            if(min > distances[i]){
                min = distances[i];
                minIndex = i;
            }
        }

        System.out.format("The central city is at (%.1f, %.1f)\n",cities[minIndex][0],cities[minIndex][1]);
        System.out.println("The total distance to all other cities is: " + min);
        return 1.0;
    }

    public static double distance(double x, double y, double x1, double y1){

        return Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
    }
}
