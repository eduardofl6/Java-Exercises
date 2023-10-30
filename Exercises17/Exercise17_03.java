package Exercises17;

import java.io.*;

public class Exercise17_03 {
    public static void main(String[] args)throws IOException{
        File fileExist = new File("C:\\Users\\eduar\\Desktop\\Exercises\\src\\Exercises17\\Exercise17_03.dat");

        DataOutput output = new DataOutputStream(new FileOutputStream(fileExist, false));

        for(int i = 0; i < 10; i++){
            output.writeDouble(Math.random() * 10);
        }


        double sum = 0,r;
        try(
            DataInputStream input = new DataInputStream(new FileInputStream(fileExist));){
        while((r = input.readDouble()) != -1){
            sum += r;
        }
        
    }
    catch(EOFException ex){
            System.out.println(sum);
            System.out.print("All data were read\n");
        }
    }
}
