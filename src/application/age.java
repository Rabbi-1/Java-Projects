package application;
import java.util.Scanner;
public class age {
    public static void main (String[]args){
        int age;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your age ");
        age = keyboard.nextInt();
        if (age >= 18){
            System.out.println("You can buy this product");
        }
        else {
            System.out.println("you are underage");
        }

    }
}
