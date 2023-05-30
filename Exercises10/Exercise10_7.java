package Exercises10;
import java.util.*;

public class Exercise10_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Account9_7[] accounts = new Account9_7[10];
        
        for(int i = 0; i < accounts.length ; i++){
            accounts[i] = new Account9_7(i,100);
        }

        while(1 > 0){
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            if(id > 9 || id < 0){
                System.out.println("Wrong input, please try another Id");
            }else{
                int option = 0;
                while(option != 4){
                    System.out.println("Main menu\n 1: check balance\n 2: withdraw\n 3: deposit\n 4: exit");
                    System.out.print("Enter a choice: ");
                    option = input.nextInt();
                    switch(option){
                        case 1: System.out.println("The balance is: " + accounts[id].getBalance()); break;
                        case 2: System.out.print("Enter an amount to withdraw: "); accounts[id].withdraw(input.nextDouble()); break;
                        case 3: System.out.print("Enter an amount to deposit: "); accounts[id].deposit(input.nextDouble()); break;
                        case 4: break;
                        default : System.out.print("Unknown input, please try again");
                    }


                }
            }

        }
        
    }
}
