package Exercises6;
import java.util.*;

public class Exercise6_21 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");      
        String in = input.nextLine();

        for(int i = 0; i <= in.length()-1;i++){
            
            if(Character.isAlphabetic(in.charAt(i))){
                System.out.print(getNumber(Character.toLowerCase(in.charAt(i))));
            }else
            System.out.print(in.charAt(i));
        }

    }


    public static int getNumber(char toLowerCase){

        int number = 0;
        int digit = (int) toLowerCase;

        switch((int)digit) {
            case 'a':case 'b':case 'c':
                number = 2; break;
            case 'd':case 'e':case 'f':
                number = 3; break;
            case 'g':case 'h':case 'i':
                number = 4; break;
            case 'j':case 'k':case 'l':
                number = 5; break;
            case 'm':case 'n':case 'o':
                number = 6; break;
            case 'p':case 'q':case 'r':case 's':
                number = 7; break;
            case 't':case 'u':case 'v':
                number = 8; break;
            case 'w':case 'x':case 'y':case 'z':
                number = 9; break;
            default : 
                System.out.print(toLowerCase + " is an invalid input");
                System.exit(1);
            }

        return number;
    }

}
