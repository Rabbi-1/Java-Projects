package application;
import java.util.Scanner;
import java.io.*;
public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = keyboard.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext()){
            String friendName = inputFile.nextLine();
            System.out.println(friendName);
        }
        inputFile.close();
    }
}
