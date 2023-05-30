package Exercises11;

public class TestingAccount11_8 {
    public static void main(String[] args){
        Account11_8 account = new Account11_8("George",1122,1000);
        account.setAnnualRate(1.5);
    
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("Account holder name: " + account.getName() + "| Interest rate: " + account.getMonthlyInterestRate() + "| Balance: " + account.getBalance());

        for(int i = 0; i < account.transactions.size(); i++){
            System.out.println(account.transactions.get(i).getDescription());
        }
    }
}
