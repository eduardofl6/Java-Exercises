package Exercises9;

public class TestingAccount9_7 {
    public static void main(String[] args){
        Account9_7 newAccount = new Account9_7(1122,20000.0);
        newAccount.setAnnualRate(4.5);
        newAccount.withdraw(2500);
        newAccount.deposit(3000);
        System.out.printf("Balance %.2f\nMonthly Interest %.2f\nDate %s",newAccount.getBalance(),newAccount.getMonthlyInterest(),newAccount.getDate().toString());
    }
}
