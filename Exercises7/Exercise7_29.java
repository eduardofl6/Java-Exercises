package Exercises7;


public class Exercise7_29 {
    public static void main(String[] args){

        permutationDice();
        
        }

        public static void permutationDice(){
            int permutations = 25;
    
            int[] sumOfNine = new int[permutations * 3];
    
            int[] dice = new int[3];

            for(int i = 0, v = 0; i < permutations;){
  
                int x = (int)(Math.random() * 6);
                int y = (int)(Math.random() * 6);
                int z = (int)(Math.random() * 6);
                
                dice[0] = x;
                dice[1] = y; 
                dice[2] = z;

                if(x + y + z == 9){
                    if(!checker(sumOfNine,dice,3)){
                        i++;
                        addTo(sumOfNine, v, dice, 3);
                        v+=3;
                        printArray(dice);  
                        System.out.println(dice[0] + " + " + dice[1] + " + "+ dice[2] + " = " + (x+y+z));                     
                    }

                }

            }
    
        }
        
    public static boolean checker(int[] array,int[] x,int b){
        for(int i = 0; i < array.length;i +=b){

            if(x[0] == array[i] && x[1] == array[i+1] && x[2] == array[i+2]){
                return true;
            }

        }
       // printArray(x);
        return false;
    }

    public static void addTo(int[] destiny, int t,int[] source,int b){
        for(int i = t,v = 0; i < t+b ;i++){
            destiny[i] = source[v++];
        }
      //  printArray(destiny);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    }
