package application2;
import model.TestScoreReader;

import java.io.*;
public class TestAverage {
    public static void main(String[] args) throws IOException {
        double average;
        int studentNumber = 1;
        TestScoreReader scoreReader = new TestScoreReader("FIle");
        while(scoreReader.readNextLine()){
            average = scoreReader.getAverage();
            System.out.println("average is" + average);
            studentNumber++;
        }
        scoreReader.close();
        System.out.println("No more scores");
    }
}
