package application2;
import model.Grader;

import java.util.Scanner;
public class CalcAverage {
    public static void main(String[] args) {
        int numScore;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many score?");
        numScore = keyboard.nextInt();
        double[] scores = new double[numScore];
        for (int index = 0; index < numScore; index++) {
            System.out.println("Enter score#" + (index + 1) + ": ");
            scores[index] = keyboard.nextDouble();
        }
        Grader grade = new Grader(scores);
        System.out.println("Average: " + grade.getAverage());
        System.out.println("Lowest: " + grade.getLowestScore());
    }
}
