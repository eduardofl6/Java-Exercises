package Exercises12;
import java.util.*;
import java.io.*;

public class Exercise12_21 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an authors name: ");
        String author = input.nextLine();
        
        boolean valid = false;
        int position = 0;
        
        File file = new File("C:/Users/eduar/Desktop/Coding/FilesTexts/Authors.txt");

        while(!valid){
            Scanner authors = new Scanner(file); 

            for(position = 0; authors.hasNextLine();position++){
                String comparison = authors.nextLine().toLowerCase();
                if(author.toLowerCase().compareTo(comparison) == 0){
                 valid = true;
                 break;
               }
             }

            if(!valid){
                System.out.print("Invalid authors name! Try Again\n");
                author = input.nextLine().toLowerCase();
            }
        }
        

        StringBuilder titles = new StringBuilder();

        File booksSrc = new File("C:/Users/eduar/Desktop/Coding/FilesTexts/Titles.txt");
        Scanner books = new Scanner(booksSrc);

        for(;books.hasNextLine();){
            String title = books.nextLine();

            if(title.charAt(title.length()-1) - '0' == position ){
                titles.append(title + "\n");
            }
        }

        System.out.print("Books by: " + author + "\n" + titles.toString());
    }

}
