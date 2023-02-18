package application;
import java.util.Scanner;
public class AverageScore {
    public static void main (String[] args){
        double score1;
        double score2;
        double score3;
        double average;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter score #1: ");
        score1 = keyboard.nextDouble();
        System.out.println("Enter score #2: ");
        score2 = keyboard.nextDouble();
        System.out.println("Enter score #3: ");
        score3 = keyboard.nextDouble();

        average = (score1 + score2 + score3) / 3.0;

        System.out.println("The average is " + average);

        if (average > 95){
            System.out.println("good score");
        }
        else {
            System.out.println("bad score");
        }

    }
}
