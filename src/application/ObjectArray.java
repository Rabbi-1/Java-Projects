package application;
import model.BankAccount;

import java.util.Scanner;
public class ObjectArray {
    public static void main(String[] args){
        final int NUM_ACCOUNTS = 3;
        BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];
        createAcounts(accounts);
        System.out.println("Here are the balances of each acount: ");
        for(int index = 0;index < accounts.length; index++){
            System.out.println("Account " + (index + 1) + ":$" + accounts[index].getBalance());
        }
    }
    private static void createAcounts(BankAccount array[]){
        double balance;
        Scanner keyboard = new Scanner(System.in);
        for(int index = 0; index < array.length; index++){
            System.out.println("Enter the balance for acount " + (index + 1) + ": " );
            balance = keyboard.nextInt();
            array[index] = new BankAccount(balance);
        }
    }
}
