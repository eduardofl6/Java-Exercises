package Exercises10;

import java.rmi.StubNotFoundException;

public class Exercise10_9 {
    public static void main(String[] args){
        Course course = new Course("Java by Drano");

        course.addStudent("João");
        course.addStudent("Pedro");
        course.addStudent("Carlos");

        course.dropStudent();

        String[] students = course.getStudents();

        for(int i = 0; i < students.length;i++){
            System.out.println(students[i]);
        }

        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(10);
        System.out.print(queue.dequeue() );

    }
}
