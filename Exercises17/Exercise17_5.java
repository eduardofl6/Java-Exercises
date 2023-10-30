package Exercises17;
import java.util.*;
import java.io.*;

public class Exercise17_5 {
    public static void main(String[] args)throws IOException,ClassNotFoundException{
        int[] array = {1,2,3,4,5,6};
        Date date = new Date();
        double tenDotFive = 10.5;
    
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("C:\\Users\\eduar\\Desktop\\Exercises\\src\\Exercises17\\" + 
        "Exercise17_05.dat", false));
    
        output.writeObject(array);
        output.writeObject(date);
        output.writeDouble(tenDotFive);
        output.close();

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:\\Users\\eduar\\Desktop\\Exercises\\src\\Exercises17\\Exercise17_05.dat"));
        
        int[] arrayInput = (int[]) (input.readObject());
        Date dateInput = (Date)(input.readObject());
        double etc = input.readDouble();


        for(int i = 0; i < arrayInput.length;i++){
            System.out.print(arrayInput[i]);
        }
        System.out.print("\n" + dateInput.toString() + "\n" + etc);
    }
}
