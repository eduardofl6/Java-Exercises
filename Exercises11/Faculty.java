package Exercises11;

public class Faculty extends Employee{
    double officeHours;
    String rank;

    public Faculty(String name){
        super(name);
    }

    public Faculty(double officeHours,String rank,String name){
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Faculty's name: " + name;
    }
}
