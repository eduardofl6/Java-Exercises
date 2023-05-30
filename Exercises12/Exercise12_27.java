package Exercises12;
import java.io.*;
import java.util.*;

public class Exercise12_27 {
    public static void main(String[] args)throws Exception{
        if(args.length != 1){
            throw new Exception("Insufficient amount of arguments!");
        }
        if(args[0].charAt(args[0].length()-1) == '*'){
            args[0] = args[0].substring(0, args[0].length()-2);
        }

        System.out.println(args[0]);
        
        File file = new File(args[0]);
        
        
        walkthrough(file);

    }

    public static void walkthrough(File dir) throws Exception{
        if(dir.isFile()){
            changer(dir);
        }else if(dir.isDirectory()){
         
            String[] archs =  dir.list();
            String father = dir.getAbsolutePath().replace(dir.getAbsolutePath(), "");

            for(int i = 0;i < archs.length;i++){
                
                File temp = new File(father+archs);
                if(temp.isFile()){
                    changer(temp);
                }else if(temp.isDirectory()){
                    walkthrough(temp);
                }
            }

            
        
        }

    }

    public static void changer(File file)throws Exception{
        Scanner scan = new Scanner(file);
    
        StringBuilder string = new StringBuilder();

        while(scan.hasNextLine()){
            String line = scan.nextLine();

            if(line.contains("Exercise")){
                int position = line.indexOf("Exercise") + "Exercise".length();
                if(Character.isDigit(line.charAt(position)) && line.charAt(position+1) == '_' ){
                }

            }
            string.append(line);
        }
    
    }
}
