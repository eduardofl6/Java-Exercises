package Exercises10;

public class Exercise10_6 {
    public static void main(String[] args){
        StackOfIntegers primes = new StackOfIntegers(30);
        MyInteger number = new MyInteger(120);

        while(number.getValue() > 1){

            if(number.isPrime()){
                primes.push(number.getValue());
            }
            number.value--;
        }

        int[] values = new int[primes.getSize()];

        for(int i = values.length; i > 0; i--){
            values[i-1] = primes.pop();
        }

        for(int i = 0; i < values.length;i++)
        System.out.print(values[i] +" ");
    }
}
