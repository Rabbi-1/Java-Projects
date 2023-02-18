package application;
import java.util.Scanner;
public class SecretCode {
    public static void main(String[] args){
        String input;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the secret code: ");
        input = keyboard.nextLine();
        if (input.equalsIgnoreCase("LOL")){
            System.out.println("You know the code");
        }
        else {
            System.out.println("you dont know the code.");
        }
    }
}
