import java.util.*;

public class Exercises11_12 {
    public static void main(String[] args){
        /*int[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array)); */
        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        /*int[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
          System.out.println(java.util.Collections.max(array)); */

          Integer[] array1 = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        System.out.println(java.util.Collections.max(new ArrayList<Integer>(Arrays.asList(array1))));
        // You have to use Arrays.asList to give ArrayList a parameter as list, because else it won't to  accept the parameter
    }
}
