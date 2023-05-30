package Exercises11;

public class Employee extends Person{
    String office = "";
    double salary;
    MyDate dataHired;

    public Employee(String name){
        super(name);
    }

    public Employee(String office, double salary,MyDate dataHired,String name){
        super(name);
        this.office = office;
        this.salary = salary;
        this.dataHired = dataHired;

       
    }

    @Override
    public String toString(){
        return "Employee's name: " + name;
    }
    
}
