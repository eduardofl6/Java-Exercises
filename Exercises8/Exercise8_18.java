package Exercises8;

public class Exercise8_18 {
    public static void main(String[] args){
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        for(int i = 0; i < m.length;i++){

            for(int v = 0; v < m[i].length;v++){
                System.out.print(m[i][v] + " ");
            }
            System.out.println();
        }
        System.out.print("Shuffle----------\n");
        shuffle(m);
    
        for(int i = 0; i < m.length;i++){

            for(int v = 0; v < m[i].length;v++){
                System.out.print(m[i][v] + " ");
            }
            System.out.println();
        }
    }

    public static void shuffle(int[][] m){
        for(int i = 0; i < m.length;i++){

                int row = (int)(Math.random() * m.length);
                int[] temp = m[i];
                m[i] = m[row];
                m[row] = temp;

            }
        }

    }

