public class Exercise7_5_1 {
    
    public static void main(String[] args){
        int[] source = {3, 4, 5};
        int[] target = new int[source.length];

        System.arraycopy(source,0,target,0,target.length);

        for(int i = 0; i < target.length;i++){
            System.out.print(target[i] + " ");
        }

        int[] list = {1, 2, 3, 5, 4};
    for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
// Swap list[i] with list[j]
    int temp = list[i];
    list[i] = list[j];
    list[j] = temp;
}
System.out.println(list[0]);

//The problem with the code above is: does it reverse the array? yeah, but just until the middle of the array, after that the array come back to
// unreverse, because now the code is replacing already replaced stuff

for (int i = 0, j = list.length - 1; i < Math.round(list.length) -1 ; i++, j--) {
    // Swap list[i] with list[j]
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    System.out.print(list[0]);
    }

    // Now the code works because it'll replace just until the half of the array, if the array is odd, it'll replace until the middle
    // And how now we're working with the real value of numbers, we decrease 1
}
