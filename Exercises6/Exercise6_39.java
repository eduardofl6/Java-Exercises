package Exercises6;
import java.util.*;

public class Exercise6_39 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three points for p0, p1, and p2: ");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

        calculate(x, y, x1, y1, x2, y2);
    }


    public static void calculate(double x0, double y0,
    double x1, double y1, double x2, double y2){
        if(rightOfTheLine(x0, y0, x1, y1, x2, y2)){
            System.out.format("(%.1f, %.1f) is on the right side of the line from (%.1f, %.1f) to (%.1f, %.1f)",x0, y0, x1, y1, x2, y2 );

        }else if(leftOfTheLine(x0, y0, x1, y1, x2, y2)){
            System.out.format("(%.1f, %.1f)) is on the left side of the line from (%.1f, %.1f) to (%.1f, %.1f)",x0, y0, x1, y1, x2, y2 );

        }else if(onTheLineSegment(x0, y0, x1, y1, x2, y2)){
            System.out.format("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)",x0, y0, x1, y1, x2, y2 );

        }else if(onTheSameLine(x0, y0, x1, y1, x2, y2)){
            System.out.format("(%.1f, %.1f) is on the same line from (%.1f, %.1f) to (%.1f, %.1f)",x0, y0, x1, y1, x2, y2 );

        }else 
        System.out.print("Wrong input");

        
    }


public static boolean rightOfTheLine(double x0, double y0,
double x1, double y1, double x2, double y2){
    double sides = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
if(sides < 0)
 return true;
 else
 return false;
}


    /** Return true if point (x2, y2) is on the left side of the
* directed line from (x0, y0) to (x1, y1) */
public static boolean leftOfTheLine(double x0, double y0,
double x1, double y1, double x2, double y2){
    double sides = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
if(sides > 0)
 return true;
 else
 return false;
}
/** Return true if point (x2, y2) is on the same
* line from (x0, y0) to (x1, y1) */
public static boolean onTheSameLine(double x0, double y0,
double x1, double y1, double x2, double y2){
    double sides = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);

    if(sides == 0)
 return true;
 else
 return false;
}
/** Return true if point (x2, y2) is on the
* line segment from (x0, y0) to (x1, y1) */
public static boolean onTheLineSegment(double x0, double y0,
double x1, double y1, double x2, double y2){

    double sides = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
if(sides == 0){


    if(x0 >= x1 && y0 >= y1 && x0 <= x2 && y0 <= y2){
        return true;
    }else if(x0 <= x1 && y0 <= y1 && x0 >= x2 && y0 >= y1){
        return true;
    }
}
    return false;
}
}
