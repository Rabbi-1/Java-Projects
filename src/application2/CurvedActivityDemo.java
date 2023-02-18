package application2;
import model.CurvedActivity;

import java.util.Scanner;
public class CurvedActivityDemo {
    public static void main(String[] args){
        double score;
        double curvePercent;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the student's raw numeric score: ");
        score = keyboard.nextDouble();
        System.out.println("Enter the curve percentage: ");
        curvePercent = keyboard.nextDouble();
        CurvedActivity Exam = new CurvedActivity(curvePercent);
        Exam.setScore(score);
        System.out.println(Exam.getScore());
    }
}
