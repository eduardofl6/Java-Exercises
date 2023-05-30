package Exercises10;

public class Exercise10_3 {
    public static void main(String[] args){
        MyInteger num1 = new MyInteger(10);

        System.out.println(num1.getValue());
        System.out.println(num1.isEven());
        System.out.println(num1.isOdd());
        System.out.println(num1.isPrime());
        System.out.println();
        System.out.println(MyInteger.isEven(new MyInteger(10)));
        System.out.println(MyInteger.isOdd(new MyInteger(10)));
        System.out.println(MyInteger.isPrime(new MyInteger(13)));
        System.out.println();
        System.out.println(MyInteger.parseInt(new char[]{'1','2','A','b','4'}));
        System.out.println(MyInteger.parseInt("ABC1DEF2GHI4"));

    }
}
