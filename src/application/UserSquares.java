package application;
import java.util.Scanner;
public class UserSquares {
    public static void main(String[] args){
        int number;
        int maxValue;
        System.out.println("I will display a table of number and their square.");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How high should I go?");
        maxValue = keyboard.nextInt();
        System.out.println("Number          Number Squared");
        System.out.println("--------------------------------");
        for (number = 1; number <= maxValue; number++){
            System.out.println(number + "\t\t" + number * number);
        }
    }
}
