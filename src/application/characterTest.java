package application;
import java.util.Scanner;
public class characterTest {
    public static void main(String[] args){
        char ch;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter any character.");
        ch = keyboard.next().charAt(0);
        if(Character.isLetter(ch)){
            System.out.println("Is a letter.");
        }
        if(Character.isDigit(ch)){
            System.out.println("is a number");
        }
        if (Character.isLowerCase(ch)){
            System.out.println("Lower case letter");
        }
        if (Character.isUpperCase(ch)){
            System.out.println("Upper case letter.");
        }
    }
}
