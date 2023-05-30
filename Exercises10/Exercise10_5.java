package Exercises10;

public class Exercise10_5 {
    public static void main(String[]args){
        StackOfIntegers stack = new StackOfIntegers();
        MyInteger prime = new MyInteger(2);

        int num = 120;
        while(num > 1){
            if(prime.isPrime() && num % prime.getValue() == 0){
                num /= prime.getValue();
                stack.push(prime.getValue());
            }else{
                prime.value++;
            }
        }

        int[] values = new int[stack.getSize()];

        for(int i = values.length; i > 0; i--){
            values[i-1] = stack.pop();
        }

        for(int i = 0; i < values.length;i++)
        System.out.print(values[i]);

        Integer[] list = {11,12};
        System.out.print("\n" + list[1]);
        int[] lisst = {1,2,3};
    
    }
}
