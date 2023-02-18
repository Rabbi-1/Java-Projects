package application;
import model.BankAccount;
import java.io.*;

import java.util.ArrayList;
public class ArrayListDemo6 {
    public static void main(String[] args){
        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(new BankAccount(1500));
        list.add(new BankAccount(500));
        list.add(new BankAccount(1400));
        for(int i = 0; i<list.size();i++){
            BankAccount account = list.get(i);
            System.out.println("Acount at index " + (i + 1) + "\nBalance: " + account.getBalance());
        }
    }
}
