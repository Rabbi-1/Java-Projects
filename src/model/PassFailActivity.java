package model;

public class PassFailActivity extends GradedActivity {
    private double minPassingScore;
    public PassFailActivity(double minPassingScore){
        this.minPassingScore = minPassingScore;
    }
    public char getGrade(){
        char letterGrade;
        if(super.getScore()>= minPassingScore)
            letterGrade = 'P';
        else
            letterGrade = 'F';
        return letterGrade;
    }
}
