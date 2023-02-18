package model;

public class Grader {
    private double[] testscores;
    public Grader(double[] scoreArray){
        testscores = scoreArray;
    }
    public double getLowestScore(){
        double lowest;
        lowest = testscores[0];
        for(int index = 1; index < testscores.length; index++){
            if(testscores[index] < lowest)
                lowest = testscores[index];
        }
        return lowest;
    }
    public double getAverage(){
        double total = 0;
        double lowest;
        double average;

        if(testscores.length < 2){
            System.out.println("ERROR");
            average = 0;
        }
        else{
            for(double score : testscores)
                total+=score;
            lowest = getLowestScore();
            total-= lowest;
            average = total / (testscores.length-1);
        }
        return average;
    }
}
