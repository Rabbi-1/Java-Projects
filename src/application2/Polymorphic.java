package application2;
import model.FinalExam;
import model.GradedActivity;
import model.PassFailExam;

import java.util.Scanner;
public class Polymorphic {
    public static void main(String[] args){
        int missed;
        int minpassing;
        int questions;
        int score;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("what'd u score?");
        score = keyboard.nextInt();
        System.out.println("How many questions?");
        questions = keyboard.nextInt();
        System.out.println("How many questions you missed?");
        missed = keyboard.nextInt();
        System.out.println("What is the minpassing score?");
        minpassing = keyboard.nextInt();
        GradedActivity[] tests = new GradedActivity[3];
        tests[0] = new GradedActivity();
        tests[0].setScore(score);
        tests[1] = new PassFailExam(questions, missed, minpassing);
        tests[2] = new FinalExam(questions, missed);
        for (int i = 0; i < tests.length; i++){
            System.out.println("Tests " + (i+1) + ": " + "score " + tests[i].getScore() +
                    ", grade " + tests[i].getGrade());
        }
    }
}
