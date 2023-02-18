package application;
import java.util.Scanner;
public class CreditCard {
    public static void main(String[]args){
        double salary;
        int creditRating;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your annual salary?");
        salary = keyboard.nextDouble();
        System.out.println("On a scale of 1 through 10, what is your credit rating?");
        creditRating = keyboard.nextInt();
        if (salary >= 20000 && creditRating >= 7)
            qualify();
        else{
            unqualified();
        }
    }
    public static void qualify(){
        System.out.println("You good");
    }
    public static void unqualified(){
        System.out.println("no good");
    }
}
