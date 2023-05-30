package Exercises11;

public class TestingAccounts {
    public static void main(String[] args){
        Account9_7 account1 = new Account9_7();
        SavingAccount account2 = new SavingAccount();
        CheckingAccount account3 = new CheckingAccount();

        account1.setBalance(100);
        account2.setBalance(100);
        account3.setBalance(100);
    
    
        account1.withdraw(120);
        account2.withdraw(120);
        account3.withdraw(120);

        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());

            System.out.print("------------------------------------------------------------\n");

        account1.withdraw(120);
        account2.withdraw(120);
        account3.withdraw(120);

        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
        }
}
