package application;
import java.util.Scanner;
public class TralingElse {
    public static void main (String[] args){
        int tesScore;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your numeric test score and I will tell you the grade: ");
        tesScore = keyboard.nextInt();
        if (tesScore < 60)
            System.out.println("You grade is a F.");
        else if (tesScore < 70)
            System.out.println("Your grade is a D");
        else if (tesScore < 80)
            System.out.println("Your grade is C");
        else if (tesScore < 90)
            System.out.println("Your grade is B");
        else if (tesScore <= 100)
            System.out.println(" Your grade is A");
        else
            System.out.println("invalid score.");




    }
}
