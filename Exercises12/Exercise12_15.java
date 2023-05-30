package Exercises12;
import java.util.*;
import java.io.*;

public class Exercise12_15 {
    
    public static void main(String []args)throws Exception{

        File file = new File("C:/Users/eduar/Desktop/Coding/FilesTexts/Names.txt");

        System.out.print(writeInFile("Eax Hartwell", file));

    }
    

    public static int writeInFile(String name, File file) throws Exception{

        Scanner scan = new Scanner(file);

        int position = 0;

        StringBuilder string = new StringBuilder();

        String passing;
        boolean in = false;
        for(int i = 0;scan.hasNextLine();i++){

            passing = scan.nextLine();

            if(!in && name.compareTo(passing) < 0){
                in = true;
                string.append(name + '\n');
            }
            string.append(passing+ "\n");
        }

        PrintWriter print = new PrintWriter(file);
        print.print(string.toString());
        print.close();

        return position;

    }
}
