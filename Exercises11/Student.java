package Exercises11;

public class Student extends Person{
    final String status[] = {"fresh-man", "sophomore", "junior", "senior"};
    int nowStatus;

    public Student(int status,String name){
        super(name);
        nowStatus = status;
    }

    @Override
    public String toString(){
        return "Student's name: " + name;
    }
}
