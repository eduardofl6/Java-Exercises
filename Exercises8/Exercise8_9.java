package Exercises8;
import java.util.*;

public class Exercise8_9 {
    public static void main(String[] args){
        ticTacToe();
    }


    public static void ticTacToe(){
        Scanner input = new Scanner(System.in);

        //Fill all elements with blank spaces
        char[][] board = new char[3][3];
        for(int i = 0; i < board.length;i++){
            for(int v = 0; v < board[i].length;v++){
                board[i][v] = ' ';
            }

        }

        int row;
        int column;
        int round = 1;
        while(!win(board,round)){

            printBoard(board);
            System.out.print("Enter a row (0, 1, or 2) for player " + ((round % 2 == 0) ? "O" : "X")+ ": ");
             row = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player " + ((round % 2 == 0) ? "O" : "X")+ ": ");
             column = input.nextInt();
            
            while(!place(board, row, column, round)){
                System.out.print("Enter a row (0, 1, or 2) for player " + ((round % 2 == 0) ? "O" : "X")+ ": ");
                row = input.nextInt();
               System.out.print("Enter a column (0, 1, or 2) for player " + ((round % 2 == 0) ? "O" : "X") + ": ");
                column = input.nextInt();
            } 
            if(win(board,round)){
                printBoard(board);
                break;
            }
            round++;
        }
    }

    public static boolean place(char[][] board,int row, int column,int round){
      char player = ((round % 2 == 0) ? 'O' : 'X');
      
        if(board[row][column] == ' '){
            board[row][column] = player;
            return true;
        }
        else
        System.out.println("Position in use, try again");
        return false;
    }



    public static boolean win(char[][] board, int round){
    char player = ((round % 2 == 0) ? 'O' : 'X');
   
    for(int i = 0; i < board[0].length;i++){
    if(board[0][i] == player && player == board[2][i] && player == board[1][i]){
        System.out.println(player + " won!");
        return true;
    }
   }

   for(int i = 0; i < board.length;i++){
    if(board[i][0] == player && player == board[i][1] && player == board[i][2]){
        System.out.println(player + " won!");
        return true;
    }
   }
   if(board[0][0] == player && board[1][1] == player && board[2][2] == player ){
    System.out.println(player + " won!");
    return true;
   }else if(board[0][2] == player && board[1][1] == player && board[2][0] == player ){
    System.out.println(player + " won!");
    return true;
   }
   
   
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board[i].length;j++){
                if(board[i][j] == ' '){
                    return false;
                    
                }
            }
        }
        System.out.println("Draw");
        return true;
    }

    public static void printBoard(char[][] board){
        System.out.println("...............");
        for(int i = 0; i < board.length;i++){
            System.out.print("| ");
            for(int j = 0; j < board[i].length;j++){
                System.out.print(board[i][j] + "  |");
            }
        System.out.println();

        }
        System.out.println("...............");
    }
}
