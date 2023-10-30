package Exercises17;
import java.io.*;
import java.util.*;

public class Exercise17_1 {
    public static void main(String[] args) throws IOException{

        FileOutputStream file = new FileOutputStream("C:\\Users\\eduar\\Desktop\\Exercises\\src\\Exercises17\\Exercise17_01.txt",true);

        PrintWriter out = new PrintWriter(file);
        for(int i = 0 ; i < 150;i++){
            out.append((int)(Math.random() * 100) + " ");
            if(i+1 % 10 == 0)
                out.print("\n");
        }

        out.print("end ");
        out.close();

        Scanner scan = new Scanner(new File("C:\\Users\\eduar\\Desktop\\Exercises\\src\\Exercises17\\Exercise17_01.txt"));
        for(;scan.hasNext();){
            System.out.print(scan.next() + " ");

        }
    }
}
