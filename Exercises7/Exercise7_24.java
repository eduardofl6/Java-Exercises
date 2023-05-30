package Exercises7;

public class Exercise7_24 {
    public static void main(String[] args) {
        String[] picks = new String[8];
      System.out.print("Number of picks: " +   howmanypicks(picks));
        
         }

    public static int howmanypicks(String[] chose){
        int picks = 0;
        String[] array = return4Pick();
        while(1>0){
            chose = array;
            if(array[1] != array[3] && array[1] != array[5] && array[1] != array[7] &&
               array[3] != array[5] && array[3] != array[7] && array[3] != array[1] &&
               array[7] != array[5] && array[7] != array[3] && array[7] != array[1] &&
               array[5] != array[3] && array[5] != array[7] && array[5] != array[1]
               ){
                for(int i = 0; i < array.length;){
                    System.out.println(array[i++] + " of " + array[i++]);
                }
                return ++picks;
            }
               else{
                   picks++;
                    array = return4Pick();
               }

        }
    }


    public static String[] return4Pick(){
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "Jack", "Queen", "King"};
       
        // Initialize the cards
        for (int i = 0; i < deck.length; i++)
        deck[i] = i;
       
        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
        // Generate an index randomly
        int index = (int)(Math.random() * deck.length);
        int temp = deck[i];
        deck[i] = deck[index];
        deck[index] = temp;
        }
       
        String[] end = new String[8];

        // Display the first four cards
        for (int i = 0,j = 0; i < 4; i++) {
        String suit = suits[deck[i] / 13];
        String rank = ranks[deck[i] % 13];
        end[j++] = rank;
        end[j++] = suit;

        }
        return end;
    }
}
