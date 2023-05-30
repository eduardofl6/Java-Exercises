package Exercises10;

import java.util.Arrays;

public class Calculator {
     /** Main method */
     public static void main(String[] args) {
     // Check number of strings passed
     if (args.length != 1) {
     System.out.println("Usage: java Calculator operand1 operator operand2");
     System.exit(1);
    }
    // The result of the operation
     int result = 0;
    
    String[] content = {"","",""}; 

    for(int i = 0,t = 0; i < args[0].length();i++){
        if(args[0].charAt(i) != ' '){
           content[t++] += args[0].charAt(i) + ""; 
        }
    }
     // Determine the operator
     switch (content[1].charAt(0)) {
     case '+': result = Integer.parseInt(content[0]) +
     Integer.parseInt(content[2]);
     break;
     case '−': result = Integer.parseInt(content[0]) -
     Integer.parseInt(content[2]);
     break;
     case '.': result = Integer.parseInt(content[0]) *
     Integer.parseInt(content[2]);
     break;
     case '/': result = Integer.parseInt(content[0]) /
     Integer.parseInt(content[2]);
     }
    
     // Display result
     System.out.println(content[0] + ' ' + content[1] + ' ' + content[2]
     + " = " + result);
     }
     }
