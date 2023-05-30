package Exercises11;

public class CheckingAccount extends Account9_7{

    CheckingAccount(){
        
    }

    @Override
    public void withdraw(double amount){
        setBalance(getBalance() - amount);
    }    
}
