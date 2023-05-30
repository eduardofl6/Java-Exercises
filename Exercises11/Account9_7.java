package Exercises11;
import java.util.*;

public class Account9_7 {
    private int id;
    private double balance;
    private  double annualInterestRate;
    private Date dateCreated = new Date();

    Account9_7(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    Account9_7(int ID, double BALANCE){
        id = ID;
        balance = BALANCE;
    }

    public int getId(){
        return id;
    }

    public void setId(int ID){
        id = ID;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double BALANCE){
        balance = BALANCE;
    }

    public double getRate(){
        return annualInterestRate;
    }

    public void setAnnualRate(double newRate){
        annualInterestRate = newRate / 100;
    }

    public Date getDate(){
        return new Date(dateCreated.getTime());
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return  balance * this.getMonthlyInterestRate();
    }

    public void withdraw(double amount){
        if(balance - amount < 0.0){
            return;
        }
        balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public String toString(){
        return " Account id: " + getId() + "\n Account balance:" + getBalance() + "\n Account creation date: " + getDate() + "\n Annual interest rate: " + getMonthlyInterestRate();
    }
}

