package Exercises12;
import java.util.*;
import java.io.*;


public class Exercise12_19 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        File authors = new File("C:/Users/eduar/Desktop/Coding/FilesTexts/Authors.txt");
        
        if(!authors.exists()){
            authors.createNewFile();
        }

        File titles = new File("C:/Users/eduar/Desktop/Coding/FilesTexts/Titles.txt");

        if(!titles.exists()){
            titles.createNewFile();
        }

        try{
            System.out.print("Enter the name of an autor: ");
            String author = input.nextLine();
            System.out.print("Enter the title of the book: ");
            String title = input.nextLine();

            int position = writeInFile(author, authors);
            StringBuilder text = new StringBuilder();

            for(Scanner scan = new Scanner(titles);scan.hasNext();){
                text.append(scan.nextLine() + "\n");
            }

            text.append(title + " " + position);

            PrintWriter printer = new PrintWriter(titles);
            printer.println(text.toString());
            printer.close();
        }
        catch(Exception a){

        }


    }

    public static int writeInFile(String name, File file) throws Exception{

        Scanner scan = new Scanner(file);

        int position = 0;

        StringBuilder string = new StringBuilder();

        String passing;
        boolean in = false;
        if(!scan.hasNext()){
            System.out.print("T1");
            string.append(name + "\n");
        }
        for(int i = 0;scan.hasNext();i++){
            passing = scan.nextLine();
            
            if(name.compareTo(passing) == 0){
                position = i;
                return i;
            }

            if(!in && name.compareTo(passing) < 0){
                position = i;
                in = true;
                string.append(name + '\n');
            }
            string.append(passing+ "\n");
        }

        if(!in){
            string.append(name + "\n");
        }

        PrintWriter print = new PrintWriter(file);
        print.print(string.toString());
        print.close();

        return position;

    }
}
