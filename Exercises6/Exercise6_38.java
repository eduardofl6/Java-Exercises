package Exercises6;

public class Exercise6_38 {

    public static void main(String[] args){

        for(int i = 1; i <= 200; i++){
            System.out.print(getRandomUpperCaseLetter() + " ");
            System.out.print((i % 10 == 0) ? '\n' : "");
        }

        System.out.print("\n\n\n\n");

        for(int i = 1; i <= 200; i++){
            System.out.print(getRandomDigitCharacter() + " ");
            System.out.print((i % 10 == 0) ? '\n' : "");
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {
    return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
     }

      public static char getRandomDigitCharacter() {
     return getRandomCharacter('0', '9');
     }

      public static char getRandomUpperCaseLetter() {
         return getRandomCharacter('A', 'Z');
        }
}
