package Exercises12;
import java.util.*;
import java.io.*;


public class Exercise12_14 {
    public static void main(String[] args) throws Exception{
    Scanner input = new Scanner(System.in);

        File file = new File("C:/Users/eduar/Desktop/Coding/FilesTexts/Names.txt");

        String string = input.nextLine();

        System.out.print("The string: " + string + ((readInFile(string, file) != -1) ? ("\nIs in the line: " + readInFile(string, file)): ("\nIs not in the file")));

    }

    public static int readInFile(String line, File file) throws Exception{
        Scanner text = new Scanner(file);

        for(int i = 0; text.hasNextLine(); i++){
            if(text.nextLine().compareTo(line) == 0){
                return i;
            }
        }

        return -1;
    }
}
