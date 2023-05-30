package Exercises6;

public class Exercise6_30 {

    public static void main(String[] args){

        int result = 0;
        while(1 > 0){
            result = craps();
            if(result == 7 || result == 11){ // natural
                System.out.print("You win");
                break;
            } else if( result == 2|| result == 3|| result == 12){ // craps
                System.out.print("You lose");
                break;
            }else{
                int result2 = 0;;
               System.out.println("point is " + result);
                while(1 > 0){
                    result2 = craps();
                    if(result2 == result){
                        System.out.print("You win");
                        break;
                    }else if(result2 == 7){
                        System.out.print("You lose");
                        break;
                    }
                }
                break;
            }
        }
    }

    public static int roll(){
        int value = (int)(Math.random() * 6)+1;

        return value;
    }

    public static int craps(){
        int x = roll();
        int y = roll();

        System.out.println("You rolled " + x + " + " + y + " = " + (x+y));

        return x+y;
    }

}
