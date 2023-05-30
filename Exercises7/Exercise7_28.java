package Exercises7;
import java.util.Scanner;

public class Exercise7_28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter four integers: ");
        int[] integers = new int[4];
        for(int i = 0; i < integers.length;i++){
            integers[i] = input.nextInt();
        }
    
        permutation(integers);

    }

    public static void permutation(int[] numbers){
        int permutations = 1;

        for(int i = numbers.length; i > 0; i--)
            permutations *= i;

        int[] totalpermutations = new int[permutations * 4];

        for(int i = 0, v = 0; i < permutations;){
           int calc = 0;
            int x = (int)(Math.random() * 4);
            int y = (int)(Math.random() * 4);
        swap(numbers,x,y);
        if(checker(totalpermutations, numbers,4)){
            
        }else{
            addTo(totalpermutations,v,numbers);
            printArray(numbers);
            System.out.print("|"+i+"|");
            v+=4;
            i++;
        }
  

        }

    }

    public static void addTo(int[] destiny, int t,int[] source ){
        for(int i = t,v = 0; i < t+4 ;i++){
            destiny[i] = source[v++];
        }
      //  printArray(destiny);
    }

    public static boolean checker(int[] array,int[] x,int b){
        for(int i = 0; i < array.length;i +=b){

            if(x[0] == array[i] && x[1] == array[i+1] && x[2] == array[i+2] && x[3] == array[i+3]){
                return true;
            }

        }
       // printArray(x);
        return false;
    }

    public static void swap(int[] num, int x, int y){
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }


    public static void printArray(int[] array){
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
}
