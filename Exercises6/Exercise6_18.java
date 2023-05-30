package Exercises6;
import java.util.*;

public class Exercise6_18 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();
        
        checkPassword(password);
    }

    public static void checkPassword(String pass){
       boolean valid = true;
       
        if(pass.length() < 10){
            System.out.println("* A password must have at least ten characters.");
            valid = false;
        }

            int digitCount = 0;
            boolean anchor = false;

            for(int i = 0; i < pass.length(); i++ ){
          
                if((Character.isLetterOrDigit(pass.charAt(i)))){
                }
            else {
                System.out.println("* A password consists of only letters and digits.");
                valid = false;
                break;
            }
            if(Character.isLetter(pass.charAt(i))){
                anchor = true;
            }

            if(Character.isDigit(pass.charAt(i))){
                digitCount++;
            }
        }

        if(digitCount < 3){
            System.out.println("* A password must contain at least three digits.");
            valid = false;
        }

        if(!anchor){
            System.out.println("* A password consists of only letters and digits.");
        }

        if(valid && anchor){
            System.out.print("Valid Password");
        }else
            System.out.print("Invalid Password");

    }

}
