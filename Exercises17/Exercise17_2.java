package Exercises17;
import java.util.*;
import java.io.*;


public class Exercise17_2 {
    public static void main(String[] args)throws IOException{

        File fileExist = new File("C:\\Users\\eduar\\Desktop\\Exercises\\src\\Exercises17\\Exercise17_02.dat");

        FileOutputStream file = new FileOutputStream(fileExist.getAbsolutePath(), true);

        for(int i = 0; i <150;i++){
            file.write((byte) ((int)(Math.random() * 100)));
        }  
        DataInputStream fileIn = new DataInputStream( new FileInputStream(fileExist.getAbsolutePath()));

        int r = 0;
        
        while((r = fileIn.read()) != -1){
            System.out.print(fileIn.read() + " ");
        }
    }


}

