package Exercises8;
import java.util.*;

public class Exercise8_20 {
    public static void main(String[] args){

    char[][] board = new char[6][7];
      int player = 1;
     
      for(int i = 0; i < board.length;i++){
        for(int v = 0; v < board[i].length;v++){
            board[i][v] = ' ';
        }
        }
    
        while(!isConsecutiveFour(board)){
            printBoard(board);
            System.out.print("Drop a " + ((player % 2 == 0) ? "yellow" : "red") + " disk at column (0-6):");
            enter(board, player);
            System.out.println("\n\n");
            
            
            player++;
      }
      
      System.out.print("Player "  + ((--player % 2 == 0) ? "yellow" : "red") + " won");
    }



    public static void printBoard(char[][] board){
        for(int i = board.length-1; i >= 0;i--){
            for(int v = 0; v < board[i].length;v++){
                System.out.print("| " + board[i][v] + " ");
            }
        System.out.println("|");
        }
        
    }

    public static void enter(char[][] board,int r){
        Scanner input = new Scanner(System.in);    

        int position = input.nextInt();
        char turn = (r % 2 == 0) ? 'Y' : 'R';

        if(board[board.length-1][position] != ' '){
            System.out.print("No free spaces, try again in another column:");
            enter(board,r);
        }

        for(int i = 0; i < board.length;i++){
        if(board[i][position] == ' '){
            board[i][position] = turn;
            return; 
        }
       } 
    }

    public static boolean isConsecutiveFour(char[][] values){
        boolean full = true;
        for(int i = 0; i < values[values.length-1].length;i++){
            if(values[values.length-1][i] == ' ')     
                full = false;
        }
        if(full){
            System.out.print("Board is full");
            System.exit(0);
        }

        if(values[0].length >= 3){
            
            for(int i = 0; i < values.length;i++){

                for(int v = 0; v < values[i].length;v++){

                    if(values[i].length - v >= 3 && values[i][v] != ' '){
                        if(values[i][v] == values[i][v+1] && values[i][v] == values[i][v+2] && values[i][v] == values[i][v+3] )
                        return true;
                        
                    }
                    
                    
                }
            }
            
        }
        if(values.length >= 3){
            for(int i = 0; i < values.length;i++){

                for(int v = 0; v < values[i].length;v++){

                    if(values.length - i >= 4 && values[i][v] != ' '){
                        if(values[i][v] == values[i+1][v] && values[i][v] == values[i+2][v] && values[i][v] == values[i+ 3][v] )
                        return true;
                    }
                }
        }
    }
    if(values[0].length >= 3 && values.length >= 3){
        for(int i = 0; i < values.length;i++){

            for(int v = 0; v < values[i].length;v++){

                if(values[i].length - v >= 3 && values.length - i >= 3 && values[i][v] != ' '){
                    if(values[i][v] == values[i+1][v+1] && values[i][v] == values[i+2][v+2] && values[i][v] == values[i+ 3][v+3]  )
                    return true;
                }
                if(v >= 3 && values.length - i >= 3 && values[i][v] != ' '){
                    //i still increase because we're going down in the array
                    if(values[i][v] == values[i+1][v-1] && values[i][v] == values[i+2][v-2] && values[i][v] == values[i + 3][v - 3] )
                    return true;
                }
              }
            }

        }
        return false;
    }
}
