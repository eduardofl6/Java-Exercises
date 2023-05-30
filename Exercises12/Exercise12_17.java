package Exercises12;
import java.io.*;
import java.util.*;


public class Exercise12_17 {
    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\eduar\\Desktop\\Coding\\FilesTexts\\Hagman.txt");

        if(!file.exists())
            file.createNewFile();

        hangman(file);
    }

    public static void hangman(File words) throws Exception{
        Scanner input = new Scanner(System.in);
        Scanner text = new Scanner(words);
        
        ArrayList<String> list = new ArrayList<>();

        while(text.hasNext()){
                list.add(text.next().toLowerCase());
        }

        int num = (int)(list.size() * Math.random());

        String word = list.get(num);
        char []letters = new char[26];

        int misses = 0;
        char c = 0;
        int result = 0;

        char[] dWord = new char[word.length()];
        for(int i = 0; i < dWord.length;i++){
            dWord[i] = '*';
        } 

        while(!win(word,letters)){

            System.out.print("(Guess) Enter a letter in word ");

            
            
            printM(word, letters, dWord);
            printArray(dWord);
            System.out.print(" > ");
            c = Character.toLowerCase(((input.next()).charAt(0)));
            result = letterCheck(letters, c, word);
            if(result == 1){
                System.out.print(c + " is not in the word\n");
                misses++;
            }else if(result == 0){
                System.out.print(c + " is already in the word");
            }



        }
        System.out.println("The word is " + word + ". You missed " + misses + " time" + ((misses > 1) ? "s" : ""));
        System.out.print("Do you want to guess another word? Enter y or n> ");
        while(1 > 0){
            char k = (input.next()).charAt(0);
            if(k == 'y')
                hangman(words);
            
            else if(k == 'n')
                return;
            else 
                System.out.println("Wrong input, please try again");
        }
     
    }

    public static void printM(String s,char[] letters,char[] dWord){

        for(int i = 0; i < s.length();i++){
           
                for(int v = 0; v < letters.length;v++){
                    if(s.charAt(i) == letters[v]){
                     dWord[i] = s.charAt(i);
                    }
                }
           
            }
        }


    

    public static boolean win(String s,char [] letters){
        boolean test = false;

        for(int i = 0; i < s.length();i++){
            test = false;
                for(int v = 0; v < letters.length;v++){
                    if(s.charAt(i) == letters[v]){
                        test = true;
                    }
                }
            if(test == false){
                return false;
            }
        }
        return true;
    }


    public static int letterCheck(char[] chars, char x, String text ){
       boolean hasIn = false;
        
       for(int i = 0; i < chars.length;i++){
            if(chars[i] == x){
                hasIn = true;

            }
        }

        if(hasIn == false){

            for(int i = 0; i < text.length();i++){
              
                if(text.charAt(i) == x){
                    int v = 0;
                    // I'm not using v++ in the while reader because it would bring v to 1, then the fisrt character wouldn't be 0 in the  chars, always overlaping eachother with v starting at 0t
                    while(Character.isAlphabetic(chars[v]))
                    v++;
                    chars[v] = x;


                    return -1;

                }
        
            }
        }


        if(hasIn == false)
            return 1;

        if(hasIn == true)
            return 0;

        return 1;
    }


    public static void printArray(char[] array){
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i]+" ");
        }

    }
}
