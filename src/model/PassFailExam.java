package model;

public class PassFailExam extends PassFailActivity{
    private int numQuestions;
    private double pointEach;
    private int numMissed;

    public PassFailExam(int numQuestions, int numMissed, double minPassing){
        super(minPassing);
        double numericScore;
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        pointEach = 100.0/ numQuestions;
        numericScore = 100.0 - (numMissed * pointEach);
        setScore(numericScore);
    }
    public double getPointEach(){
        return pointEach;
    }
    public int getNumMissed(){
        return numMissed;
    }
}
