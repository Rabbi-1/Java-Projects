package model;

public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointEach;
    private int numMissed;
    public FinalExam(int questions, int missed){
        double numericScore;
        numMissed = missed;
        numQuestions = questions;
        pointEach = 100.0/questions;
        numericScore = 100.0 - (missed * pointEach);
        setScore(numericScore);
    }
    public double getPointsEach(){
        return pointEach;
    }
    public int getNumMissed(){
        return numMissed;
    }
}
