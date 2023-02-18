package application;
import java.util.Scanner;
import java.io.*;
public class ReadFirstLine {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of a file: ");
        String filename = keyboard.nextLine();

        //open the file
        File file = new File(filename);
        Scanner inputFile = new Scanner(filename);
        //read the first line from the file
        String line = inputFile.nextLine();
        //display the line
        System.out.print("The first line in the file is: ");
        System.out.println(line);

        //close the file
        inputFile.close();
    }
}
