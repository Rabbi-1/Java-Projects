package application;
import java.util.Scanner;
public class InputProblem {
    public static void main (String[] args){
        String name;
        int age, height;

        Scanner keyboard = new Scanner (System.in);
        System.out.print("What is your age?");
        age = keyboard.nextInt();
        System.out.println("What is your height?");
        height = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        System.out.println("Hello " + name + " Your age is " + age + " and your height is " + height + "inches");
    }
}
