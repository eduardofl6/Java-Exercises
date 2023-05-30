package Exercises12;
import java.io.*;
import java.util.*;

public class Exercise12_22 {
    public static void main(String[] args) throws Exception{
        
        if(args.length != 3){
         throw new Exception("Wrong number of arguments");
        }
        
        File dir = new File(args[0]);
        String oldString = args[1];
        String newString = args[2];

        if(!dir.exists())
            throw new Exception("Non existent directory");

            walkthrough(dir, oldString, newString);

        }
        
        public static void walkthrough(File file, String oldString, String newString)throws Exception{
        String[] dirs = file.list();
            
        String brute = file.getAbsolutePath() + "\\";

        for(int i = 0; i < dirs.length;i++){
            File temp = new File(brute + dirs[i]);

            if(temp.isDirectory()){
                walkthrough(temp, oldString, newString);
            }else
                replace(temp, oldString, newString);
        }
    }


    public static void replace(File dir, String oldString, String newString) throws Exception{
        Scanner print = new Scanner(dir);
        
        StringBuilder content = new StringBuilder();

        while(print.hasNextLine()){
            String line = print.nextLine();
            content.append(line.replaceAll(oldString, newString) + "\n");
        }

        PrintWriter printer = new PrintWriter(dir.getAbsolutePath());
        printer.print(content.toString());
        printer.close();
    }
}
