package Exercises12;
import java.util.*;
import java.io.*;
import java.math.*;

public class Exercise12_26 {
    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(System.in);


        
        System.out.print("Enter a directory name:");
        String directory = input.nextLine();

        File test = new File("C:/Users/eduar/Desktop/Coding/FilesTexts/" + directory);

        if(test.exists()){
            System.out.print("Directory already exists.");
        }else{
            test.mkdir();
            System.out.print("Directory created successfully.");
        }

    }
}

interface a {
}