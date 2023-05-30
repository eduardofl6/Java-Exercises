import java.lang.reflect.WildcardType;

public class ComparableRectangle extends Rectangle
 implements Comparable<ComparableRectangle> {
 /** Construct a ComparableRectangle with specified properties */
 public ComparableRectangle(double width, double height) {
 super(width, height);
 }

 @Override // Implement the compareTo method defined in Comparable
 public int compareTo(ComparableRectangle o){
 return (new Double(getarea()).compareTo(o.getarea()));
 }
 
 @Override
 public double getarea(){
    return width * height;
 }

 @Override // Implement the toString method in GeometricObject
 public String toString() {
 return super.toString() + " Area: " + getArea();
 }
 }