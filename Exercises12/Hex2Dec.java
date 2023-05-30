package Exercises12;

import java.util.Scanner;

 public class Hex2Dec {
 /** Main method */
 public static void main(String[] args) throws HexFormatException{
 // Create a Scanner
 Scanner input = new Scanner(System.in);

 // Prompt the user to enter a string
 System.out.print("Enter a hex number: ");
 String hex = input.nextLine();

 System.out.println("The decimal value for hex number "
 + hex.trim() + " is " + hexToDecimal(hex.toUpperCase()));
 }

 public static int hexToDecimal(String hex) throws HexFormatException {

 int decimalValue = 0;

 hex = hex.trim(); 
 for (int i = 0; i < hex.length(); i++) {
 char hexChar = hex.charAt(i);

 if(!Character.isAlphabetic(hexChar) && !Character.isDigit(hexChar))
    throw new HexFormatException();
 decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
 }

 return decimalValue;
 }

 public static int hexCharToDecimal(char ch) {
 if (ch >= 'A' && ch <= 'F')
 return 10 + ch - 'A';
 else // ch is '0', '1', ..., or '9'
 return ch - '0';
 }
 }
