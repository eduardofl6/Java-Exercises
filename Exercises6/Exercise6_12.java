package Exercises6;

public class Exercise6_12 {

    public static void main(String[] args) {

        printNumbers(100,1,10);
    }

    public static void printNumbers(int num1, int num2, int
        numberPerLine){

            int max = ((num1 < num2) ? num2 : num1);
            int min = ((num1 < num2) ? num1 : num2);

        for(int i = 0; min <= max; min++, i++){
            if(i % numberPerLine == 0){
                System.out.print("|");
                System.out.println();
            }
            System.out.print((char) min + " ");

        }



    }
}
