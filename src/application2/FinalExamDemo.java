package application2;
import model.FinalExam;

import java.util.Scanner;
public class FinalExamDemo {
    public static void main(String[] args){
        int questions;
        int missed;
        String input;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many questions are on ur final?");
        questions = keyboard.nextInt();
        System.out.println("How many questions did the student miss?");
        missed = keyboard.nextInt();
        FinalExam exam = new FinalExam(questions, missed);
        System.out.println("Each question point: " + exam.getPointsEach() +
                "\nScore: " + exam.getScore() + "\nGrade: " + exam.getGrade());
    }
}
