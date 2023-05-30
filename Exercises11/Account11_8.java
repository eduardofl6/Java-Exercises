package Exercises11;
import java.util.*;

public class Account11_8 {
    private int id;
    private double balance;
    private  double annualInterestRate;
    private Date dateCreated = new Date();
    private String name;
     ArrayList<Transaction> transactions = new ArrayList<>(); 

    Account11_8(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    Account11_8(int ID, double BALANCE){
        id = ID;
        balance = BALANCE;
    }

    Account11_8(String name,int ID, double BALANCE){
        this.name = name;
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

    public String getName(){
        return name;
    }

    public void withdraw(double amount){
        if(balance - amount < 0.0){
            return;
        }
        balance -= amount;

        transactions.add(new Transaction('W', amount, balance, ("Withdraw of " + amount + "| New balance:" + balance )));
    }
    public void deposit(double amount){
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, ("Deposit of " + amount + "| New Balance: " + balance )));
    }

    @Override
    public String toString(){
        return " Account id: " + getId() + "\n Account balance:" + getBalance() + "\n Account creation date: " + getDate() + "\n Annual interest rate: " + getMonthlyInterestRate();
    }
}
