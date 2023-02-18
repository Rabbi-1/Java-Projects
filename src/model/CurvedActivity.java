package model;

public class CurvedActivity extends GradedActivity {
    double rawScore;
    double percent;
    public CurvedActivity(double percent){
        this.percent = percent;
        rawScore = 0.0;
    }
    public void setScore(double s){
        rawScore = s;
        super.setScore(rawScore * percent);
    }
    public double getRawScore(){
        return rawScore;
    }
    public double getPercent(){
        return percent;
    }
}
