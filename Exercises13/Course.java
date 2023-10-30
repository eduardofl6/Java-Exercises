package Exercises13;

 public class Course implements Cloneable {
 private String courseName;
 private String[] students = new String[0];
 private int numberOfStudents;

 public Course(String courseName) {
 this.courseName = courseName;
 }

 public void addStudent(String student) {
 numberOfStudents++;
 String[] newStudents = new String[numberOfStudents];
 
 for(int i = 0; i < students.length;i++){
    newStudents[i] = students[i];
 }

 students = newStudents;

 students[numberOfStudents] = student;
 }

 public String[] getStudents() {
 return students;
 }

public void clear(){
students = new String[100];
}

 public int getNumberOfStudents() {
 return numberOfStudents;
 }

 public String getCourseName() {
 return courseName;
 }

 public void dropStudent(String student) {
students[numberOfStudents--] = "\0";
 }

 @Override
 public Object clone()throws CloneNotSupportedException{
    Course courseClone = (Course)super.clone();
    courseClone.clear();

    for(int i = 0; i < students.length;i++){
        courseClone.addStudent(students[i]);
    }

    return (Object)courseClone;
 }

}