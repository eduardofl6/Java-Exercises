package Exercises11;

public class SavingAccount extends Account9_7 {
   
    SavingAccount(){
        
    }
   
    @Override
    public void withdraw(double amount){
        if(getBalance() < 0.0){
            return;
        }
        setBalance(getBalance()-amount);
    }
}
