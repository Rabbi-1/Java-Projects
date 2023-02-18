package application2;
import model.Telephone;

import java.util.Scanner;
public class TelephoneDemo {
    public static void main(String[] args){
        String phone;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your phone number.");
        phone = keyboard.nextLine();
        String propernum = Telephone.format(phone);
        System.out.println(propernum);
    }
}
