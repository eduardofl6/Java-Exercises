package Exercises6;

public class Exercise6_32 {
    
    public static void main(String[] args){
      int result = 0;
      long win = 0;
      long matches = 0;

        for(int i = 0; i < 15000; i++){
            result = craps();
            if(result == 7 || result == 11){ // natural
                System.out.println("You win");
                win++;
            
            } else if( result == 2|| result == 3|| result == 12){ // craps
                System.out.println("You lose");
           
            }else{
                int result2 = 0;;
               System.out.println("point is " + result);
                while(1 > 0){
                    result2 = craps();
                    if(result2 == result){
                        System.out.println("You win");
                        win++;
                        break;
                    }else if(result2 == 7){
                        System.out.println("You lose");
                        break;
                    }
                }
            }
            matches++;

        }
        System.out.print("\nTotal wins: " + win + "\n Total matches: " + matches);
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