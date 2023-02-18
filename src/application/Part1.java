package application;
import java.util.Scanner;
public class Part1 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = keyboard.nextInt();
        System.out.println("Input second number: ");
        int num2 = keyboard.nextInt();

        System.out.println(num1 + "x" + num2 + "=" + num1 * num2 );
    }
}
