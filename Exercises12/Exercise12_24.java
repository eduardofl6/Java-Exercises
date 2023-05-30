package Exercises12;
import java.io.*;
import java.util.*;

public class Exercise12_24 {
    public static void main(String[] args)throws Exception{
        File salary = new File("C:/Users/eduar/Desktop/Coding/FilesTexts/Salary.txt");

        PrintWriter printer = new PrintWriter(salary);

        for(int i = 1; i <= 1000;i++){
            String line = "FirstName" + i + " LastName" + i + " ";

            int number = (int) (Math.random() * 3 ); 

            switch(number){
                case 0: line += "assistant " + (int)((Math.random() * (80000 - 50000)) + 50000); break;
                case 1: line += "associate " + (int)((Math.random() * (110000 - 60000)) + 60000); break;
                case 2: line += "full " + (int)((Math.random() * (130000 - 75000)) + 75000); break;
            }

            printer.println(line);
            
        }

        printer.close();
    } 
}
