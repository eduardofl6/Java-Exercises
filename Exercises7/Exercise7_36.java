package Exercises7;


//Unfinished
public class Exercise7_36 {
    public static void main(String[] args){
        String[] board = new String[72];
        boolean[] houses = new boolean[72];

        for(int i = 0; i < board.length;i++){
            board[i] = " | ";
            houses[i] = true;
        }

       for(int i = 8; i < 72; i+= 9){
        houses[i] = false;
        board[i] = " |\n";
       }

        eightQueens(board, houses);
        printArray(board);
    }

    public static void eightQueens(String[] board, boolean[] houses){
        int random = 0;
        for(int i = 0; i < 8; i++){
            printArray(board);
            
        while((houses[(random = (int)(Math.random() * 8)) + (i * 9)] ) == false)
        System.out.print("o");
            fill(board, houses, random, i);
            
        }
            
        
    }

    public static void fill(String[] b,boolean [] h,int x, int y){
        // Vertical
        for(int i = y,v = x; i < 72; i +=9){

            h[v] = false;
            v += 9;
        }
        b[y*9+x] = " |Q";
        //Horizontal
        for(int i = y * 9; b[i] != " |\n";i++){

            h[i] = false;
        }
        int minusLeft = 0;
        if(x < y){
            minusLeft = x;
        }else
            minusLeft = y;

        int pp = y * 9 + x;

        for(; minusLeft > 0; minusLeft--, pp -=10);

        if(b[pp] != " |Q")
        b[pp] = " | ";

        int cornerDistance = 0;

        for(int t = pp; b[t++] != " |\n"; cornerDistance++);
        cornerDistance--;
        for(;cornerDistance > 0 && pp < 72 ; cornerDistance--,pp +=10){
           System.out.println(pp);

        h[pp] = false;
       }

    }


    public static void printArray(boolean[] array){
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i]+" ");
                if(i > 0 && (i+1) % 9 ==0){
                    System.out.println();
                }


        }
        System.out.println();

    }    

    public static void printArray(String[] array){
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i]+((array[i] != "\n") ? "" : ""));


        }

    }
}
