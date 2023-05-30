package Exercises12;

public class Fraction {
    final int numerator;
    final int denominator;
    final double test;
    
    public Fraction(int numerator, int denominator) throws NullDenominatorException{
        this.numerator = numerator;
        if(denominator == 0){
            throw new NullDenominatorException();
        }
        this.denominator = denominator;

        test = numerator / denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }


}
