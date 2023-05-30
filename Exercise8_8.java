public class Exercise8_8 {
    public static void main (String[] args){
        int[][][] variable;
        variable = new int[4][6][5];
        /*
         *  char[][][] x = new char[12][5][2] is equal to 12 * 5 * 2 = 120 elements
         * x.length = 12 elements
         * x[2].length = 5 elements
         * x[0][0].length = 2 elements
         */
        int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6},{7, 8}}};
System.out.println(array[0][0][0]);
System.out.println(array[1][1][1]);
    }    
}
