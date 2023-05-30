package Exercises12;
import java.util.*;
import java.net.*;

public class Exercise12_23 {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");

        Scanner scan = new Scanner(url.openStream());

            double avarage = 0.0; 
            int i = 0;
            while(scan.hasNext()){
                double value = Double.parseDouble(scan.next());
                avarage += value;
                i++;
            }
            avarage /= i;
            System.out.print(avarage);
    }
}
