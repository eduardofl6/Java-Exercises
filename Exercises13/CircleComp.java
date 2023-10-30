package Exercises13;

import javax.lang.model.util.ElementScanner6;

public class CircleComp extends GeometricObject implements Comparable<CircleComp> {
     private double radius;

     public CircleComp() {
     }
    
     public CircleComp(double radius) {
    this.radius = radius;
    }
    
     public CircleComp(double radius,
     String color, boolean filled) {
     this.radius = radius;
     setColor(color);
     setFilled(filled);
     }
    
     /** Return radius */
     public double getRadius() {
     return radius;
     }
    
     /** Set a new radius */
     public void setRadius(double radius) {
     this.radius = radius;
     }
    
     /** Return area */
     public double getArea() {
     return radius * radius * Math.PI;
     }
    
     /** Return diameter */
     public double getDiameter() {
     return 2 * radius;
     }
    
     /** Return perimeter */
     public double getPerimeter() {
     return 2 * radius * Math.PI;
     }

     @Override
     public int compareTo(CircleComp ob){
        if(this.getRadius() > ob.getRadius()){
            return 1;
        }else if(this.getRadius() < ob.getRadius()){
            return -1;
        }
        else 
            return 0;
        }
    
    @Override
    public boolean equals(Object ob){
        if(!(ob instanceof CircleComp))
            return false;
            
        if(this.getRadius() == ((CircleComp)ob).getRadius())
            return true;
        else
            return false;
    }

     /** Print the circle info */
     public void printCircle() {
     System.out.println("The circle is created " + getDateCreated() +
     " and the radius is " + radius);
     }
     }