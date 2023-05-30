package Exercises8;

public class Exercise8_10 {
    public static void main(String[] args){
        largestRowAndColumn();
    }

    public static void largestRowAndColumn(){

        int[][] five = new int[5][5];

        for(int i = 0; i < five.length;i++){

            for(int j = 0; j < five[i].length;j++){
                five[i][j] = zeroOrOne();

            }

        }
        int rowIndex = 0;
        int largestRow = 0;
        
       
        for(int i = 0; i < five.length;i++){
            

            int rowCount = 0;
            for(int j = 0; j < five[i].length;j++){         
                
                if(five[i][j] == 1)
                rowCount++;

            }



            if(rowCount > largestRow){
                largestRow = rowCount;
                rowIndex = i;
            }

        }

        int columnIndex = 0;
        int largestColumn = 0;


        for(int i = 0; i < five[0].length;i++){
        
            int columnCount = 0;
            for(int v = 0; v < five.length;v++){
                if(five[v][i] == 1){
                    columnCount++;
                }
            }
            if(largestColumn < columnCount){
                largestColumn = columnCount;
                columnIndex = i;
            }

        }


        for(int i = 0; i < five.length;i++){
            for(int v= 0; v < five[i].length;v++){
                System.out.print(five[i][v]);
            }
            System.out.println();
        }
        System.out.format("Largest row index: %d\nLargest column index: %d",rowIndex,columnIndex);
    }

    public static int zeroOrOne(){
        return (int)(Math.random() * 2);
    }
}
