package application;
import java.util.Scanner;
public class NestedDecision {
    public static void main (String[]args){
        int testScore;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your numeric test score and I will tell you the grade: ");
        testScore = keyboard.nextInt();
        if ( testScore < 60){
            System.out.println("Your grade is F.");
        }
        else {
            if ( testScore < 70){
                System.out.println("Your grade is D.");
            }
            else {
                if (testScore < 80){
                    System.out.println("Your grade is B.");
                }
                else {
                    System.out.println("Your grade is A.");
                }
            }
        }
    }
}

