package Exercises10;

public class Course {
     private String courseName;
     private String[] students = new String[100];
     private int numberOfStudents;
    
     public Course(String courseName) {
     this.courseName = courseName;
     }
    
     public void addStudent(String student) {
    if(numberOfStudents < 100){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }else{
        String[] backup = new String[students.length + 1];
        for(int i = 0; i < backup.length; i++){
            backup[i] = students[i];
        }
        backup[numberOfStudents++] = student;
        students = backup;
    }
     }

     public void dropStudent(){
        students[numberOfStudents--] = "\0";
     }

     public void clear(){
        students = new String[100];
     }
    
     public String[] getStudents() {
        int i = 0;

        for(;i < students.length &&  students[i].charAt(0) != '\0' ; i++){
        }

        String[] stundentsClass = new String[--i];

        for(int v = 0; v < stundentsClass.length;v++){
            stundentsClass[v] = students[v];
        }
        
        return stundentsClass;
        
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