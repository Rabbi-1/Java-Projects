package application;
import java.util.Scanner;
public class DisplayTestScore {
    public static void main (String[] args){
        int numTests;
        int[] tests;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many tests do you have?");
        numTests = keyboard.nextInt();
        tests = new int[numTests];
        for (int index = 0; index < tests.length; index++){
            System.out.println("Emter test score " + (index + 1) + ": ");
            tests[index] = keyboard.nextInt();
        }
        System.out.println();
        System.out.println("Here are the scores you entered");
        for(int index = 0; index < tests.length; index++){
            System.out.print(tests[index] + ", ");
        }
    }
}
