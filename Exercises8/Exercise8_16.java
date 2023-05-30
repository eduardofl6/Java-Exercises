package Exercises8;

public class Exercise8_16 {
    public static void main(String[] args){
        int[][] m = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
        for(int i = 0; i < m.length;i++){

            for(int v = 0; v < m[i].length; v++){
                System.out.print(m[i][v] + " ");
            }
            System.out.println();
        }

        sort(m);
    }

    public static void sort(int m[][]){
        
        int[] sum = new int[m.length];
        for(int i = 0; i < m.length;i++){
            for(int v = 0; v < m[i].length;v++){
                sum[i] += m[i][v];
            }
        }

        for(int i = 0; i < sum.length;i++){
            System.out.print(sum[i] + " ");
        }
    }
    
}
