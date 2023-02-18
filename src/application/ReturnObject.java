package application;
import model.BankAccount;

import java.util.Scanner;
public class ReturnObject {
    public static void main(String[] args){
        BankAccount account;
        account = getAccount();
        System.out.println("The account has a balance of $" + account.getBalance());
    }
    public static BankAccount getAccount(){
        double balance;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the account balance.");
        balance = keyboard.nextDouble();
        return new BankAccount(balance);
    }
}
