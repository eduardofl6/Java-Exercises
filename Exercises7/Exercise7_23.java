package Exercises7;

public class Exercise7_23 {
    public static void main(String[] args){
        boolean[] lockers = new boolean[100];

        lockers(lockers);

        for(int i = 0; i < lockers.length;i++){
            if(lockers[i] == true)
                System.out.println("Locker["+(i+1)+"] " + ((lockers[i])? "open" : ""));
        }
    }
    
    public static void lockers(boolean[] lockers){
        lockers[0] = true;
        System.out.println("|||||" + lockers[99]);
        for(int i = 2; i < lockers.length;i++){

            for(int j = i ; j < lockers.length;j += i+1){
                System.out.print((j+1) + " ");
                lockers[j] = !lockers[j];

            }
            System.out.println();

        }
    }



}
