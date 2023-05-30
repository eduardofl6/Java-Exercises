package Exercises11;
import java.util.Date;

public class Person {
    String name = "";
    String address = "";
    Long phoneNumber;
    String email = "";

    public Person(String name){
        this.name = name;
    }


    public Person(String name, String address,long phoneNumber,String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Person's name: " + name;
    }


}


