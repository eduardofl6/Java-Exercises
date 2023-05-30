package Exercises12;
import java.util.*;
import java.net.URL;

public class Exercise12_25 {
    public static void main(String[] args)throws Exception{
        URL url = new URL(" http://liveexample.pearsoncmg.com/data/Salary.txt");

        Scanner scan = new Scanner(url.openStream());

        double[] associate = new double[3];
        double[] assistant = new double[3];
        double[] full = new double[3];


        while(scan.hasNextLine()){

            Scanner line = new Scanner(scan.nextLine());
            line.next(); line.next();
            String role = line.next(); 
            double value = Double.parseDouble(line.next());

            if(role.compareTo("assistant") == 0){
                assistant[0] += value;
                assistant[1] += value;
                assistant[2]++;
            }else if(role.compareTo("associate") == 0){
                associate[0] += value;
                associate[1] += value;
                associate[2]++;
            }else if(role.compareTo("full") == 0){
                full[0] += value;
                full[1] += value;
                full[2]++;
            }
             
        }

        System.out.format("Assistant:\nTotal: %.2f\nAvarage:%.2f\n" + 
        "Associate:\nTotal: %.2f\nAvarage:%.2f\n" + "Full:\nTotal: %.2f\nAvarage:%.2f",assistant[0],(assistant[1] / assistant[2]),associate[0],(associate[1] / associate[2]),full[0],(full[1] / full[2]));

    }    
}
