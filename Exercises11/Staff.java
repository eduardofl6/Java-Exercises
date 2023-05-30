package Exercises11;

public class Staff extends Employee{
    String title;

    public Staff(String title,String name){
        super(name);
        this.title = title;    
    }

    @Override
    public String toString(){
        return "Staff's name: " + super.name ;
    }
}
