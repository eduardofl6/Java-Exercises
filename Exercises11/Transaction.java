package Exercises11;

public class Transaction {
    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;


    public java.util.Date getDate(){
        return date;
    }

    public void setDate(java.util.Date date){
        this.date = date;
    }

    public char getType(){
        return type;
    }

    public void setType(char type){
        this.type = type;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }

    Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }


}
