package Exercises9;

public class QuadraticEquation9_10 {
    private double a;
    private double b;
    private double c;

    QuadraticEquation9_10 (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return (Math.pow(b,2)) - (4 * a * c);
    }

    public double getRoot1(){
       if(this.getDiscriminant() < 0)
        return 0;

        return ((-b) + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2(){
        if(this.getDiscriminant() < 0)
        return 0;

        return ((-b) - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
