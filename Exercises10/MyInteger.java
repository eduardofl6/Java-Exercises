package Exercises10;

public class MyInteger {
    int value;

    MyInteger(int integer){
        value = integer;
    }

    public int getValue(){
        return value;
    }

    public boolean isEven(){
        if(value % 2 == 0)
        return true;
            
        return false;
    }

    public boolean isOdd(){
        if(value % 2 != 0)
        return true;

        return false;
    }

    public boolean isPrime(){
        for(int i = 2; i < value; i++){
            if(value % i == 0){
                return false;
            }
        }
        return true;
    }

     public static boolean isEven(MyInteger integer){
        if(integer.getValue() % 2 == 0)
        return true;

        return false;
    }
     public static boolean isOdd(MyInteger integer){
        if(integer.getValue() % 2 != 0)
        return true;

        return false;
     }
     public static boolean isPrime(MyInteger integer){
        for(int i = 2; i < (integer.getValue()); i++){
            if(integer.getValue() % i == 0){
                return false;
            }
        }
        return true;
     }

     public boolean equals(int number){
        if(number == value)
        return true;

        return false;
     }

     public boolean equals(MyInteger number){
        if(number.getValue() == value)
        return true;

        return false;
     }

     public static int parseInt(char[] text){
        int charToInt = 0;

        for(int i = 0; i < text.length;i++){
            if(Character.isDigit(text[i])){
                charToInt = (charToInt * 10)  + text[i] - '0';
            }
        }

        return charToInt;
     }

     public static int parseInt(String text){
        int charToInt = 0;

        for(int i = 0; i < text.length();i++){
            if(Character.isDigit(text.charAt(i))){
                charToInt = (charToInt * 10)  + text.charAt(i) - '0';
            }
        }

        return charToInt;
     }



}
