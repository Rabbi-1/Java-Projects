package application;

import model.BankAccount;

public class VarargsDemo {
    public static void main(String[] args){
        double total;
        BankAccount account1 = new BankAccount(100.0);
        BankAccount account2 = new BankAccount(500.0);
        BankAccount account3 = new BankAccount(1500.0);
        total = totalBalance(account1);
        System.out.println("Total: $" + total);
        total = totalBalance(account2);
        System.out.println("Total: $" + total);
        total = totalBalance(account3);
        System.out.println("Total: $" + total);
    }
    public static double totalBalance(BankAccount... accounts){
        double total = 0.0;
        for(BankAccount acctObject : accounts)
            total += acctObject.getBalance();
        return total;
    }
}
