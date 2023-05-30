package Exercises11;

public class TestingPerson{
    public static void main(String[] args){
        System.out.println(new Person("Pedro"));
        System.out.println(new Student(1, "Carlos"));
        System.out.println(new Employee("João"));
        System.out.println(new Faculty("Eduardo"));
        System.out.println(new Staff("Simp","Vitor"));
    }
}