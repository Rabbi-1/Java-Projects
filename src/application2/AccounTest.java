package application2;

import model.BankAccount;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AccounTest {
    public static void main(String[] arg) {
        String input;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat dollar = new DecimalFormat("#,###.00");
        System.out.println("What is your account's starting balance?");
        input = keyboard.nextLine();
        BankAccount account = new BankAccount(input);
        System.out.println("How much were you paid this month?");
        input = keyboard.nextLine();
        account.deposit(input);
        System.out.println("Your pay has been deposited. \n Your current balance is $ " + dollar.format(account.getBalance()));
        System.out.println("How much would you like to withdraw?");
        input = keyboard.nextLine();
        account.withdraw(input);
        System.out.println("Now your balance is $" + dollar.format(account.getBalance()));


    }
}
