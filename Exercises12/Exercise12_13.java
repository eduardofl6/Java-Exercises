package Exercises12;
import java.io.*;
import java.util.*;

public class Exercise12_13 {
    public static void main(String[] args) throws Exception{

        int words = 0;
        int characters = 0;
        int lines = 0;


        File file = new File(args[0]);

        String fileName = args[0];

        Scanner fileScan = new Scanner(file);

        Scanner lineScan;



        while(fileScan.hasNextLine()){
            lines++;

            lineScan = new Scanner(fileScan.nextLine());
            
            while(lineScan.hasNext()){
                words++;
                lineScan.next();
            }            

        }

        StringBuilder text = new StringBuilder();
        Scanner toText = new Scanner(file);

        for(int i = 0; i < lines; i++){
            text.append(toText.nextLine());
        }

        characters = text.length();
        System.out.format("Words: %d\nCharacters: %d\nLines: %d",words,characters,lines);

    }
}
