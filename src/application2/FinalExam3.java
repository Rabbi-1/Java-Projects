package application2;

import model.GradedActivity;
import model.Relatable;

public class FinalExam3 extends GradedActivity implements Relatable {
    private int numQuestions;
    private double pointEach;
    private int numMissed;
    public FinalExam3(int numQuestions, int numMissed){
        double numericScore;
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        pointEach = 100 / numQuestions;
        numericScore = 100 - (numMissed * pointEach);
        setScore(numericScore);
    }
    public double getPointEach(){
        return pointEach;
    }
    public int getNumMissed(){
        return numMissed;
    }
    public boolean equal(GradedActivity g){
        boolean status;
        if(this.getScore() == g.getScore())
            status = true;
        else
            status = false;
        return status;
    }
    public boolean isGreater(GradedActivity g){
        boolean status;
        if(this.getScore() > g.getScore())
            status = true;
        else
            status = false;
        return status;
    }
    public boolean isLess(GradedActivity g){
        boolean status;
        if(this.getScore() < g.getScore())
            status = true;
        else
            status = false;
        return status;
    }

}

