package Exercises12;
import java.io.*;
import java.util.*;

public class Exercise12_11 {
    public static void main(String[] args) throws Exception{
        String regex = args[0];

        File file = new File(args[1]);

        Scanner fileScan = new Scanner(file);

        StringBuilder text = new StringBuilder();

        String temp;
        String temp1;

        Scanner tempS;

        while(fileScan.hasNext()){

            temp = fileScan.nextLine();
            tempS = new Scanner(temp);

            while(tempS.hasNext()){
                temp1 = tempS.next();
                if(!temp1.contains(regex)){
                    text.append(temp1 + " ");
                }
            }

            text.append("\n");
        }

        PrintWriter printer = new PrintWriter(file);

        printer.print(text.toString());
        printer.close();


    }
}
