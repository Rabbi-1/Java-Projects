package application;
import java.util.Scanner;
import java.io.*;
public class FileSum {
    public static void main (String[] args) throws IOException {
        double sum = 0.0; //accumulator
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("What is the file name?");
        String filename = Keyboard.nextLine();
        File file = new File(filename);
        if (!file.exists()){
            System.out.println("The file is not found.");
            System.exit(0);
        }
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext()){
            double number = inputFile.nextDouble();
            sum = sum + number;
        }
        inputFile.close();
        System.out.println("The sum of the numbers in" + filename + "is" + sum);
    }
}
