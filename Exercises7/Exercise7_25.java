package Exercises7;
import java.util.*;

public class Exercise7_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a,b and c: ");
        
        double[] equation = new double[3];
        
        for(int i = 0; i < equation.length;i++){
            equation[i] = input.nextDouble();
        }

        double[] roots = new double[2];
        
        int totalroots = solveQuadratic(equation, roots);       
        System.out.println(equation[0] + "x^2 + "+ equation[1] + "x + " + equation[2] + " has " + totalroots + ((totalroots > 1) ? " roots": " root"));
        for(int i = 0; i < totalroots;i++){
            System.out.println("Root" + (i+1) + ": " + roots[i]);
        }

    }

    public static int solveQuadratic(double[] eqn, double[] roots){
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double discriminant = Math.pow((Math.pow(b,2) + (-4 * a * c)),0.5);

        double r1 = 0, r2 = 0;

		if(discriminant > 0)
			{
			r1 = ((-b) + discriminant) / (2 * a);
			r2 = ((-b) - discriminant) / (2 * a);

                roots[0] = r1;
                roots[1] = r2;

            return 2;
			}
		else if (discriminant == 0)
			{			
			r1 = ((-b) + discriminant) / (2 * a);
            roots[0] = r1;
            return 1;
        }
		else 

        return 0;
    }
}
