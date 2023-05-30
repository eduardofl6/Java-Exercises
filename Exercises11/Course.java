package Exercises11;
import java.util.*;

public class Course {
     private String courseName;
     private ArrayList<String> students = new ArrayList<>(100);
     private int numberOfStudents;
    
     public Course(String courseName) {
     this.courseName = courseName;
     }
     public void addStudent(String student) {
     students.set(numberOfStudents, student);
     numberOfStudents++;
     }
    
     public String[] getStudents() {
        return students.toArray(new String[students.size()]);
     }
    
     public int getNumberOfStudents() {
     return numberOfStudents;
     }
    
     public String getCourseName() {
     return courseName;
     }
    
     public void dropStudent(String student) {
     // Left as an exercise in Programming Exercise 10.9
     }
     }